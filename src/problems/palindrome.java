package problems;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter a number: ");
        int a=in.nextInt();

        checkPal(a);
    }

    static void checkPal(int a) {
        int count=0, h=0, duplicate=a, v=a;
        while(a>0){
            int c=a%10;
            count++;
            a=a/10;
        }
        System.out.println(count);
        for(int i=0; i<count; i++){
            int c=v%10;
            h=(h*10)+c;
            v=v/10;
        }
        System.out.println(h);
    }
}
