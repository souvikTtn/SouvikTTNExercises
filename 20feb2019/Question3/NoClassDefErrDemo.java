package java2Exercise.Question3;

public class NoClassDefErrDemo {
    public static void main(String []args) {
        DemoClass demoClass = new DemoClass();
        demoClass.showMessage();
    }
}
class DemoClass {
    public void showMessage(){
        System.out.println("this is a dummy class");
    }
}
/*code will compile fine but after compilation there would be two .class files
* delete the demo.class file
* and then running the program we will get NoClassDefError
* */