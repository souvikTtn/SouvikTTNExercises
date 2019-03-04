class SingleTest{
    private static SingleTest t=null;

    private SingleTest(){
    }

    static int i=0;
    public synchronized static SingleTest getSingleTest()
    {
        if(t==null) {
             {
                    t = new SingleTest();
                    System.out.println("this is object no. " + (++i));

            }
        }
        return t;
    }
}



public class SingletonDesign {

    public static void main(String[] args) {
        SingleTest t1=SingleTest.getSingleTest();
        SingleTest t2=SingleTest.getSingleTest();
        System.out.println(t1);
        System.out.println(t2);
    }
}
























