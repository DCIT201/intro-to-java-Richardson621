import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose an option:");
        System.out.println("1. Convert Celsius to Fahrenheit");
        System.out.println("2. Convert Fahrenheit to Celsius");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        System.out.print("Enter the temperature value: ");
        double temperature = scanner.nextDouble();

        double convertedTemperature;

        switch (choice) {
            case 1:
                convertedTemperature = (temperature * 9 / 5) + 32;
                System.out.printf("%.2f Celsius is %.2f Fahrenheit.", temperature, convertedTemperature);
                break;
            case 2:
                convertedTemperature = (temperature - 32) * 5 / 9;
                System.out.printf("%.2f Fahrenheit is %.2f Celsius.", temperature, convertedTemperature);
                break;
            default:
                System.out.println("Invalid choice.");
        }

        scanner.close();
    }
}