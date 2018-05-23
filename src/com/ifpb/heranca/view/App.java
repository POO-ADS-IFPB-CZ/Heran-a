package com.ifpb.heranca.view;

import com.ifpb.heranca.model.*;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {

        Pessoa prof = new Professor("111.111.111-01", "João",
                LocalDate.now(), 1, 1000, "POO");

        Pessoa aluno = new Aluno("222.222.222-02", "Maria", LocalDate.now(),
                1, 7.5f, 8.3f);

        Pessoa tec = new TecnicoAdministrativo("333.333.333-03",
                "Pedro", LocalDate.now(), 2000, "Reitoria");

        prof.imprimirObjeto();
        aluno.imprimirObjeto();
        tec.imprimirObjeto();

    }
}
