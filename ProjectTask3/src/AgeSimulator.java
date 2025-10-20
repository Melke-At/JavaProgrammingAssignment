import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class AgeSimulator {

    public static void main(String[] args) {
        int[] ages = {18, 19, 20, 21, 22};
        double[] probabilities = {0.10, 0.35, 0.30, 0.15, 0.10};

        for (int run = 1; run <= 3; run++) {
            Map<Integer, Integer> frequency = simulateAges(ages, probabilities, 1000);
            System.out.println("\n🔁 Test Run " + run + ": Age Frequencies (out of 1000)");
            printFrequency(frequency);
        }
    }

    public static Map<Integer, Integer> simulateAges(int[] ages, double[] probabilities, int nSamples) {
        Map<Integer, Integer> freq = new HashMap<>();
        Random rand = new Random();

        for (int age : ages) {
            freq.put(age, 0);
        }

        double[] cumulative = new double[probabilities.length];
        cumulative[0] = probabilities[0];
        for (int i = 1; i < probabilities.length; i++) {
            cumulative[i] = cumulative[i - 1] + probabilities[i];
        }

        for (int i = 0; i < nSamples; i++) {
            double r = rand.nextDouble(); // uniform [0,1)
            int age = getAgeFromCDF(r, ages, cumulative);
            freq.put(age, freq.get(age) + 1);
        }

        return freq;
    }

    private static int getAgeFromCDF(double r, int[] ages, double[] cumulative) {
        for (int i = 0; i < cumulative.length; i++) {
            if (r <= cumulative[i]) {
                return ages[i];
            }
        }
        return ages[ages.length - 1]; // fallback (shouldn’t happen if probs sum to 1)
    }

    private static void printFrequency(Map<Integer, Integer> freq) {
        for (int age : freq.keySet()) {
            System.out.printf("Age %d: %d%n", age, freq.get(age));
        }
    }
}
