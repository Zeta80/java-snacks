package snacks.java;

public class snack3 {
    public static void main(String[] args) {
        int[] numeri = {1, 2, 1, 2, 1, 2, 1, 2, 1, 3};
        int sommaDispari = 0;

        for (int i = 1; i < numeri.length; i += 2) {
            sommaDispari += numeri[i];
        }

        System.out.println("i numeri in posizione dispari sommati fammi: " + sommaDispari);
    }
}

