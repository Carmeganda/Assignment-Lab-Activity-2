// 2. Checking for prime numbers

public class checking_prime_number {
    public static void main(String[] args) {
        int num = 29; // The number to be tested
        boolean isPrime = true;

        // The codes that will test if the number is a prime or not. We'll use conditional statements.
        for(int i = 2; i < num; i++) {
            if(num%i==0){
                isPrime = false;
                break;
            }
        }
        
        if(isPrime){
            System.out.println("******************************");
            System.out.println(num + " -It is a prime number.");
            System.out.println("******************************");
        }
        else{
            System.out.println("******************************");
            System.out.println(num + " -It is not a prime number.");
            System.out.println("******************************");
        }
    }
}
