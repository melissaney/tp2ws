package tp2ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.naming.spi.ObjectFactory;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

@WebService(targetNamespace = "http://tempuri.org/NumberService", name = "MathServiceSoap")
@XmlSeeAlso({ObjectFactory.class})

public interface MathServiceSoap {
	@WebResult(name = "AddNumbersResult", targetNamespace = "http://tempuri.org/NumberService")
    @RequestWrapper(localName = "AddNumbers", targetNamespace = "http://tempuri.org/NumberService", className = "gla_tp2_ws.AddNumbers")
    @WebMethod(operationName = "AddNumbers", action = "http://tempuri.org/NumberService/AddNumbers")
    @ResponseWrapper(localName = "AddNumbersResponse", targetNamespace = "http://tempuri.org/NumberService", className = "gla_tp2_ws.AddNumbersResponse")
    public int addNumbers(
        @WebParam(name = "number1", targetNamespace = "http://tempuri.org/NumberService")
        int number1,
        @WebParam(name = "number2", targetNamespace = "http://tempuri.org/NumberService")
        int number2
    );

    @WebResult(name = "SubtractNumbersResult", targetNamespace = "http://tempuri.org/NumberService")
    @RequestWrapper(localName = "SubtractNumbers", targetNamespace = "http://tempuri.org/NumberService", className = "gla_tp2_ws.SubtractNumbers")
    @WebMethod(operationName = "SubtractNumbers", action = "http://tempuri.org/NumberService/SubtractNumbers")
    @ResponseWrapper(localName = "SubtractNumbersResponse", targetNamespace = "http://tempuri.org/NumberService", className = "gla_tp2_ws.SubtractNumbersResponse")
    public int subtractNumbers(
        @WebParam(name = "number1", targetNamespace = "http://tempuri.org/NumberService")
        int number1,
        @WebParam(name = "number2", targetNamespace = "http://tempuri.org/NumberService")
        int number2
    );
}
