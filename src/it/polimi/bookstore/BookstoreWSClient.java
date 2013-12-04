package it.polimi.bookstore;

import it.polimi.bookstore.ws.HashMapWrapper;
import it.polimi.bookstore.ws.ServerInfoImpl;
import it.polimi.bookstore.ws.ServerInfoImplService;

import java.util.ArrayList;

import javax.xml.ws.soap.SOAPFaultException;

public class BookstoreWSClient {
	
	private static ServerInfoImplService service;
	private static ServerInfoImpl ws;
	
	@SuppressWarnings("serial")
	public static void main(String[] args) {
		service = new ServerInfoImplService();
		ws = service.getServerInfoImplPort();
				
		testGetBooksByAuthor("Larry Niven");
		testgetBookByIsbn("0871131811");
		testGetAllBooksTitle();
		testGetBooksByIsbnList(new ArrayList<String>() {
			{
				add("0553380981");
				add("0871131811");
				add("012345678"); // note, this is wrong
			}
		});
		testGetBooksNumberPerAuthor();
		getBooksByPublisherAndYearRange("Spectra", 1990, 2013);
		
	}

	private static void testGetBooksByAuthor(String author) {
		try {
			System.out.println("testGetBooksByAuthor: " + ws.getBooksByAuthor(author));
		} catch (SOAPFaultException e) {
			System.err.println("testGetBooksByAuthor: " + e.getMessage());
		}
	}

	private static void testgetBookByIsbn(String isbn) {
		try {
			System.out.println("testgetBookByIsbn: " + ws.getBookByIsbn(isbn));
		} catch (SOAPFaultException e) {
			System.err.println("testgetBookByIsbn: " + e.getMessage());
		}
	}

	private static void testGetAllBooksTitle() {
		try {
			System.out.println("testGetAllBooksTitle: " + ws.getAllBooksTitle());
		} catch (SOAPFaultException e) {
			System.err.println("testGetAllBooksTitle: " + e.getMessage());
		}
		
	}

	public static void testGetBooksByIsbnList(ArrayList<String> isbns) {
		try {
			System.out.println("testGetBooksByIsbnList: " + ws.getBooksByIsbnList(isbns));
		} catch (SOAPFaultException e) {
			System.err.println("testGetBooksByIsbnList: " + e.getMessage());
		}
	}
	
	private static void testGetBooksNumberPerAuthor() {
		HashMapWrapper bnpa = ws.getBooksNumberPerAuthor();
		System.out.println("getBooksNumberPerAuthor() - Trendy Author Books Number: " + bnpa.getMap().getEntry().get(0).getValue());
	}
	
	private static void getBooksByPublisherAndYearRange(String publisher, int startY, int endY) {
		try {
			System.out.println("getBooksByPublisherAndYearRange: " + ws.getBooksByPublisherAndYearRange(publisher, startY, endY));
		} catch (SOAPFaultException e) {
			System.err.println("getBooksByPublisherAndYearRange: " + e.getMessage());
		}
	}

}
