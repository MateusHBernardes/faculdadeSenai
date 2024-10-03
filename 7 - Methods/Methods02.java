
import javax.swing.JOptionPane;

public class Methods02 {

    public static Double solicitar() {

        Double metros = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe um valor em métros:"));
        return metros;
    }

    public static void escolherOpcao(Double metros) {

        int opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "1 - centímetros\n2 - polegadas\n3 - pés\n4 - quilômetros"));

        switch (opcao) {
            case 1:
                metros = metros * 100;
                JOptionPane.showMessageDialog(null, "O valor em centímetros é: " + metros);
                break;

            case 2:
                metros = metros * 39.3701;
                JOptionPane.showMessageDialog(null, "O valor em polegadas é: " + metros);
                break;

            case 3:
                metros = metros * 3.28084;
                JOptionPane.showMessageDialog(null, "O valor em pés é: " + metros);
                break;

            case 4:
                metros = metros * 0.001;
                JOptionPane.showMessageDialog(null, "O valor em quilômetros é: " + metros);
                break;

            default:
                JOptionPane.showMessageDialog(null, "Opção inválida!");
                break;
        }
    }

    public static void main(String[] args) {

//    Methods02 metodo = new Methods02();
        Double metros = solicitar();
        escolherOpcao(metros);

    }
}
