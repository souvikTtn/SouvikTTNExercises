package java2Exercise.Question8;
import java.util.Scanner;
public class main {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        boolean flag=true;
        while (flag){
            String temp=sc.next();
            if(temp.charAt(0)==temp.charAt(temp.length()-1))
                System.out.println("first character is equal to last character "+temp);
            if(temp.equals("done"))
                flag=false;
        }
    }
}
