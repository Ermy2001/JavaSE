import java.util.Scanner;
public class PrimeExample2{
  public static void main(String[] args){
    Scanner s =new Scanner(System.in);
    System.out.print("For finding  PRIME_NUMBERS in a range of numbers Enter the FIRST_NUMBER:");
    int start = s.nextInt();
    System.out.println("Enter the SECOND_NUMBER: ");
    int end = s.nextInt();
    System.out.println("List of prime number between "+ start + " and "+ end);
    for (int i = start; i<= end; i++){
      if (isPrime(i)){
        System.out.println(i);
      }
    }
  }
  public static boolean isPrime(int n){
    if (n <= 1){
      return false;
    }
    for(int i = 2;i <= Math.sqrt(n);i++){
      if (n % i ==0){
        return false;
      }
    }
    return true;
  }
}