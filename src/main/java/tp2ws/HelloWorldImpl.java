package tp2ws;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.jws.WebService;

@SuppressWarnings("unused")
@WebService(endpointInterface = "tp2ws.HelloWorld", serviceName = "HelloWorld")
public class HelloWorldImpl implements HelloWorld {

        public String sayHi(String text) {
                System.out.println("sayHi called");
                return "Hello " + text;
        }
}