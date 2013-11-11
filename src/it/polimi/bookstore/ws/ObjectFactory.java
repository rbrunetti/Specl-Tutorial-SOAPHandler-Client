
package it.polimi.bookstore.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the it.polimi.bookstore.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetBookByIsbn_QNAME = new QName("http://ws.bookstore.polimi.it/", "getBookByIsbn");
    private final static QName _GetBooksByAuthorResponse_QNAME = new QName("http://ws.bookstore.polimi.it/", "getBooksByAuthorResponse");
    private final static QName _GetAllBooksTitleResponse_QNAME = new QName("http://ws.bookstore.polimi.it/", "getAllBooksTitleResponse");
    private final static QName _GetBooksNumberPerAuthorResponse_QNAME = new QName("http://ws.bookstore.polimi.it/", "getBooksNumberPerAuthorResponse");
    private final static QName _GetBooksByIsbnList_QNAME = new QName("http://ws.bookstore.polimi.it/", "getBooksByIsbnList");
    private final static QName _GetBooksByIsbnListResponse_QNAME = new QName("http://ws.bookstore.polimi.it/", "getBooksByIsbnListResponse");
    private final static QName _GetAllBooksTitle_QNAME = new QName("http://ws.bookstore.polimi.it/", "getAllBooksTitle");
    private final static QName _GetBooksByAuthor_QNAME = new QName("http://ws.bookstore.polimi.it/", "getBooksByAuthor");
    private final static QName _GetBooksNumberPerAuthor_QNAME = new QName("http://ws.bookstore.polimi.it/", "getBooksNumberPerAuthor");
    private final static QName _GetBookByIsbnResponse_QNAME = new QName("http://ws.bookstore.polimi.it/", "getBookByIsbnResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.polimi.bookstore.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FastHashMap }
     * 
     */
    public FastHashMap createFastHashMap() {
        return new FastHashMap();
    }

    /**
     * Create an instance of {@link FastHashMap.Map }
     * 
     */
    public FastHashMap.Map createFastHashMapMap() {
        return new FastHashMap.Map();
    }

    /**
     * Create an instance of {@link GetBooksByIsbnList }
     * 
     */
    public GetBooksByIsbnList createGetBooksByIsbnList() {
        return new GetBooksByIsbnList();
    }

    /**
     * Create an instance of {@link GetBooksNumberPerAuthorResponse }
     * 
     */
    public GetBooksNumberPerAuthorResponse createGetBooksNumberPerAuthorResponse() {
        return new GetBooksNumberPerAuthorResponse();
    }

    /**
     * Create an instance of {@link GetAllBooksTitleResponse }
     * 
     */
    public GetAllBooksTitleResponse createGetAllBooksTitleResponse() {
        return new GetAllBooksTitleResponse();
    }

    /**
     * Create an instance of {@link GetBooksByAuthorResponse }
     * 
     */
    public GetBooksByAuthorResponse createGetBooksByAuthorResponse() {
        return new GetBooksByAuthorResponse();
    }

    /**
     * Create an instance of {@link GetBookByIsbn }
     * 
     */
    public GetBookByIsbn createGetBookByIsbn() {
        return new GetBookByIsbn();
    }

    /**
     * Create an instance of {@link GetBookByIsbnResponse }
     * 
     */
    public GetBookByIsbnResponse createGetBookByIsbnResponse() {
        return new GetBookByIsbnResponse();
    }

    /**
     * Create an instance of {@link GetBooksNumberPerAuthor }
     * 
     */
    public GetBooksNumberPerAuthor createGetBooksNumberPerAuthor() {
        return new GetBooksNumberPerAuthor();
    }

    /**
     * Create an instance of {@link GetBooksByAuthor }
     * 
     */
    public GetBooksByAuthor createGetBooksByAuthor() {
        return new GetBooksByAuthor();
    }

    /**
     * Create an instance of {@link GetAllBooksTitle }
     * 
     */
    public GetAllBooksTitle createGetAllBooksTitle() {
        return new GetAllBooksTitle();
    }

    /**
     * Create an instance of {@link GetBooksByIsbnListResponse }
     * 
     */
    public GetBooksByIsbnListResponse createGetBooksByIsbnListResponse() {
        return new GetBooksByIsbnListResponse();
    }

    /**
     * Create an instance of {@link FastHashMap.Map.Entry }
     * 
     */
    public FastHashMap.Map.Entry createFastHashMapMapEntry() {
        return new FastHashMap.Map.Entry();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBookByIsbn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.bookstore.polimi.it/", name = "getBookByIsbn")
    public JAXBElement<GetBookByIsbn> createGetBookByIsbn(GetBookByIsbn value) {
        return new JAXBElement<GetBookByIsbn>(_GetBookByIsbn_QNAME, GetBookByIsbn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBooksByAuthorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.bookstore.polimi.it/", name = "getBooksByAuthorResponse")
    public JAXBElement<GetBooksByAuthorResponse> createGetBooksByAuthorResponse(GetBooksByAuthorResponse value) {
        return new JAXBElement<GetBooksByAuthorResponse>(_GetBooksByAuthorResponse_QNAME, GetBooksByAuthorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllBooksTitleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.bookstore.polimi.it/", name = "getAllBooksTitleResponse")
    public JAXBElement<GetAllBooksTitleResponse> createGetAllBooksTitleResponse(GetAllBooksTitleResponse value) {
        return new JAXBElement<GetAllBooksTitleResponse>(_GetAllBooksTitleResponse_QNAME, GetAllBooksTitleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBooksNumberPerAuthorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.bookstore.polimi.it/", name = "getBooksNumberPerAuthorResponse")
    public JAXBElement<GetBooksNumberPerAuthorResponse> createGetBooksNumberPerAuthorResponse(GetBooksNumberPerAuthorResponse value) {
        return new JAXBElement<GetBooksNumberPerAuthorResponse>(_GetBooksNumberPerAuthorResponse_QNAME, GetBooksNumberPerAuthorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBooksByIsbnList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.bookstore.polimi.it/", name = "getBooksByIsbnList")
    public JAXBElement<GetBooksByIsbnList> createGetBooksByIsbnList(GetBooksByIsbnList value) {
        return new JAXBElement<GetBooksByIsbnList>(_GetBooksByIsbnList_QNAME, GetBooksByIsbnList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBooksByIsbnListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.bookstore.polimi.it/", name = "getBooksByIsbnListResponse")
    public JAXBElement<GetBooksByIsbnListResponse> createGetBooksByIsbnListResponse(GetBooksByIsbnListResponse value) {
        return new JAXBElement<GetBooksByIsbnListResponse>(_GetBooksByIsbnListResponse_QNAME, GetBooksByIsbnListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllBooksTitle }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.bookstore.polimi.it/", name = "getAllBooksTitle")
    public JAXBElement<GetAllBooksTitle> createGetAllBooksTitle(GetAllBooksTitle value) {
        return new JAXBElement<GetAllBooksTitle>(_GetAllBooksTitle_QNAME, GetAllBooksTitle.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBooksByAuthor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.bookstore.polimi.it/", name = "getBooksByAuthor")
    public JAXBElement<GetBooksByAuthor> createGetBooksByAuthor(GetBooksByAuthor value) {
        return new JAXBElement<GetBooksByAuthor>(_GetBooksByAuthor_QNAME, GetBooksByAuthor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBooksNumberPerAuthor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.bookstore.polimi.it/", name = "getBooksNumberPerAuthor")
    public JAXBElement<GetBooksNumberPerAuthor> createGetBooksNumberPerAuthor(GetBooksNumberPerAuthor value) {
        return new JAXBElement<GetBooksNumberPerAuthor>(_GetBooksNumberPerAuthor_QNAME, GetBooksNumberPerAuthor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBookByIsbnResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.bookstore.polimi.it/", name = "getBookByIsbnResponse")
    public JAXBElement<GetBookByIsbnResponse> createGetBookByIsbnResponse(GetBookByIsbnResponse value) {
        return new JAXBElement<GetBookByIsbnResponse>(_GetBookByIsbnResponse_QNAME, GetBookByIsbnResponse.class, null, value);
    }

}
