package server;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.server.PropertyHandlerMapping;
import org.apache.xmlrpc.webserver.WebServer;

import java.io.IOException;

public class RPCserver {
    public static void main(String[]args) throws XmlRpcException, IOException {
        System.out.print("iniciando servidor...\n");
        PropertyHandlerMapping mapping = new PropertyHandlerMapping();
        mapping.addHandler("methods", methods.class);
        WebServer server = new WebServer(1200);
        server.getXmlRpcServer().setHandlerMapping(mapping);
        server.start();
        System.out.println("Esperando peticion...");
    }
}
