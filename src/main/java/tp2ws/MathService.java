package tp2ws;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

@WebServiceClient(name = "MathService",
wsdlLocation = "http://88.190.234.41:8080/TestWebServices1.asmx?wsdl",
targetNamespace = "http://tempuri.org/NumberService") 

public class MathService extends Service {
	protected MathService(URL wsdlDocumentLocation, QName serviceName) {
		super(wsdlDocumentLocation, serviceName);
		// TODO Auto-generated constructor stub
	}

	public final static URL WSDL_LOCATION;
    public final static QName SERVICE = new QName("http://tempuri.org/NumberService", "MathService");
    public final static QName MathServiceHttpGet = new QName("http://tempuri.org/NumberService", "MathServiceHttpGet");
    public final static QName MathServiceHttpPost = new QName("http://tempuri.org/NumberService", "MathServiceHttpPost");
    public final static QName MathServiceSoap = new QName("http://tempuri.org/NumberService", "MathServiceSoap");
    

    static {
    	URL wsdlURL = null;
    	try {
    		wsdlURL = new URL("http://88.190.234.41:8080/TestWebServices1.asmx?wsdl");
    	} catch (MalformedURLException e) {
    		java.util.logging.Logger.getLogger(MathService.class.getName())
            .log(java.util.logging.Level.INFO,
                 "Can not initialize the default wsdl from {0}", "http://88.190.234.41:8080/TestWebServices1.asmx?wsdl");
    		}
    		WSDL_LOCATION = wsdlURL;
    }

    @WebEndpoint(name = "MathServiceHttpGet")
	public MathServiceHttpGet getMathServiceHttpGet() {
	    return super.getPort(MathServiceHttpGet, MathServiceHttpGet.class);
	}
	
	@WebEndpoint(name = "MathServiceHttpGet")
	public MathServiceHttpGet getMathServiceHttpGet(WebServiceFeature... features) {
	    return super.getPort(MathServiceHttpGet, MathServiceHttpGet.class, features);
	}
	
    @WebEndpoint(name = "MathServiceHttpPost")
    public MathServiceHttpPost getMathServiceHttpPost() {
    	return super.getPort(MathServiceHttpPost, MathServiceHttpPost.class);
    }

   
    @WebEndpoint(name = "MathServiceHttpPost")
    public MathServiceHttpPost getMathServiceHttpPost(WebServiceFeature... features) {
    	return super.getPort(MathServiceHttpPost, MathServiceHttpPost.class, features);
    }
    
	@WebEndpoint(name = "MathServiceSoap")
	public MathServiceSoap getMathServiceSoap() {
	    return super.getPort(MathServiceSoap, MathServiceSoap.class);
	}
	
	@WebEndpoint(name = "MathServiceSoap")
	public MathServiceSoap getMathServiceSoap(WebServiceFeature... features) {
	    return super.getPort(MathServiceSoap, MathServiceSoap.class, features);
	}

	
}