import java.util.Scanner;

/**
 * Desenvolver um sistema que mostre ao usuário um menu de opções: 1-Somar 2-Subtrair 3-Multiplicar e 4-Dividir; Depois disso o sistema irá receber do usuário dois valores do tipo real, e de acordo com a opção escolhida, deve ser chamado uma função para retornar o resultado da operação escolhida. Neste sistema você deve criar uma função somar, subtrair, multiplicar e uma última para dividir.
 */
public class Questao01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double n1 = 0, n2 = 0, res = 0;
        

        System.out.println("Menu de opções: \n 1-Somar \n 2-Subtrair \n 3-Multiplicar \n 4-Dividir");
        int op = entrada.nextInt();
        System.out.println("Agora insira um valor do tipo real para efetuar a operação escolhida:");
        n1 = entrada.nextDouble();
        System.out.println("Insira outro valor do tipo real: ");
        n2 = entrada.nextDouble();

        switch (op) {
            case 1:
                res = soma(n1, n2);
                System.out.println("O resultado da soma entre " + n1 + " e " + n2 + " é: " + res);
                break;
            case 2:
                res = subt(n1, n2);
                System.out.println("O resultado da subtração entre " + n1 + " e " + n2 + " é: " + res);
                break;
            case 3:
                res = mult(n1, n2);
                System.out.println("O resultado da multiplicação entre " + n1 + " e " + n2 + " é: " + res);
                break;
            case 4:
                res = div(n1, n2);
                System.out.println("O resultado da divisão entre " + n1 + " e " + n2 + " é: " + res);
                break;
            default:
                break;
        }
        entrada.close();
    }

    public static double soma (double num1, double num2){
        return num1 + num2;
    }

    public static double subt (double num1, double num2){
        return num1 - num2;
    }

    public static double mult(double num1, double num2){
        return num1 * num2;
    }
    
    public static double div(double num1, double num2){
        return num1 / num2;
    }
}