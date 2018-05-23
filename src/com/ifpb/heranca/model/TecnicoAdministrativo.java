package com.ifpb.heranca.model;

import java.time.LocalDate;

public class TecnicoAdministrativo extends Funcionario {

    private String setor;

    public TecnicoAdministrativo(String cpf, String nome, LocalDate nascimento,
                                 float salario, String setor){
        super(cpf, nome, nascimento, salario);
        this.setor = setor;
    }

    public String getSetor(){
        return setor;
    }

    public void setSetor(String setor){
        this.setor = setor;
    }

    @Override
    public void imprimirObjeto(){
        System.out.println("Nome: "+getNome());
        System.out.println("CPF: "+getCpf());
        System.out.println("Nascimento: "+getNascimento());
        System.out.println("Salário: "+getSalario());
        System.out.println("Setor: "+setor);
    }

}