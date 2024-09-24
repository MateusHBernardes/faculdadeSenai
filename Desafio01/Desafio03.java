
import javax.swing.JOptionPane;


public class Desafio03 {
    public static void main(String[] args) {

        Double conversor = Double.parseDouble(JOptionPane.showInputDialog("Inforne a temperatura em Celsius: \n"));

        Double Fahrenheit = (conversor * 1.8) + 32;

        Double Kelvin = conversor + 273;

        JOptionPane.showMessageDialog(null, "Fahrenheit = "+Fahrenheit +  "\n" + "Kelvin = "+ Kelvin);

    }
}