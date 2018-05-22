package com.ifpb.heranca.view;

import com.ifpb.heranca.model.Aluno;
import com.ifpb.heranca.model.Pessoa;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa("111.111.111-01","João",
                LocalDate.now());
        Aluno aluno = new Aluno("222.222.222-02", "Maria",
                LocalDate.now(), 1, 9.5f, 8.3f);



    }
}
