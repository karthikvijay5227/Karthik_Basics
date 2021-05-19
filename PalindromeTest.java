import java.util.*;
public class PalindromeTest {
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter the name:");
       String name=sc.nextLine();
        StringBuilder revBuilder = new StringBuilder();
        for(int i = name.length()-1; i>=0; i--)
       {
           revBuilder.append(name.charAt(i));
       }
        String rev = revBuilder.toString();
        System.out.println("Reverse is: "+rev);
       if(name.equals(rev)||(name.compareToIgnoreCase(rev))==0)
       {
           System.out.println("Palindrome");
       }
       else
       {
           System.out.println("Not Palindrome");
       }
    }
}
