package server;

public class methods {
    public String indice (String name, double weight, double height){
        double imc;
        imc = (weight/height * height);
        return "Nombre: " + name+ "\n"+
                "Su IMC es: "+ imc+"\n";
    }
}