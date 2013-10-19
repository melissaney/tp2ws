package tp2ws;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import tp2ws.HelloWorld;

public class ClientWS {
	/**
     * Exemple de Client WS sur un hello world
     */
    public static void main(String[] args) {
            // Création de la factory de bean
            JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
            // Définition de la classe de service
            factory.setServiceClass(HelloWorld.class);
            // Adresse du service
            factory.setAddress("http://localhost:9001/helloWorld");
            // Création du Proxy client
            HelloWorld client = (HelloWorld) factory.create();
            // Appel du service
            String reply = client.sayHi("Hi");
            System.out.println("Server said: " + reply);
            // sortie du programme
            System.exit(0);
    }
}

