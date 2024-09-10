import javax.swing.JOptionPane;

public class SwitchCase {
    public static void main(String[] args) {
        String opcao;

        opcao = JOptionPane.showInputDialog("Você está fazendo a atividade?");
        opcao = opcao.toUpperCase();

        switch(opcao) {
            case "SIM":
                JOptionPane.showMessageDialog(null, "Parabéns! Aí sim é sucesso! :D",
                    "Escolha > Switch Case", JOptionPane.INFORMATION_MESSAGE);
                break;
            case "NÃO", "NAO":
                JOptionPane.showMessageDialog(null, "Que pena. Aí é vacilo. :/",
                    "Escolha > Switch Case", JOptionPane.INFORMATION_MESSAGE);
                break;
            default:
                JOptionPane.showMessageDialog(null, "O que você quis dizer? :x",
                    "Escolha > Switch Case", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}