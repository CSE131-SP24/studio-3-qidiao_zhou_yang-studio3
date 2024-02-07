package studio3;
import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int max = sc.nextInt();

        Boolean[] arr = new Boolean[max - 1];

        for (int i = 2; i < arr.length; i++) {
            arr[i] = true;
        }

        for (int i = 2; i*i < arr.length; i++) {
            if (arr[i]){
                for (int j = i*i; j < arr.length; j = j + i) {
                    arr[j] = false;
                }
            }
        }
        
        System.out.print("The prime numbers are: ");

        for (int p = 2; p < arr.length; p++) {
            if (arr[p]) {
                System.out.print(p + " ");
            }
        }

	}

}
