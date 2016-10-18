package lb.ws;

import javax.jws.WebService;

//Service Implementation
@WebService(endpointInterface = "lb.ws.HelloWorld")
public class HelloWorldImpl implements HelloWorld{

	@Override

	public String getHelloWorldAsString(String name) {
		return "Hello " + name + " from JAX-WS";
	}

}