package ejecutable;

import javax.swing.JOptionPane;

import modelo.Circulo;
import modelo.Rectangulo;

public class Test{

    // Metodo principal
    public static void main(String[] args){
        
        // Entrada de datos
        double radio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio del circulo: "));

        // Circulo
        Circulo circulo = new Circulo(radio);
        circulo.calcularAreaPerimetro();
        JOptionPane.showMessageDialog(null, "El area del circulo es: " + circulo.getArea() + "\nEl perimetro del circulo es: " + circulo.getPerimetro());
        
        // Entrada de datos rectangulo
        double base = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la base del rectangulo: "));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura del rectangulo: "));

        // Creacion de objetos


        // Rectangulo
        Rectangulo rectangulo = new Rectangulo(base, altura);
        rectangulo.calcularAreaPerimetro();
        JOptionPane.showMessageDialog(null, "El area del rectangulo es: " + rectangulo.getArea() + "\nEl perimetro del rectangulo es: " + rectangulo.getPerimetro());
    }
}