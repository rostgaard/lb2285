package lb.ws.publisher;

import javax.xml.ws.Endpoint;

import lb.ws.HelloWorldImpl;

//End-point publisher
public class HelloWorldPublisher{

	public static void main(String[] args) {
	   Endpoint.publish("http://localhost:9999/ws/hello", new HelloWorldImpl());
    }

}