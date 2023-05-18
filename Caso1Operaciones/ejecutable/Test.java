package ejecutable;

import javax.swing.JOptionPane;

import modelo.Resta;
import modelo.Suma;

public class Test{
    public static void main(String[] args){
        
        // Entrada de datos
        double x = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer numero"));
        double y = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo numero"));

        // Creación de un objeto de la clase Suma
        Suma miSuma = new Suma(x, y);
        miSuma.sumar();
        JOptionPane.showMessageDialog(null, "La suma es: " + miSuma.mostrarResultado());

        // Creación de un objeto de la clase Resta
        Resta miResta = new Resta(x, y);
        miResta.restar();
        JOptionPane.showMessageDialog(null, "La resta es: " + miResta.mostrarResultado());

        System.exit(0);
    }   
}