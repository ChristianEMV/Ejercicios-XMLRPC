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
        //Object[] numbers = {5.0,5D};
        // Double response = (Double) client.execute("methods.add",numbers);
        //System.out.println("Result ->" + response);
        System.out.println("Ingresa el primer numero");
        double num1 = scanner.nextDouble();
        System.out.println("Ingresa el segundo numero");
        double num2 = scanner.nextDouble();
        System.out.println("Ingresa el tercer numero");
        double num3 = scanner.nextDouble();
        System.out.println("Ingresa el cuarto numero");
        double num4 = scanner.nextDouble();
        Object[] data= {num1,num2, num3, num4};
        String response = (String) client.execute("methods.operation",data);
        System.out.println(response);

    }
}


