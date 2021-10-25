
package org.arnotec.stub;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.arnotec.stub package. 
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

    private final static QName _GetAccount_QNAME = new QName("http://ws.arnotec.org/", "getAccount");
    private final static QName _ListAccountResponse_QNAME = new QName("http://ws.arnotec.org/", "listAccountResponse");
    private final static QName _ListAccount_QNAME = new QName("http://ws.arnotec.org/", "listAccount");
    private final static QName _Account_QNAME = new QName("http://ws.arnotec.org/", "account");
    private final static QName _GetAccountResponse_QNAME = new QName("http://ws.arnotec.org/", "getAccountResponse");
    private final static QName _ConversionEuroToFCFAResponse_QNAME = new QName("http://ws.arnotec.org/", "conversionEuroToFCFAResponse");
    private final static QName _ConversionEuroToFCFA_QNAME = new QName("http://ws.arnotec.org/", "conversionEuroToFCFA");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.arnotec.stub
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListAccount }
     * 
     */
    public ListAccount createListAccount() {
        return new ListAccount();
    }

    /**
     * Create an instance of {@link ListAccountResponse }
     * 
     */
    public ListAccountResponse createListAccountResponse() {
        return new ListAccountResponse();
    }

    /**
     * Create an instance of {@link GetAccount }
     * 
     */
    public GetAccount createGetAccount() {
        return new GetAccount();
    }

    /**
     * Create an instance of {@link ConversionEuroToFCFA }
     * 
     */
    public ConversionEuroToFCFA createConversionEuroToFCFA() {
        return new ConversionEuroToFCFA();
    }

    /**
     * Create an instance of {@link ConversionEuroToFCFAResponse }
     * 
     */
    public ConversionEuroToFCFAResponse createConversionEuroToFCFAResponse() {
        return new ConversionEuroToFCFAResponse();
    }

    /**
     * Create an instance of {@link GetAccountResponse }
     * 
     */
    public GetAccountResponse createGetAccountResponse() {
        return new GetAccountResponse();
    }

    /**
     * Create an instance of {@link Account }
     * 
     */
    public Account createAccount() {
        return new Account();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.arnotec.org/", name = "getAccount")
    public JAXBElement<GetAccount> createGetAccount(GetAccount value) {
        return new JAXBElement<GetAccount>(_GetAccount_QNAME, GetAccount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListAccountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.arnotec.org/", name = "listAccountResponse")
    public JAXBElement<ListAccountResponse> createListAccountResponse(ListAccountResponse value) {
        return new JAXBElement<ListAccountResponse>(_ListAccountResponse_QNAME, ListAccountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListAccount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.arnotec.org/", name = "listAccount")
    public JAXBElement<ListAccount> createListAccount(ListAccount value) {
        return new JAXBElement<ListAccount>(_ListAccount_QNAME, ListAccount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Account }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.arnotec.org/", name = "account")
    public JAXBElement<Account> createAccount(Account value) {
        return new JAXBElement<Account>(_Account_QNAME, Account.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.arnotec.org/", name = "getAccountResponse")
    public JAXBElement<GetAccountResponse> createGetAccountResponse(GetAccountResponse value) {
        return new JAXBElement<GetAccountResponse>(_GetAccountResponse_QNAME, GetAccountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionEuroToFCFAResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.arnotec.org/", name = "conversionEuroToFCFAResponse")
    public JAXBElement<ConversionEuroToFCFAResponse> createConversionEuroToFCFAResponse(ConversionEuroToFCFAResponse value) {
        return new JAXBElement<ConversionEuroToFCFAResponse>(_ConversionEuroToFCFAResponse_QNAME, ConversionEuroToFCFAResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionEuroToFCFA }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.arnotec.org/", name = "conversionEuroToFCFA")
    public JAXBElement<ConversionEuroToFCFA> createConversionEuroToFCFA(ConversionEuroToFCFA value) {
        return new JAXBElement<ConversionEuroToFCFA>(_ConversionEuroToFCFA_QNAME, ConversionEuroToFCFA.class, null, value);
    }

}
