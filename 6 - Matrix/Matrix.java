
import javax.swing.JOptionPane;

public class Matrix {
    public static void main(String[] args) {

        int[][] matrix = new int[5][4];
        int somaArray[] = new int[5];
        int array = 0, total = 0;

        JOptionPane.showMessageDialog(null, "Soma de matriz");

        for(int i=0; i<matrix.length; i++){

            for(int j=0; j<4; j++){
                
                matrix[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Informe  o valor da matriz [" + i + "][" + j + "]")); 

                total += matrix[i][j];

            }

        }

        for(int i=0; i< matrix.length; i++){
            array =0;

            for(int j=0; j<4; j++){
                array += matrix[i][j];
                
                somaArray[i] =  array;
            }
        }


        JOptionPane.showMessageDialog(null, total);
        for(int i = 0; i < somaArray.length; i++){
            JOptionPane.showMessageDialog(null, "Soma da linha "+(i+1)+" é: " + somaArray[i]);

        }
    }
}