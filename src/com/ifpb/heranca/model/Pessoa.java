package com.ifpb.heranca.model;

import java.time.LocalDate;
import java.util.Objects;

public abstract class Pessoa {

    private String cpf;
    private String nome;
    private LocalDate nascimento;

    public Pessoa(String cpf, String nome, LocalDate nascimento) {
        this.cpf = cpf;
        this.nome = nome;
        this.nascimento = nascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public abstract void imprimirObjeto();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pessoa)) return false;
        Pessoa pessoa = (Pessoa) o;
        return Objects.equals(getCpf(), pessoa.getCpf()) &&
                Objects.equals(getNome(), pessoa.getNome()) &&
                Objects.equals(getNascimento(), pessoa.getNascimento());
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "cpf='" + cpf + '\'' +
                ", nome='" + nome + '\'' +
                ", nascimento=" + nascimento +
                '}';
    }

    @Override
    public int hashCode() {

        return Objects.hash(getCpf(), getNome(), getNascimento());
    }
}
