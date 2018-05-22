package com.ifpb.heranca.view;

import com.ifpb.heranca.model.*;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {

        Professor prof = new Professor("111.111.111-01", "João",
                LocalDate.now(), 1, 1000, "POO");

        TecnicoAdministrativo tec = new TecnicoAdministrativo("222.222.222-02",
                "Maria", LocalDate.now(), 1000, "Reitoria");


        Pessoa p = new Professor("111.111.111-01", "João",
                LocalDate.now(), 1, 1000, "POO");

    }
}
