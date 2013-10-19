package tp2ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.naming.spi.ObjectFactory;
import javax.xml.bind.annotation.XmlSeeAlso;

@WebService(targetNamespace = "http://tempuri.org/NumberService", name = "MathServiceHttpGet")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)

public interface MathServiceHttpGet {
	@WebResult(name = "int", targetNamespace = "http://tempuri.org/NumberService", partName = "Body")
    @WebMethod(operationName = "AddNumbers")
    public int addNumbers(
        @WebParam(partName = "number1", name = "number1", targetNamespace = "http://tempuri.org/NumberService")
        int number1,
        @WebParam(partName = "number2", name = "number2", targetNamespace = "http://tempuri.org/NumberService")
        int number2
    );

    @WebResult(name = "int", targetNamespace = "http://tempuri.org/NumberService", partName = "Body")
    @WebMethod(operationName = "SubtractNumbers")
    public int subtractNumbers(
        @WebParam(partName = "number1", name = "number1", targetNamespace = "http://tempuri.org/NumberService")
        int number1,
        @WebParam(partName = "number2", name = "number2", targetNamespace = "http://tempuri.org/NumberService")
        int number2
    );
}
