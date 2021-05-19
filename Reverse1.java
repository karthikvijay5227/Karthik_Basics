import java.util.*;
import java.lang.*;
public class Reverse1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name:");
        String name=sc.nextLine();
        StringBuilder sb=new StringBuilder(name);
        StringBuilder rev = sb.reverse();
        System.out.println(rev);

    }
}
