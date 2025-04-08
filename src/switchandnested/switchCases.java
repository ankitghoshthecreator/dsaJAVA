package switchandnested;

import java.util.Scanner;

public class switchCases {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        switch (a){
            case 1:
                System.out.println("a");
            case 2:
                System.out.println("b");
                break;
            default:
                System.out.println("wrong");
                break;
        }
    }
}
