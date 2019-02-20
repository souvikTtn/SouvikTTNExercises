/*There is an array with every element repeated twice except one. Find that element*/
package javaquestions;

public class Question6 {
    public static void main(String[] args) {
        int []array=new int[]{2,3,4,5,3,4,2,6,6};
        HelperClass [] helperClasses=new HelperClass[array.length];
        for(int i=0;i<array.length;i++)
        {
            helperClasses[i]=new HelperClass(array[i]);
            for(int j=0;j<array.length;j++)
            {
                if(array[j]==helperClasses[i].getNumber())
                    helperClasses[i].setCount();
            }
        }
        for(int i=0;i<helperClasses.length;i++)
        {
            //System.out.println(helperClasses[i].getNumber()+" occurances "+helperClasses[i].getCount());
            if(helperClasses[i].getCount()==1)
                System.out.println("the element that is occuring once in the array is "+helperClasses[i].getNumber());
        }

    }
}
class HelperClass
{
    private int number;
    private int count;

    public int getNumber() {
        return number;
    }

    public HelperClass(int number) {
        this.number = number;
    }

    public int getCount() {
        return count;
    }

    public void setCount() {
        this.count++;
    }
}
