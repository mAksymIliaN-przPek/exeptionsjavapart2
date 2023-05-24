public class Main {
    public static void main(String[] args) {
        int[] array = new int[5];

        try {
            // próba dostępu do indeksu, który jest poza zakresem
            int value = array[10];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Próbowano dostać się do indeksu poza zakresem tablicy!");
            e.printStackTrace();
        }
    }
}
