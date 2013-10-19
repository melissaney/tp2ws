package tp2ws;

import javax.xml.ws.Endpoint;

public class main {
        public static void main(String[] args) {
                System.out.println("Starting Server");
                HelloWorldImpl implementor = new HelloWorldImpl();
                String address = "http://localhost:9001/helloWorld";
                Endpoint.publish(address, implementor);
                System.out.println("Server started");
        }
}
