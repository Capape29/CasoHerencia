package modelo;

public class Rectangulo extends Figura{
    
        // Atributos
        private double base;
        private double altura;

        // Constructor
        public Rectangulo(double base, double altura){
            this.base = base;
            this.altura = altura;
        }
    
        // Metodos
        public void calcularAreaPerimetro(){
            this.area = this.base * this.altura;
            this.perimetro = 2 * (this.base + this.altura);
        }
}