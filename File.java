import java.io.*;
import java.util.*;
public class Hello {
    public static void main(String args[]){
        File f=new File("C:\\Users\\Lenovo\\IdeaProjects\\JavaBasics\\Karthik.txt");
        try {
            Scanner sc=new Scanner(f);
            while(sc.hasNext())
            {
                System.out.print(sc.next());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Hello Java");
        if(f.exists())
        {
            System.out.println(f.getName()+" exists");

        }
        else
        {
            System.out.println(f.getName()+" doesn't exist");
        }

    }
}
