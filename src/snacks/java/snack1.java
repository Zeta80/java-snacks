package snacks.java;

import java.util.Scanner;

public class snack1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Inserisci un numero: ");
        int numero = scan.nextInt();

        if (numero % 2 == 0) {
            System.out.println("Il numero inserito è pari: " + numero);
        } else {
            System.out.println("Il numero inserito è dispari: " + numero);
            System.out.println("Il numero successivo è: " + (numero + 1));
        }
        //SASSONE 🗿
    }
}
