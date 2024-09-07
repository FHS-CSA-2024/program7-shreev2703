import java.util.Scanner;
import java.lang.Math;

public class Program7 {
    // Define conversion rates as constants
    final double KLEVINS_CONVERSION = 1.0 / 20.0;  // 1 Klevin = 0.05 Schrute-bucks
    final double STANLEY_NICKELS_CONVERSION = 1.0 / 240.0;  // 1 Stanley-nickel = 0.004167 Schrute-bucks

    public static void main(String[] args) {
        // Test code
        Scanner scanner = new Scanner(System.in);

        Program7 tester = new Program7();

        System.out.println("Enter schrute-bucks: ");
        int schrutebucks = scanner.nextInt();

        System.out.println("Enter klevins: ");
        int klevins = scanner.nextInt();

        System.out.println("Enter stanley-nickels: ");
        int stanleynickels = scanner.nextInt();

        double myTestVal = tester.convertMoney(schrutebucks, stanleynickels, klevins);

        System.out.println("Decimal schrute-bucks = $" + myTestVal);
    }

    public double convertMoney(int schruteBucks, int stanleyNickels, int klevins) {
        // Convert klevins to schrute-bucks
        double klevinsInSchruteBucks = klevins * KLEVINS_CONVERSION;

        // Convert stanley-nickels to schrute-bucks
        double stanleyNickelsInSchruteBucks = stanleyNickels * STANLEY_NICKELS_CONVERSION;

        // Sum the values and add to schrute-bucks
        double total = schruteBucks + klevinsInSchruteBucks + stanleyNickelsInSchruteBucks;

        // Round to two decimal places
        total = Math.round(total * 100.0) / 100.0;

        return total;
    }
}
