import java.util.Scanner;

public class FinalNote {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la nota final:");
        double finalNote = Double.parseDouble(input.nextLine());
        if (finalNote >= 3.0) {
            System.out.println("Aprobado");
            if (finalNote > 4.7) {
                System.out.println("Felicitaciones, ha obtenido una excelente nota");
            }
        } else {
            System.out.println("Reprobado");
        }
    }
}
