package org.example;

import java.util.Scanner;

public class Calcular {

    /**
     * <h1>PROPOSTA DA ATIVIDADE</h1>
     * <p>Em uma escola, foi estabelecido que o nosso professor vai poder colocar quantas vezes ele quiser uma
     * nota de um aluno e vai ser necessário calcularmos a nota média que foi obtida
     * e mostrar se o aluno ao longo do ano conseguiu bater a média que é de 6.</p>
     *
     * <h2>REQUISITOS QUE VÃO SER AVALIADOS</h>
     * <ul>
     *     <li>O sistema deve ter uma forma do professor digitar as notas dos alunos.</li>
     *     <li>Todas essas notas vão ser armazenadas em uma parte no código.</li>
     *     <li>Calcular a média de todas essas notas.</li>
     *     <li>Mostra se ele foi aprovado ou não.</li>
     * </ul>
     */
    public static void calcularMedia() {
        Scanner scanner = new Scanner(System.in);
        float nota;
        float media;

        while (true) {
            Aluno tmpAluno = new Aluno();

            System.out.println("Informe o nome do aluno (digite 'sair' para encerrar a aplicação):");
            tmpAluno.nome = scanner.next();

            if (tmpAluno.nome.toLowerCase().equals("sair")) {
                System.out.println("Aplicação encerrada, obrigado por utilizar ;)");
                break;
            }

            System.out.println("Informe as notas do aluno (digite uma nota menor que zero para encerrar os lançamentos):");
            while (true) {
                nota = scanner.nextFloat();
                if (nota < 0) {
                    break;
                } else {
                    tmpAluno.notas.add(nota);
                }
            }

            media = tmpAluno.media();
            System.out.printf("A média do aluno é %.2f%n", media);

            if (media >= 6) {
                System.out.println("O aluno foi aprovado.");
            } else {
                System.out.println("O aluno foi reprovado.");
            }
        }
    }

    public static void main(String[] args) {
        calcularMedia();
    }
}