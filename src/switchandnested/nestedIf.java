package switchandnested;

import java.util.Objects;
import java.util.Scanner;

public class nestedIf {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        String a=in.nextLine();

        if(Objects.equals(a, "mango")){
            System.out.print("king of fruits");
        } else if (a.equals("apple")) {
            System.out.println("Red sweet");
        } else{
            System.out.println("nothing");
        }
    }
}
