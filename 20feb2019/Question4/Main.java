/*creating a singleton class*/
//WAP to create singleton class.
package java2Exercise.Question4;
class SingletonDemo{
    private static SingletonDemo singletonDemo=null;
    private SingletonDemo(){
    }
    public static SingletonDemo getSingletonDemo(){
        if(singletonDemo==null){
            singletonDemo=new SingletonDemo();
            System.out.println("instance of class is created");
            return singletonDemo;
        }
        else{
            System.out.println("can't create any more instances since it is a singleton class");
            return singletonDemo;
        }
    }
}
public class Main {
    public static void main(String[] args) {
        SingletonDemo singletonDemo=SingletonDemo.getSingletonDemo();
        SingletonDemo singletonDemo1=SingletonDemo.getSingletonDemo();
        SingletonDemo singletonDemo2=SingletonDemo.getSingletonDemo();
        SingletonDemo singletonDemo3=SingletonDemo.getSingletonDemo();
        SingletonDemo singletonDemo4=SingletonDemo.getSingletonDemo();
        SingletonDemo singletonDemo5=SingletonDemo.getSingletonDemo();
        SingletonDemo singletonDemo6=SingletonDemo.getSingletonDemo();
        SingletonDemo singletonDemo7=SingletonDemo.getSingletonDemo();
        System.out.println(singletonDemo);
        System.out.println(singletonDemo1);
        System.out.println(singletonDemo2);
        System.out.println(singletonDemo3);
        System.out.println(singletonDemo4);
        System.out.println(singletonDemo5);
        System.out.println(singletonDemo6);
        System.out.println(singletonDemo7);
    }
}
