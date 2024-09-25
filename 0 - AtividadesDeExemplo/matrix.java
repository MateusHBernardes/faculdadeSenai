
import javax.swing.JOptionPane;


public class matrix {
    public static void main(String[] args) {
        int valores [][] = new int [2][2];
        int contador = 0;
        String menorZero = "";
        String maiorZero = "";

        JOptionPane.showMessageDialog(null, "Informe 4 valores e saiba quais são maiores ou menores que 0",
        "Matriz > Matrix", JOptionPane.INFORMATION_MESSAGE);

        for(int i = 0; i<2; i++) {
            for (int j = 0; j<2; j++){
                contador++;
                valores[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Informe o "+ contador + "º valor"));

                    if(valores[i][j] <= 0) {
                        if(menorZero == "") {
                            menorZero = "Valores menores ou igual a zero: ";
                        } else {
                            menorZero += ", ";
                        }
                        
                        menorZero += valores[i][j];
                    } else {
                        if(maiorZero == "") {
                            maiorZero = "Valores maiores que zero: ";
                        } else {
                            maiorZero += ", ";
                        }

                        maiorZero += valores[i][j];
                    }
            }
        }

        JOptionPane.showMessageDialog(null, menorZero + "\n" + maiorZero,
            "Matriz > Matrix", JOptionPane.INFORMATION_MESSAGE);
    }
}
