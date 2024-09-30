import javax.swing.JOptionPane;

public class Desafio01 {
    public static void main(String[] args) {
        
        int numero[] = new int[2];

        int pergunta = 0;

        int quantidade = 0;

        for(int i=0; i<2;i++){
            numero[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o "+(i+1)+"° número: "));
        }

            int resultado = numero[0] * numero[1];
            
            pergunta = Integer.parseInt(JOptionPane.showInputDialog("Informe a multiplicação dos 2 valores: "));

            while(pergunta != resultado) {
                pergunta = Integer.parseInt(JOptionPane.showInputDialog( "Resultado errado"));

                quantidade++;
            }
            
            JOptionPane.showMessageDialog(null, "Parabéns, você acertou!");
            
            JOptionPane.showMessageDialog(null, "Quantidade de tentativas: "+quantidade);
            
    }
}