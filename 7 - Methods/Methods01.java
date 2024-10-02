import javax.swing.JOptionPane;

public class Methods01 {

    public void verificacao(Double nota) {
        
        if(nota >= 7.0){
            JOptionPane.showMessageDialog(null, "Aprovado");
        } else if (nota < 7.0 && nota >= 5.0){
            JOptionPane.showMessageDialog(null, "Recuperação");
        } else {
            JOptionPane.showMessageDialog(null, "Reprovado");
        }
    }

    public static void main(String[] args) {
        
        Methods01 metodo = new Methods01();

        Double nota = Double.parseDouble(JOptionPane.showInputDialog("Informe uma nota: "));

        metodo.verificacao(nota);
    
    }
}
