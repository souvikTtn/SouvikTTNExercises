/*Calculate the number & Percentage Of Lowercase Letters,Uppercase Letters, Digits And Other Special Characters In A String*/
package javaquestions;

public class Question4 {
    public static void main(String[] args) {
        String string="ABCdecD1234@$#^*()";
        int temp=0;
       int lCase=0,uCase=0,sChar=0,digit=0;
       for(int i=0;i<string.length();i++)
       {
           temp=string.charAt(i);
           //System.out.println(temp);
           if(temp>=65 && temp<=90)
               uCase++;
           if(temp>=33 && temp<=47)
               sChar++;
           if(temp>=97 && temp<=122)
               lCase++;
           if(temp>=48 && temp<=57)
               digit++;
       }
        System.out.println(string.length());
        System.out.println("total uppercase char :"+uCase+" total lowercase char :"+lCase+" total digits :"+
                digit+" total special characters :"+sChar);
        System.out.println("ucase % "+((float)uCase/string.length())*100);
        System.out.println("lcase % "+((float)lCase/string.length())*100);
        System.out.println("digit % "+((float)digit/string.length())*100);
        System.out.println("special characters % "+((float)sChar/string.length())*100);

    }
}
