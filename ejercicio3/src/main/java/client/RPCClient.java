package client;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfig;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

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
        System.out.println("Ingresa el numero de inicio:");
        double number1 = scanner.nextDouble();
        System.out.println("Ingresa el numero de final");
        double number2 = scanner.nextDouble();
        Object[] data= {number1,number2};
        String response = (String) client.execute("methods.operation",data);
        System.out.println(response);

    }
}
