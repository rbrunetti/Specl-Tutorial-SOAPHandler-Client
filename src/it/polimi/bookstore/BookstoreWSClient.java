package it.polimi.bookstore;

import java.util.ArrayList;
import java.util.List;

import javax.xml.ws.soap.SOAPFaultException;

import it.polimi.bookstore.ws.HashMapWrapper;
import it.polimi.bookstore.ws.ServerInfoImpl;
import it.polimi.bookstore.ws.ServerInfoImplService;

public class BookstoreWSClient {
	
	private static ServerInfoImplService service;
	private static ServerInfoImpl ws;
	
	public static void main(String[] args) {
		service = new ServerInfoImplService();
		ws = service.getServerInfoImplPort();
				
		testGetBooksByIsbnList();
		testGetBooksNumberPerAuthor();
		
	}
	
	public static void testGetBooksByIsbnList() {
		List<String> isbns = new ArrayList<>();
		isbns.add("0553380981");
		isbns.add("0871131811");
        isbns.add("012345678"); // a wrong isbn
		
		try {
			System.out.println(ws.getBooksByIsbnList(isbns));
		} catch (SOAPFaultException e) {
			System.err.println("testGetBooksByIsbnList(): " + e.getMessage());
		}
	}
	
	public static void testGetBooksNumberPerAuthor() {
		HashMapWrapper bnpa = ws.getBooksNumberPerAuthor();
		System.out.println("getBooksNumberPerAuthor() - Trendy Author Books Number: " + bnpa.getMap().getEntry().get(0).getValue());
	}

}
