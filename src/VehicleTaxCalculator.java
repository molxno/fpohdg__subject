import java.util.Scanner;

public class VehicleTaxCalculator {
    private static final double CAR_TAX_RATE = 0.10;
    private static final double TRUCK_TAX_RATE = 0.15;
    private static final double CARGO_VEHICLE_TAX_RATE = 0.05;
    private static final double PUBLIC_SERVICE_TAX_RATE = 0.08;

    private static double calculateTax(String vehicleType, double commercialValue) {
        return switch (vehicleType.toLowerCase()) {
            case "automovil" -> commercialValue * CAR_TAX_RATE;
            case "camioneta" -> commercialValue * TRUCK_TAX_RATE;
            case "vehiculo carga" -> commercialValue * CARGO_VEHICLE_TAX_RATE;
            case "servicio público" -> commercialValue * PUBLIC_SERVICE_TAX_RATE;
            default -> throw new IllegalArgumentException("Tipo de vehículo no válido");
        };
    }

    private static void readAndCalculateTax() {
        System.out.println("Seleccione el tipo de vehiculo al que desea calcular el impuesto vehicular:");

        String vehicleType = "";
        Scanner input = new Scanner(System.in);
        int response = 0;
        do {
            System.out.println("0. Salir");
            System.out.println("1. Automovil");
            System.out.println("2. Camioneta");
            System.out.println("3. Vehiculo carga");
            System.out.println("4. Servicio público");

            response = Integer.parseInt(input.nextLine());

            switch (response) {
                case 1:
                    vehicleType = "automovil";
                    break;
                case 2:
                    vehicleType = "camioneta";
                    break;
                case 3:
                    vehicleType = "vehiculo carga";
                    break;
                case 4:
                    vehicleType = "servicio público";
                    break;
                case 0:
                    System.out.println("Gracias por usar el sistema de cálculo de impuestos vehiculares");
                    return;
                default:
                    System.out.println("Opción no válida");
                    continue;
            }
        } while (vehicleType.isEmpty());

        System.out.print("Ingrese la placa del vehículo: ");
        String plate = input.nextLine();

        System.out.print("Ingrese el valor comercial del vehículo: ");
        double commercialValue = input.nextDouble();

        double tax = calculateTax(vehicleType, commercialValue);
        System.out.println("El impuesto para el vehículo con placa " + plate + " es: $ " + tax);
    }

    public static void main(String[] args) {
        readAndCalculateTax();
    }
}