public class Primes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        System.out.println("Prime numbers up to " + n + ":");
        boolean[] primeNumbers = new boolean[n + 1];
        int i = 2;
        int primeCount = 0; 
        while (i < (n + 1)) {
            primeNumbers[i] = true;
            i++;
        }   
        int p = 2;
        while (p <= Math.sqrt(n)) {
            if (primeNumbers[p]) {
                int z = 2;
                while (p * z <= n) {
                    primeNumbers[p * z] = false;
                    z++;
            }
            }
            p++;
        }
        for (int j = 0; j <= n; j++) {
            if (primeNumbers[j] == true) {
                primeCount += 1;
                System.out.println(j);  
            }
        }
        int primePercentage = (int) 100 * primeCount/n;
        System.out.print("There are " + primeCount + " primes between 2 and " + n + " (" + primePercentage + "% are primes)"); //There are 10 primes between 2 and 30 (33% are primes)
        }
    }
