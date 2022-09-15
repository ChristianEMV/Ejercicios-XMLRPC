package client;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfig;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;
//Medina Vergara Christian Emmanuel
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class RPCClient {
    static Scanner scanner = new java.util.Scanner(System.in);
    public static void main(String[] args) throws MalformedURLException, XmlRpcException {
        XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();
        config.setServerURL(new URL("http://localhost:1200"));
        XmlRpcClient client = new XmlRpcClient();
        client.setConfig(config);
        //Object[] numbers = {5.0,5D};
        // Double response = (Double) client.execute("methods.add",numbers);
        //System.out.println("Result ->" + response);
        System.out.println("Ingresa tu nombre");
        String name = scanner.next();
        System.out.println("Ingresa tu peso");
        double peso = scanner.nextDouble();
        System.out.println("Ingresa tu altura");
        double altura = scanner.nextDouble();
        Object[] data= {name,peso,altura};
        String response = (String) client.execute("methods.indice",data);
        System.out.println(response);

    }
}
