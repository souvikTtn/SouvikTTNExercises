/*Find common elements between two arrays.*/
package javaquestions;

public class Question5 {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6};
        int []arr2={1,8,9,3,4,5};
        StringBuffer s1=new StringBuffer();

        StringBuffer s2=new StringBuffer();

        for (int i = 0; i < arr.length; i++)
            s1.append(arr[i]);
        String temps1=s1.toString();
        for (int i = 0; i < arr2.length; i++)
            s2.append(arr2[i]);
        String temps2=s2.toString();

        for(int i=0;i<temps1.length();i++)
        {
             if(temps2.contains(temps1.charAt(i)+""))
            System.out.println(temps1.charAt(i));
        }
    }
}
