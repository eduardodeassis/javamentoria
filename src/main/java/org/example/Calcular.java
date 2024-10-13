package org.example;

import java.util.ArrayList;

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
        ArrayList<org.example.Aluno> lstAlunos = new ArrayList<>();
        Aluno tmpAluno = new Aluno();
        tmpAluno.nome = "Eduardo";
        tmpAluno.notas.add(10.0f);
        tmpAluno.notas.add(5.5f);
        tmpAluno.notas.add(6.9f);
        tmpAluno.notas.add(7.6f);
        lstAlunos.add(tmpAluno);
        System.out.println(lstAlunos.get(0).media());
    }

    public static void main(String[] args) {
        calcularMedia();
    }
}