package mainpackage;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner marks1 = new Scanner(System.in);

        System.out.println("Enter matriculation percentage accurate=");
        float matriculationPercentage = marks1.nextFloat();

        System.out.println("Enter intermediate percentage accurate=");
        float intermediatePercentage = marks1.nextFloat();

        System.out.println("Enter test score=");
        int testResult = marks1.nextInt();

        double CPN = UtilityMethods.calculateCPN(matriculationPercentage, intermediatePercentage, testResult);

        System.out.println("Your CPN would be = " + CPN);
    }
}
