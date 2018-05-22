package com.ifpb.heranca.model;

import java.time.LocalDate;

public class Aluno extends Pessoa{

    private int matricula;
    private float nota1;
    private float nota2;

    public Aluno(String cpf, String nome, LocalDate nascimento, int matricula,
                 float nota1, float nota2) {
        super(cpf,nome,nascimento);
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }
}
