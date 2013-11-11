package it.polimi.bookstore;

import java.util.ArrayList;
import java.util.List;

import javax.jws.HandlerChain;
import javax.xml.ws.soap.SOAPFaultException;

import it.polimi.bookstore.ws.FastHashMap;
import it.polimi.bookstore.ws.ServerInfoImpl;
import it.polimi.bookstore.ws.ServerInfoImplService;

public class TestClient {
	
	private static ServerInfoImplService service;
	private static ServerInfoImpl ws;
	
	public static void main(String[] args) {
		service = new ServerInfoImplService();
		ws = service.getServerInfoImplPort();
				
		testGetBooksByIsbnList();
		
		System.err.println("getBooksNumberPerAuthor() - Trendy Author Books Number: " + ws.getBooksNumberPerAuthor().getMap().getEntry().get(0).getValue());
	}
	
	public static void testGetBooksByIsbnList() {
		List<String> isbns = new ArrayList<>();
		isbns.add("0553380981");
		isbns.add("0871131811");
		
		try {
			System.err.println(ws.getBooksByIsbnList(isbns));
		} catch (SOAPFaultException e) {
			System.err.println("testGetBooksByIsbnList(): " + e.getMessage());
		}
	}

}
