import javax.swing.JOptionPane;

public class Array {
    public static void main(String[] args) {
   
        int valores [] = new int [2];
        Double media = 0.0;

        JOptionPane.showMessageDialog(null, "Informe 2 e saiba a média deles",
            "Vetor > Array", JOptionPane.INFORMATION_MESSAGE);

        for (int i = 0; i < 2; i++) {
            valores[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o " + (i + 1) + "º valor:"));

            media += valores[i];
        }

        media += valores[i];
    

    media = media / valores.length; //Esta função retorna o tamanho do array
        
    JOptionPane.showMessageDialog(null, "A média é:" + media,
        "Vetor > Array", JOptionPane.INFORMATION_MESSAGE);  
    }
}