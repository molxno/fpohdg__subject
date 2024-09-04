import java.util.Scanner;

public class NewYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();
        int minutes = scanner.nextInt();
        int difference = ((23 - hours) * 60) + (60 - minutes);
        System.out.println("Faltan " + difference + " minutos");
    }
}
