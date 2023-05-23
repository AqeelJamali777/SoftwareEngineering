package mainpackage;
public class UtilityMethods {
    public static double calculateCPN(float matriculationPercentage, float intermediatePercentage, int testResult) {
        double CPN = matriculationPercentage * 0.1 + intermediatePercentage * 0.3 + testResult * 0.6;
        return CPN;
    }
}
