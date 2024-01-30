import java.text.DecimalFormat;
import java.util.Scanner;

public class ThunderstormCalculator {

    // Initalize the decimal format, miles, and kilometers.
    static DecimalFormat df = new DecimalFormat("#.##");

    static double miles;
    static double kilometers;

    public static void main(String[] args) {

        // Speed of sound in air (meters/second)
        final int speedOfSound = 343;

        // User input scanner
        Scanner scanner = new Scanner(System.in);

        System.out
                .println("Enter the time elapsed between seeing the lightning and hearing the thunder (in seconds): ");

        double timeElapsed = scanner.nextDouble();

        // Distance calculation (Distance is in meters)

        double distance = speedOfSound * timeElapsed;

        miles = distance * 0.000621371;
        miles = Double.parseDouble(df.format(miles));

        kilometers = distance * 0.0010936133;
        kilometers = Double.parseDouble(df.format(kilometers));

        // Output the distance

        System.out.println("The distance is " + distance + " meters."
                + "\n or " + miles + " miles."
                + "\n or " + kilometers + " kilometers.");

        scanner.close();
    }
}
