package snacks.java;

import java.util.Random;

public class snack2 {
    public static void main(String[] args) {

        String[] nomi = {"Mirko", "Carmine", "Mattia", "Matteo", "Giovanni", "Cristina"};
        String[] cognomi = {"Robbi", "Caglia", "Faluso", "Giovagnotti", "Bassani"};

        Random rand = new Random();
        for (int i = 0; i < 6; i++) {
            String nomeCasuale = nomi[rand.nextInt(nomi.length)];
            String cognomeCasuale = cognomi[rand.nextInt(cognomi.length)];
            System.out.println(nomeCasuale + " " + cognomeCasuale);
        }
    }
}


