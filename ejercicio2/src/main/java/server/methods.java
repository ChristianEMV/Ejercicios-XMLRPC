package server;
//Medina Vergara Christian Emmnuael
public class methods {
    public String operation (double num1, double num2, double num3, double num4){
        double operation;
        double producto = (num1 * num2*num3*num4);
        double suma = (num1+num2+num3+num4);
        operation = (suma/4);

        return "Hola el Producto es: " +producto+ "\n"+
                "La Suma es: "+suma+"\n"+
                "El Promedio es: "+operation;
    }
}
