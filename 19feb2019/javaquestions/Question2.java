/*Write a program to find the number of occurrences of the duplicate words in a string and print them ?*/
package javaquestions;

public class Question2 {
    public static void main(String [] args)
    {
        String str=" hello this is hello world from java this ";
        String tempStr=str.trim();
        tempStr=tempStr+" ";
        System.out.println(str);
        StringBuffer str2=new StringBuffer();
        for(int i=0;i<tempStr.length();i++)
        {
            if(tempStr.charAt(i)!=' ')
            {
                str2.append(tempStr.charAt(i));
            }
            else{
                System.out.print("word ::"+str2);
                if(tempStr.contains(str2)){
                    String temp="";
                    if(tempStr.indexOf(new String(str2))!=0)
                        temp+=" "+new String(str2);
                    if(tempStr.indexOf(temp)!=tempStr.lastIndexOf(temp))
                        System.out.println(" is duplicate word");
                    else
                        System.out.println(" is not duplicate word");
                }
                str2.delete(0,str2.length());
            }
        }
    }
}
