/*Write a program to display values of enums using a constructor & getPrice() method (Example display house & their prices)*/
package javaquestions;

public class Question9 {
    enum House{
        LIG(1000),MIG(2000),HIG(3000),SHIG(4000);
        float price;
        House(int price){
            System.out.println("name of the houses "+this);
           this.price=price;
        }
        public float getPrice()
        {
            return this.price;
        }
    }

    public static void main(String[] args) {
        House []houses=House.values();
        for(int i=0;i<houses.length;i++)
            System.out.println("name :: "+houses[i]+" price:: "+houses[i].getPrice());
    }
}
