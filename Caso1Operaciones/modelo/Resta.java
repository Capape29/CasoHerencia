package modelo;

public class Resta extends Operacion{
    
    // constructor
    public Resta (double x, double y){
        super(x, y);
    }

    // Metodos
    public void restar(){
        resultado = x - y;
    }

}
