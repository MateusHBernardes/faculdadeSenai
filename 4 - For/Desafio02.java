
import javax.swing.JOptionPane;



public class Desafio02 {
    public static void main(String[] args) {
     
    String pergunta = "";

        int qntIdade = 0;

        int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe sua idade: "));
        qntIdade++;

        while(idade < 0){
            idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Idade inválida. Informe sua idade: "));
        }


        int masculino = 0;
        int feminino = 0;

        String opcaoGenero = JOptionPane.showInputDialog(null, "M ou F");

        if(opcaoGenero == "M") {
            masculino++;
        } else if(opcaoGenero == "F"){
            feminino++;
        }


        Double salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe seu salário: "));
        qntIdade++;

        while(idade < 0){
            idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Salário inválido. Informe seu salário: "));
        }



        while(pergunta == "Finalizar"){
            JOptionPane.showInputDialog(null, "");
        }

        JOptionPane.showMessageDialog(null, qntIdade);
        JOptionPane.showMessageDialog(null, masculino);
        JOptionPane.showMessageDialog(null, feminino);
    }
}
