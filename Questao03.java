import java.util.Scanner;
public class Questao03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String nomeAlunos [] = new String [5];
        double nota1 [] = new double [5];
        double nota2 [] = new double [5];
        double media [] = new double [5];

        for(int i = 0; i < 5; i++){
            System.out.println("Informe o nome do aluno "+ (i+1));
            nomeAlunos[i] = entrada.nextLine();
            nomeAlunos[i] = entrada.nextLine();
            System.out.println("Informe a primeira nota do aluno(a) " + nomeAlunos[i]);
            nota1 [i] = entrada.nextDouble();
            System.out.println("Informe a segunda nota do aluno(a) " + nomeAlunos[i]);
            nota2 [i] = entrada.nextDouble();
        }

        for(int i = 0; i < 5; i++){
            media[i] = (nota1[i] + nota2[i]) / 2;
            System.out.println("A média do aluno " + nomeAlunos[i] + " é: " + media[i]);
        }
        entrada.close();
    }
}
