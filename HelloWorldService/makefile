
# Generates a .wsdl file from a specific class in a package. In this case, it is the lb.ws.HelloWorldImpl class
# that is used
generate_wsdl: resources
	wsgen -Xnocompile -verbose -cp build/classes lb.ws.HelloWorldImpl -d resources -wsdl

# Generates java sources needed to build a JAX-WS client and puts them in package lb.generated.client
generate_client: generate_wsdl
	wsimport -verbose -Xnocompile -p lb.generated.client -d src resources/HelloWorldImplService.wsdl

# Create folder "resources" if it does not exist.
resources:
	-mkdir resources
