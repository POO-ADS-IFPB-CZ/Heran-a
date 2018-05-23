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

    @Override
    public void imprimirObjeto() {
        System.out.println("Nome: "+getNome());
        System.out.println("CPF: "+getCpf());
        System.out.println("Nascimento: "+getNascimento());
        System.out.println("Salário: "+getSalario());
        System.out.println("Matrícula: "+matricula);
        System.out.println("Disciplina: "+disciplina);
    }

}
