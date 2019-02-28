package java2Exercise.Question5;

class Person1 implements Cloneable
{
    String Name;
    int Age;

    Person1(String Name, int Age)
    {
        this.Name = Name;
        this.Age = Age;
    }

    Person1(Person1 s)
    {
        System.out.println("Copy Constuctor called!!");
        Name = s.Name;
        Age = s.Age;
    }

    public Object clone()throws CloneNotSupportedException
    {
        return super.clone();
    }

}

public class ObjectClone
{
    public static void main(String[] args)
    {
        try
        {
            Person1 s1 = new Person1("THANOS", 35);
            Person1 s2 = (Person1) s1.clone();
            Person1 s3 = new Person1(s1);
            System.out.println("Person 2 : "+s2.Name+"  age : "+s2.Age);
            System.out.println("Person 3 : "+s3.Name+"  age : "+s3.Age);
        }
        catch (CloneNotSupportedException e)
        {
            System.out.println("Exception: "+e);
        }
    }

}
