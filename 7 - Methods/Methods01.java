import javax.swing.JOptionPane;

public class Methods01 {

    public static void verificacao(Double nota) {
        
        if(nota >= 7.0){
            JOptionPane.showMessageDialog(null, "Aprovado");
        } else if (nota < 7.0 && nota >= 5.0){
            JOptionPane.showMessageDialog(null, "Recuperação");
        } else {
            JOptionPane.showMessageDialog(null, "Reprovado");
        }
    }

    public static void main(String[] args) {
        
        Double nota = Double.parseDouble(JOptionPane.showInputDialog("Informe uma nota: "));

        verificacao(nota);
    
    }
}
