public class sieveOfEratosthenes{
    public static void isPrime(int num) {
        boolean[] isPrime = new boolean[num + 1];
        for (int i = 0; i <= num; i++) {
            isPrime[i] = true;
        }

        int p = 2;
        while (p * p <= num) {
            if (isPrime[p] == true) {
                for (int i = p * p; i <= num; i += p) {
                    isPrime[i] = false;
                }
            }
            p += 1;
        }

        // Print all prime numbers:
        for (p = 2; p <= num; p++) {
            if (isPrime[p]) {
                System.out.println(p);
            }
        }
    }
    
    public static void main(String[] args){
        int num = 30;
        System.out.println("Following are the prime numbers smaller than or equal to" + num);
        isPrime(num);
    }
}