package com.ifpb.heranca.view;

import com.ifpb.heranca.model.*;

import java.time.LocalDate;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {

        Aluno aluno = new Aluno("111.111.111-01", "João",
                LocalDate.now(), 1, 8.5f, 9, 7.5f, 10);

        Aluno aluno1 = new Aluno("222.222.222-02", "Maria",
                LocalDate.now(), 2, 5.5f, 3.5f);

        Aluno aluno2 = new Aluno("333.333.333-03", "Pedro",
                LocalDate.now(), 3, 7, 7,7);

        Professor prof = new Professor("444.444.444-04", "Ana",
                LocalDate.now(), 1, 2000, "POO");

        Turma turma = new Turma(prof, prof.getDisciplina());

        turma.addAluno(aluno);
        turma.addAluno(aluno1);
        turma.addAluno(aluno2);

        System.out.println(Arrays.toString(turma.getAlunos()));

    }
}
