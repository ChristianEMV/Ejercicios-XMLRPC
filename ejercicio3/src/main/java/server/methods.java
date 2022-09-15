package server;

public class methods {
    public String operation (double number1, double number2){
        double x;
        double sumfin;
        double contador = 0;
        double r;
        for (x = number1; x<=number2; x++)
        { r=x;
            contador=r+contador;
        }
        sumfin=contador-number1-number2;
//Medina Vergara Christian Emmnauel
        return "La suma total es: " + sumfin+ "\n";
    }
}



