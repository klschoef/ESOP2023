package arrays;

public class Primes {
    public static void main(String[] args) {
        int[] primes = {2, 3, 5, 7, 11, 13, 17, 19}; //new int[8];

        System.out.println("Anzahl Zahlen: " + primes.length);

        int sum = 0;
        /*for (int i=1; i <= primes.length; i++) {
            try {
                sum = sum + primes[i-1];
            } catch (Exception e) {
                System.out.println("Fehler mit Index " + i);
            }
        }*/

        for (int prime : primes) {
            sum += prime;
        }
        double avg = (double)sum / primes.length;
        System.out.println("Summe = " + sum);
        System.out.println("Average = " + avg);

    }
}
