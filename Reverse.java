import java.util.*;
public class Reverse {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String name;
        System.out.println("Enter the name:");
        name=sc.nextLine();
        int n=name.length();
        String reverse = " ";
        for(int i = 0; i<n; i++) {
            reverse += name.charAt(n - 1 - i);
            if(name.charAt(i)==' '){
                continue;
            }
        }
        System.out.println("The reversed string is: "+reverse);
        sc.close();


    }
}
