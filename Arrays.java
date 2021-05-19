import java.util.*;
public class Arrays {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int A[]=new int[10];
        System.out.println("Enter the values for the array:");
        for(int i=0;i<10;i++)
        {
            A[i]=sc.nextInt();
        }
        for(int i=0;i<10;i++)
        {
            System.out.print(A[i]+" ");
        }

    }
}
