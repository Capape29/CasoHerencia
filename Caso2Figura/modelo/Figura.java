package modelo;

public class Figura{
    // Atributos
    protected double area;
    protected double perimetro;

    // Constructor
    public Figura(){
        this.area = 0;
        this.perimetro = 0;
    }

    // Getters
    public double getArea(){
        return this.area;
    }

    public double getPerimetro(){
        return this.perimetro;
    }
}