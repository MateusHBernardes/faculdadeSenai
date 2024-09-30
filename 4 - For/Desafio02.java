import javax.swing.JOptionPane;

public class Desafio02 {
    public static void main(String[] args) {
     
        String pergunta = "";
        
        int qntIdade = 0;
        Double mediaIdade = 0.0;
        int IdadeTotal = 0;
        
        int masculino = 0;
        int feminino = 0;
        
        int idadeM = 0;
        Double mediaIdadeM = 0.0;
        Double totalIdadeM = 0.0;

        int idadeF = 0;
        Double mediaIdadeF = 0.0;
        Double totalIdadeF = 0.0;

        Double salario = 0.0;
        Double mediaSalario = 0.0;
        Double totalSalario = 0.0;

        Double  salarioM = 0.0;
        Double mediaSalarioM = 0.0;
        Double totalSalarioM = 0.0;

        Double  salarioF = 0.0;
        Double mediaSalarioF = 0.0;
        Double totalSalarioF = 0.0;

        Double maiorSalario = 0.0;
        Double  menorSalario = 0.0;



        while(!pergunta.equals("Finalizar")) {

            int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe sua idade: "));
            qntIdade++;

            while(idade < 0){
                idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Idade inválida. Informe sua idade: "));
            }

            IdadeTotal +=  idade;

            
        
            salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe seu salário: "));

            while(salario < 0){
                salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Salário inválido. Informe seu salário: "));
            }

            salario++;
            totalSalario +=  salario;

            if(menorSalario == 0){
                menorSalario = salario;
            }

            if(salario >= maiorSalario) {
                maiorSalario = salario;
            } else if (salario <  menorSalario) {
                menorSalario = salario;
            }

            String opcaoGenero = JOptionPane.showInputDialog(null, "M ou F");

            while(!opcaoGenero.equals("M") && !opcaoGenero.equals("F")){
                opcaoGenero = JOptionPane.showInputDialog(null, "SÓ EXISTEM 2 GÊNEROS! Informe seu gênero:");
            }
            
            if(opcaoGenero.equals("M")) {
                masculino++;
                idadeM = idade;
                totalIdadeM += idadeM;
                
                salarioM = salario;
                totalSalarioM += salarioM;


            } else if(opcaoGenero.equals("F")){
                feminino++;
                idadeF =  idade;
                totalIdadeF += idadeF;

                salarioF = salario;
                totalSalarioF += salarioF;
            }


            pergunta = JOptionPane.showInputDialog("Finalizar?");

        }

        mediaIdade = IdadeTotal / (double)qntIdade;
        mediaIdadeM = totalIdadeM /  (double)masculino;
        mediaIdadeF = totalIdadeF / (double)feminino;

        mediaSalario = totalSalario /  (double)salario;
        mediaSalarioM = totalSalarioM / salarioM;
        mediaSalarioF = totalSalarioF / salarioF;

        JOptionPane.showMessageDialog(null,"Média da idade geral: "+ mediaIdade);
        JOptionPane.showMessageDialog(null,"Média da idade masculino: "+ mediaIdadeM);
        JOptionPane.showMessageDialog(null,"Média da idade feminino: "+ mediaIdadeF);
        
        JOptionPane.showMessageDialog(null,"Média de salario: "+ mediaSalario);
        JOptionPane.showMessageDialog(null,"Média de salario masculino: "+ mediaSalarioM);
        JOptionPane.showMessageDialog(null,"Média de salario feminino: "+ mediaSalarioF);

        JOptionPane.showMessageDialog(null, "Maior salário" + maiorSalario);
        JOptionPane.showMessageDialog(null, "Menor salário" + menorSalario);
    }
}