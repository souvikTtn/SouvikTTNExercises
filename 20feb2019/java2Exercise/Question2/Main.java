/*sorting a string without using string api*/
package java2Exercise.Question2;

public class Main {
    public static void main(String []args)
    {
        String str="xyzWDdwmAa";
        int []tempArray=new int[str.length()];
        char []array=str.toCharArray();
        System.out.println("original string");
        for(int i=0;i<array.length;i++)
        {
            tempArray[i]=array[i];
            System.out.print(array[i]);
        }
        int []tempArray2=new int[str.length()];
        for(int i=0;i<str.length();i++)
        {
            if(tempArray[i]>=65 && tempArray[i]<=90)
                tempArray2[i]=tempArray[i]+32;
            else tempArray2[i]=tempArray[i];
            //System.out.println(tempArray2[i]+" "+tempArray[i]);
        }
        System.out.println();
        //sorting using bubble sort
        for(int i=0;i<str.length()-1;i++){
            for(int j=0;j<str.length()-i-1;j++)
            {
               // System.out.println(tempArray[j]+" "+tempArray[j+1]);
                if(tempArray2[j]>tempArray2[j+1])
                {
                    swap(tempArray,j);
                    swap(tempArray2,j);
                }
            }
        }
        System.out.println("the sorted String is ");
        for(int i=0;i<str.length();i++)
            System.out.print((char)tempArray[i]);
    }
    public static void swap(int []array,int index)
    {
        int temp=array[index];
        array[index]=array[index+1];
        array[index+1]=temp;
    }
}
