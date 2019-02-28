package Java8.Question1;
@FunctionalInterface
interface GreaterNumber{
    boolean greater(int a,int b);
}
@FunctionalInterface
interface Incrementer{
    int incrementBy1(int a);
}
@FunctionalInterface
interface Concatenator{
    String concat(String a,String b);
}
@FunctionalInterface
interface UpperCase{
    String toUpperCase(String s);
}
public class Demo1 {
    public static void main(String[] args) {
      GreaterNumber greaterNumber=(a,b)->(a>b);
          /*if(a>b) return true;
          return false;*/

        System.out.println(greaterNumber.greater(3,4));
        System.out.println(greaterNumber.greater(7,6));
        Incrementer incrementer=a->a+1;
        System.out.println(incrementer.incrementBy1(5));
        Concatenator concatenator=(a,b)->a+" "+b;
        System.out.println(concatenator.concat("hello","world"));
        UpperCase upperCase=s->s.toUpperCase();
        System.out.println(upperCase.toUpperCase("souvik"));
    }
}
