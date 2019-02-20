/*Write a single program for following operation using overloading
        A) Adding 2 integer number
        B) Adding 2 double
        C) multiplying 2 float
        D) multiplying 2 int
        E) concate 2 string
        F) Concate 3 String*/
package javaquestions;

public class Question10 {
    /*adding two int number*/
    public int add(int a,int b)
    {
        return (a+b);
    }
    /*adding two double numbers*/
    public double add(double a,double b)
    {
        return(a+b);
    }
    /*concat two strings*/
    public String add(String a,String b)
    {
        return (a.concat(b));
    }
    /*multiplying two float*/
    public float add(float a,float b)
    {
        return(a*b);
    }
    /*multiplying two int*/
    public int add(int a,int b,boolean c)
    {
        return(a*b);
    }
    /*concat three strings*/
    public String add(String a,String b,String c)
    {
        return(a+" "+b+" "+c);
    }
    public static void main(String[] args) {
        Question10 q=new Question10();
        System.out.println(q.add(10,20));
        System.out.println(q.add(10.0,20.0));
        System.out.println(q.add(10.0f,20.0f));
        System.out.println(q.add("hello","world"));
        System.out.println(q.add(10,20,true));
        System.out.println(q.add("hello","world","java"));
    }
}
