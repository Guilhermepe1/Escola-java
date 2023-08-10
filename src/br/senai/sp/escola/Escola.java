package br.senai.sp.escola;

import java.util.Scanner;

public class Escola {

    public static void main(String[] args) {

        /** Declara variaveis */
        String nomeAluno, disciplina, professor, status, resp;
        int frequencia;
        float nota1, nota2, mediaAluno;
        boolean validacao;
        boolean continua = true;

        /** Instanciar o teclado */
        Scanner teclado = new Scanner(System.in);

        /** Reconhece professor */
        System.out.print("Olá prof°, qual seu nome? ");
        professor = teclado.nextLine();
        System.out.println("--------------------------------------");
        System.out.printf("Bem-vindo Professor %s!\n", professor);

        while (continua) {
            /** Coleta informacoes */
            System.out.println("--------------------------------------");
            System.out.print("Informe o nome do aluno: ");
            nomeAluno = teclado.next();
            System.out.print("Informe a sua disciplina: ");
            disciplina = teclado.next();
            System.out.print("Informe a frequência do aluno: ");
            frequencia = teclado.nextInt();
            System.out.print("Informe a nota 1: ");
            nota1 = teclado.nextInt();
            System.out.print("Informe a nota 2: ");
            nota2 = teclado.nextInt();
            System.out.print("--------------------------------------");

            /** Avaliacao do aluno */
            mediaAluno = (nota1 + nota2) / 2;
            validacao = (professor.equalsIgnoreCase("vitor"));
            if (mediaAluno >= 7 && frequencia >= 75 && !validacao || mediaAluno >= 6 && frequencia >= 90 && !validacao) {
                status = "APROVADO";
            } else {
                status = "REPROVADO";
            }
            System.out.printf("\nVerifique abaixo a situação do aluno %s na disciplina de %s:", nomeAluno, disciplina);
            System.out.printf("\nAs respectivas notas são: %1.0f e %1.0f", nota1, nota2);
            System.out.printf("\nA média do aluno %s é %1.0f", nomeAluno, mediaAluno);
            System.out.printf("\nA condição dele é %s!", status);
            System.out.println("\n--------------------------------------");

            /** Cadastra outro aluno */
            System.out.println("Deseja verificar outro aluno?[S/N]");
            resp = teclado.next();
            if (resp.equalsIgnoreCase("n")) {
                continua = false;
            }
            System.out.println("--------------------------------------");
        }

        /** Finzaliza */
        System.out.println("Até a próxima!");

    }
}
