// klasa wyjątku
class DzieleniePrzezZeroException extends Exception {
    public DzieleniePrzezZeroException(String message) {
        super(message);
    }
}

// klasa testująca
public class Test {
    public static double podziel(double a, double b) throws DzieleniePrzezZeroException {
        if (b == 0) {
            throw new DzieleniePrzezZeroException("Nie można dzielić przez zero!");
        }
        return a / b;
    }

    public static void main(String[] args) {
        try {
            System.out.println(podziel(10, 0));
        } catch (DzieleniePrzezZeroException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(podziel(10, 2));
        } catch (DzieleniePrzezZeroException e) {
            System.out.println(e.getMessage());
        }
    }
}
