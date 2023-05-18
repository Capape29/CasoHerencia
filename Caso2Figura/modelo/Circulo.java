package modelo;

public class Circulo extends Figura{

    // Atributos
    private double radio;

    // Constructor
    public Circulo(double radio){
        this.radio = radio;
    }

    // Metodos
    public void calcularAreaPerimetro(){
        this.area = Math.PI * Math.pow(this.radio, 2);
        this.perimetro = 2 * Math.PI * this.radio;
    }
}