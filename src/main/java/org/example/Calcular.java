package org.example;

import java.util.HashMap;
import java.util.Map;
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
        int opcaoAluno = 0;
        int opcaoNota = 0;


        while (opcaoAluno < 2) {
            opcaoAluno = 0;
            opcaoNota = 0;
            System.out.println("-- Menu do sistema escolar --");
            System.out.println("-- (1) Novo aluno          --");
            System.out.println("-- (2) Sair                --");

            // regex
            opcaoAluno = scanner.nextInt();   // next
            System.out.println(" ");

            if (opcaoAluno == 1) {
                Aluno tmpAluno = new Aluno();

                /*System.out.print("Informe o nome do aluno: ");
                tmpAluno.nome = scanner.next();
                System.out.println(" ");*/

                while (opcaoNota < 3) {
                    System.out.println("-- Menu do sistema escolar --");
                    System.out.println("-- (1) Adicionar notas     --");
                    System.out.println("-- (2) Mostrar média       --");
                    System.out.println("-- (3) Sair                --");
                    System.out.print("Informe a opção: ");
                    opcaoNota = scanner.nextInt();
                    System.out.println(" ");

                    switch (opcaoNota) {
                        case 1:
                            System.out.print("Informe a nota: ");
                            nota = scanner.nextFloat();
                            tmpAluno.notas.add(nota);
                            break;
                        case 2:
                            media = tmpAluno.media();
                            System.out.printf("A média do aluno é %.2f%n", media);
                            pausa(1000);
                            break;
                        default :
                            media = tmpAluno.media();
                            System.out.printf("A média do aluno é %.2f%n", media);
                            if (media >= 6) {
                                System.out.println("O aluno foi aprovado.");
                            } else {
                                System.out.println("O aluno foi reprovado.");
                            }
                            pausa(2000);
                    }
                    System.out.println(" ");
                }
            } else {
                System.out.println("Aplicação encerrada, obrigado por utilizar ;)");
                break;
            }
        }
    }

    public static void pausa (int milisegundos) {
        try {
            // Pausar por 2 segundos (2000 milissegundos)
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        calcularMedia();
    }
}