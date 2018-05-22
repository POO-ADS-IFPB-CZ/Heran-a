package com.ifpb.heranca.model;

import java.time.LocalDate;

public class Professor extends Funcionario {

    private int matricula;
    private String disciplina;

    public Professor(String cpf, String nome, LocalDate nascimento, int matricula,
                     float salario, String disciplina) {
        super(cpf, nome, nascimento, salario);
        this.matricula = matricula;
        this.disciplina = disciplina;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
}
