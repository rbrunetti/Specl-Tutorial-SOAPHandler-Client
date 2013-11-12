package it.polimi.bookstore.handler;

import it.polimi.wscol.WSCoLAnalyzer;
import it.polimi.wscol.helpers.WSCoLException;

import java.io.IOException;
import java.util.Set;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPFault;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;
import javax.xml.ws.soap.SOAPFaultException;

import org.w3c.dom.Node;

public class PostValidationHandler implements SOAPHandler<SOAPMessageContext> {
	
	@Override
	public boolean handleMessage(SOAPMessageContext context) {

		System.out.println("Client : handleMessage()......");
		
		Boolean isRequest = (Boolean) context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);

		if (!isRequest) {

			WSCoLAnalyzer analyzer = new WSCoLAnalyzer();
			analyzer.shutdownLogger();

			try {
				SOAPMessage soapMsg = context.getMessage();
				SOAPBody soapBody = soapMsg.getSOAPBody();
				Node responseNode = soapBody.getFirstChild();
				String name = responseNode.getLocalName();
				if (name.equals("getBooksNumberPerAuthorResponse")) {
					
					analyzer.setXMLInput(soapBody.getOwnerDocument());
					
					String assertion = 
							  "let $map_entries = /Envelope/Body/getBooksNumberPerAuthorResponse/return/map;"
							+ "let $values = $map_entries/entry/value;"
							+ "let $maximum = max($num in $values, $num > 0);"
							+ "let $author = $map_entries/entry[value==$maximum]/key;"
							+ "1==1;"; // we're interested in variables
					
					try {
						analyzer.evaluate(assertion);
						Object author = analyzer.getVariable("$author");
						
						Node map = soapBody.getFirstChild().getFirstChild().getFirstChild();
						for(int i=0; i < map.getChildNodes().getLength(); i++){
							Node child = map.getChildNodes().item(i);
							if(!child.getFirstChild().getTextContent().equals(author)){
								map.removeChild(child);
								i -= 1;
							}
						}
					} catch (WSCoLException e) {
						generateSOAPErrMessage(soapMsg, "Errors while check post-conditions");
					}
				
				}
				// tracking
				soapMsg.writeTo(System.out);

			} catch (SOAPException e) {
				System.err.println(e);
			} catch (IOException e) {
				System.err.println(e);
			}

		}
		return true;
	}

	@Override
	public boolean handleFault(SOAPMessageContext context) {
		System.out.println("Client : handleFault()......");
		return true;
	}

	@Override
	public void close(MessageContext context) {
		System.out.println("Client : close()......");
	}

	@Override
	public Set<QName> getHeaders() {
		System.out.println("Client : getHeaders()......");
		return null;
	}

	private void generateSOAPErrMessage(SOAPMessage msg, String reason) {
		try {
			SOAPBody soapBody = msg.getSOAPPart().getEnvelope().getBody();
			SOAPFault soapFault = soapBody.addFault();
			soapFault.setFaultString(reason);
			throw new SOAPFaultException(soapFault);
		} catch (SOAPException e) {
		}
	}

}
