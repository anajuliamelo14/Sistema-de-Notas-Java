import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
   
        //le o teclado pra digitar algo
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o nome do aluno: ");
        String nomeDoAluno = teclado.nextLine();

        //digita a nota 1 e nota 2
        System.out.println("Digite a nota 1: ");
        double nota1 = teclado.nextDouble();
        System.out.println("Digite a nota 2: ");
        double nota2 = teclado.nextDouble();

        //imprime o nome do aluno
        System.out.println("Nome do aluno: " + nomeDoAluno);
        // cálculo
        double media = (nota1 + nota2) / 2;

        // exibição
        System.out.println("Nome do aluno: " + nomeDoAluno);
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Média: " + media);

        //verifica se a média é maior ou igual a 7, se sim, o aluno está aprovado, caso contrário, está reprovado
        //media maio ou igual a 9, o aluno está aprovado com excelência
        if(media >= 7) {
            System.out.println("Aluno aprovado!");

            if(media >= 9) { 
                System.out.println("Aluno aprovado com excelência!");
            }
        } else {
            System.out.println("Aluno reprovado!");
        
 }teclado.close();
}}