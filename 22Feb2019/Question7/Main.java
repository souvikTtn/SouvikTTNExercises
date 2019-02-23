package CollectionsAndDates.Question7;

public class Main {
    public static void main(String[] args) {
        SpecialStack specialStack=new SpecialStack(10);
        specialStack.push(5);
        specialStack.push(2);
        specialStack.push(1);
        specialStack.push(6);
        specialStack.push(9);
        System.out.println(specialStack.pop());
        System.out.println("minimum element is "+specialStack.getMin());
        System.out.println(specialStack.pop());
        System.out.println("minimum element is "+specialStack.getMin());
        System.out.println(specialStack.pop());
        System.out.println("minimum element is "+specialStack.getMin());
        System.out.println(specialStack.pop());
        System.out.println("minimum element is "+specialStack.getMin());
        System.out.println(specialStack.pop());
        //System.out.println("minimum element is "+specialStack.getMin());
        System.out.println(specialStack.isEmpty());

    }
}

