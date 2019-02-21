/*creating a singleton class*/
//WAP to create singleton class.
package java2Exercise.Question4;
class SingletonDemo{
    private static SingletonDemo singletonDemo=null;
    public static SingletonDemo getSingletonDemo(){
        if(singletonDemo==null){
            singletonDemo=new SingletonDemo();
            System.out.println("instance of class is created");
            return singletonDemo;
        }
        else{
            System.out.println("can't create any more instances since it is a singleton class");
            return null;
        }
    }
}
public class Main {
    public static void main(String[] args) {
        SingletonDemo singletonDemo=SingletonDemo.getSingletonDemo();
        SingletonDemo singletonDemo1=SingletonDemo.getSingletonDemo();

    }
}
