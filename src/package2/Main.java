package package2;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int counter = 0;

        for (int i = 0; i < 100; i++) { // Przykładowo, wykonaj 100 prób.
            int liczba1 = random.nextInt(21) - 10; // Losowanie liczby od -10 do 10
            int liczba2 = random.nextInt(21) - 10; // Losowanie liczby od -10 do 10

            try {
                double wynik = (double) liczba1 / liczba2;
                System.out.println("Wynik dzielenia " + liczba1 + " przez " + liczba2 + " wynosi " + wynik);
            } catch (ArithmeticException e) {
                System.out.println("Błąd: Dzielenie przez zero!");
                counter++;
                if (counter == 3) {
                    System.out.println("Wystąpiło 3 wyjątki dzielenia przez zero. Zakończenie programu.");
                    break;
                }
            }
        }
    }
}

