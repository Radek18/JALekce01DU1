package com.engeto.Lekce01DU01;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {

        String nameSurname = "Petr Novák";
        System.out.println("1. Jméno a příjmení prodejce: " + nameSurname);

        LocalDate dateOfBirth = LocalDate.of(1990, 1, 1);
        System.out.println("2. Datum narození prodejce: " + dateOfBirth.format(DateTimeFormatter.ofPattern("dd. MM. yyyy")));

        int numberOfContracts = 4;
        System.out.println("3. Počet dosud sjednaných smluv: " + numberOfContracts);

        double quantity = 5.1;
        System.out.println("4. Celkové množství prodané mrkve v tunách: " + quantity);

        String place = "Pardubice";
        System.out.println("5. Název města, kde prodejce sídlí: " + place);

        String spz = "5E2 1245";
        System.out.println("6. Registrační značka vodzidla (SPZ): " + spz);

        double consuption = 14.6;
        System.out.println("7. Spotřeba firemního vozidla v litrech na 100 km: " + consuption);

        String ip = "192.168.0.1";
        System.out.println("8. IP adresa verze 4 firemního počítače: " + ip);

        double avgQuantityPerContract = quantity / numberOfContracts;
        System.out.println("PRŮMĚRNÉ MNOŽSTVÍ PRODANÉ MRKVE NA JEDNU SMLOUVU: " + avgQuantityPerContract);

    }

}