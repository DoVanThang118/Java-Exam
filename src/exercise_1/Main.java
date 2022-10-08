package exercise_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Bank b = new Bank();
        b.setBalance(sc.nextInt());
        b.setRate(sc.nextInt());
        if (b.getBalance()<0 || b.getRate()<0){
            System.out.println("ERRORS !!!!"+"\n"+"AGAIN !!!!");
            do {
                b.setBalance(sc.nextInt());
                b.setRate(sc.nextInt());
            }while (b.getBalance()<0 || b.getRate()<0);
        }
        System.out.println(b.calculateInterest());
    }
}
