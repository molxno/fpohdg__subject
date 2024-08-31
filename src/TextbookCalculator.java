import java.util.Scanner;

public class TextbookCalculator {
    private static final int NOTEBOOK = 5000;
    private static final int BOOK = 50000;
    private static final double NOTEBOOK_DISCOUNT = 0.1;
    private static final double BOOK_DISCOUNT = 0.05;

    private static double calculatePrice(String textbookType, int amount) {
        return switch (textbookType.toLowerCase()) {
            case "cuadernos" -> NOTEBOOK * amount * (1 - NOTEBOOK_DISCOUNT);
            case "libros" -> BOOK * amount * (1 - BOOK_DISCOUNT);
            default -> throw new IllegalArgumentException("Tipo de libro no válido");
        };
    }

    private static void readAndCalculateTextbook() {
        System.out.println("Seleccione el tipo de libro que desea comprar:");

        String textbookType = "";
        Scanner input = new Scanner(System.in);
        int response = 0;
        do {
            System.out.println("0. Salir");
            System.out.println("1. Cuadernos");
            System.out.println("2. Libros");

            response = Integer.parseInt(input.nextLine());

            switch (response) {
                case 1:
                    textbookType = "cuadernos";
                    break;
                case 2:
                    textbookType = "libros";
                    break;
                case 0:
                    System.out.println("Gracias por usar el sistema de cálculo de precios de libros");
                    return;
                default:
                    System.out.println("Opción no válida");
                    continue;
            }

            System.out.print("Ingrese la cantidad de libros que desea comprar: ");
            int amount = Integer.parseInt(input.nextLine());

            double price = calculatePrice(textbookType, amount);
            System.out.println("El precio total a pagar es: $ " + price);
        } while (textbookType.isEmpty());
    }

    public static void main(String[] args) {
        readAndCalculateTextbook();
    }
}