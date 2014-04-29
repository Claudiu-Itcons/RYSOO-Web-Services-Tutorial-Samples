
package abx.ws;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "abxWsGestService", targetNamespace = "http://ws.abx/", wsdlLocation = "http://iabx000002.iabx.net/abxWsGestService/abxWsGest?wsdl")
public class AbxWsGestService
    extends Service
{

    private final static URL ABXWSGESTSERVICE_WSDL_LOCATION;
    private final static WebServiceException ABXWSGESTSERVICE_EXCEPTION;
    private final static QName ABXWSGESTSERVICE_QNAME = new QName("http://ws.abx/", "abxWsGestService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://iabx000002.iabx.net/abxWsGestService/abxWsGest?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ABXWSGESTSERVICE_WSDL_LOCATION = url;
        ABXWSGESTSERVICE_EXCEPTION = e;
    }

    public AbxWsGestService() {
        super(__getWsdlLocation(), ABXWSGESTSERVICE_QNAME);
    }

    public AbxWsGestService(WebServiceFeature... features) {
        super(__getWsdlLocation(), ABXWSGESTSERVICE_QNAME, features);
    }

    public AbxWsGestService(URL wsdlLocation) {
        super(wsdlLocation, ABXWSGESTSERVICE_QNAME);
    }

    public AbxWsGestService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ABXWSGESTSERVICE_QNAME, features);
    }

    public AbxWsGestService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AbxWsGestService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns AbxWsGest
     */
    @WebEndpoint(name = "abxWsGestPort")
    public AbxWsGest getAbxWsGestPort() {
        return super.getPort(new QName("http://ws.abx/", "abxWsGestPort"), AbxWsGest.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AbxWsGest
     */
    @WebEndpoint(name = "abxWsGestPort")
    public AbxWsGest getAbxWsGestPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.abx/", "abxWsGestPort"), AbxWsGest.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ABXWSGESTSERVICE_EXCEPTION!= null) {
            throw ABXWSGESTSERVICE_EXCEPTION;
        }
        return ABXWSGESTSERVICE_WSDL_LOCATION;
    }

}