package com.ifpb.heranca.model;

import java.time.LocalDate;
import java.util.Arrays;

public class Aluno extends Pessoa{

    private int matricula;
    private float notas[];

    public Aluno(String cpf, String nome, LocalDate nascimento,
                 int matricula, float ... notas) {
        super(cpf,nome,nascimento);
        this.matricula = matricula;
        this.notas = notas;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public float[] getNotas(){
        return notas;
    }

    public void setNotas(float[] notas){
        this.notas = notas;
    }

    @Override
    public void imprimirObjeto(){
        System.out.println("Nome: "+getNome());
        System.out.println("CPF: "+getCpf());
        System.out.println("Nascimento: "+getNascimento());
        System.out.println("Matrícula: "+matricula);
        System.out.println("Notas: "+ Arrays.toString(notas));
    }

}
