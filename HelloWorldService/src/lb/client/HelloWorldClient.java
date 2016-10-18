package lb.client;



import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import lb.generated.client.HelloWorld;

public class HelloWorldClient{

	public static void main(String[] args) throws Exception {

	URL url = new URL("http://localhost:9999/ws/hello?wsdl");
        QName qname = new QName("http://ws.lb/", "HelloWorldImplService");

        Service service = Service.create(url, qname);

        HelloWorld hello = service.getPort(HelloWorld.class);

         System.out.println(hello.getHelloWorldAsString("anonymous"));

    }
}