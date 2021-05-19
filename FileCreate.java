import java.io.*;
import java.util.*;
import java.lang.*;
public class FileCreate {
    public static void main(String args[]){
        try{
            Formatter f = new Formatter("C:\\Users\\Lenovo\\IdeaProjects\\JavaBasics\\Vijay.txt");
            Scanner sc=new Scanner(String.valueOf(f));
            f.format("%s %d %s","1",65,"Karthik");
            f.format("%s %d %s","2",78,"Govind");
            while(sc.hasNext())
            {
                System.out.println("True");
            }
            f.close();
        }catch(FileNotFoundException e)
        {
            System.out.println("Error");
        }

    }
}
