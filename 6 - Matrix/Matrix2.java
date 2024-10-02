import javax.swing.JOptionPane;

public class Matrix2 {
    public static void main(String args[]) {

        int[][] matrix = new int[3][2];
        int[][] matrixTransposta = new int[2][3];

        JOptionPane.showMessageDialog(null, "Transpor a matriz!");

        int numero = 1;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                matrix[i][j] = numero++;
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                matrixTransposta[j][i] = matrix[i][j];
            }
        }


        String matrixNormal = "";

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                matrixNormal += matrix[i][j] + " ";
            }
            matrixNormal += "\n";
        }

        JOptionPane.showMessageDialog(null, matrixNormal, "Matriz normal", JOptionPane.INFORMATION_MESSAGE);


        String matrixT = "";

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                matrixT += matrixTransposta[i][j] + " ";
            }
            matrixT += "\n";
        }

        JOptionPane.showMessageDialog(null, matrixT, "Matriz transposta", JOptionPane.INFORMATION_MESSAGE);
    }
}