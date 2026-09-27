import java.util.Scanner;

public class FireSmokeDetection {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("    FIRE & SMOKE DETECTION");
        System.out.println("================================");

        System.out.print("Enter temperature (°C): ");
        double temperature = sc.nextDouble();

        System.out.print("Enter smoke level (%): ");
        double smokeLevel = sc.nextDouble();

        System.out.println("\n--- Sensor Status ---");
        System.out.println("Temperature : " + temperature + " °C");
        System.out.println("Smoke Level : " + smokeLevel + " %");

        // Threshold values for this simulation
        double temperatureLimit = 60.0;
        double smokeLimit = 50.0;

        if (temperature >= temperatureLimit && smokeLevel >= smokeLimit) {
            System.out.println("\n!!! FIRE ALERT !!!");
            System.out.println("High temperature and smoke detected.");
            System.out.println("Activate alarm immediately!");
        }
        else if (temperature >= temperatureLimit) {
            System.out.println("\nWARNING!");
            System.out.println("High temperature detected.");
            System.out.println("Check the area for possible fire.");
        }
        else if (smokeLevel >= smokeLimit) {
            System.out.println("\nWARNING!");
            System.out.println("High smoke level detected.");
            System.out.println("Check the area for smoke or fire.");
        }
        else {
            System.out.println("\nSystem Status: NORMAL");
            System.out.println("No dangerous condition detected.");
        }

        sc.close();
    }
}
