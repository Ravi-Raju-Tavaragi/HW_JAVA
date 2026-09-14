package LoopPractice;

import java.util.Scanner;

public class Loop6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :");
        int n = sc.nextInt();

        
        boolean prime = true;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                prime = false;
                break;
            }
        }

        if (prime && n > 1) {
            System.out.println("Prime number");
        } else {
            System.out.println("Not a prime number");
        }
        sc.close();
    }
}

