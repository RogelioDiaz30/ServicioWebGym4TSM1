
package cliente;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * Sumadora
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ServicioNet", targetNamespace = "http://localhost/ServicioNet", wsdlLocation = "https://localhost:44318/WebService1.asmx?WSDL")
public class ServicioNet
    extends Service
{

    private final static URL SERVICIONET_WSDL_LOCATION;
    private final static WebServiceException SERVICIONET_EXCEPTION;
    private final static QName SERVICIONET_QNAME = new QName("http://localhost/ServicioNet", "ServicioNet");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://localhost:44318/WebService1.asmx?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SERVICIONET_WSDL_LOCATION = url;
        SERVICIONET_EXCEPTION = e;
    }

    public ServicioNet() {
        super(__getWsdlLocation(), SERVICIONET_QNAME);
    }

    public ServicioNet(WebServiceFeature... features) {
        super(__getWsdlLocation(), SERVICIONET_QNAME, features);
    }

    public ServicioNet(URL wsdlLocation) {
        super(wsdlLocation, SERVICIONET_QNAME);
    }

    public ServicioNet(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SERVICIONET_QNAME, features);
    }

    public ServicioNet(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ServicioNet(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ServicioNetSoap
     */
    @WebEndpoint(name = "ServicioNetSoap")
    public ServicioNetSoap getServicioNetSoap() {
        return super.getPort(new QName("http://localhost/ServicioNet", "ServicioNetSoap"), ServicioNetSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ServicioNetSoap
     */
    @WebEndpoint(name = "ServicioNetSoap")
    public ServicioNetSoap getServicioNetSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://localhost/ServicioNet", "ServicioNetSoap"), ServicioNetSoap.class, features);
    }

    /**
     * 
     * @return
     *     returns ServicioNetSoap
     */
    @WebEndpoint(name = "ServicioNetSoap12")
    public ServicioNetSoap getServicioNetSoap12() {
        return super.getPort(new QName("http://localhost/ServicioNet", "ServicioNetSoap12"), ServicioNetSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ServicioNetSoap
     */
    @WebEndpoint(name = "ServicioNetSoap12")
    public ServicioNetSoap getServicioNetSoap12(WebServiceFeature... features) {
        return super.getPort(new QName("http://localhost/ServicioNet", "ServicioNetSoap12"), ServicioNetSoap.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SERVICIONET_EXCEPTION!= null) {
            throw SERVICIONET_EXCEPTION;
        }
        return SERVICIONET_WSDL_LOCATION;
    }

}