package modelo;

public class Suma extends Operacion {
    
    // Constructor
    public Suma(double x, double y){
        super(x, y);
    }

    // Metodos 
    public void sumar(){
        resultado = x + y;
    }
}
