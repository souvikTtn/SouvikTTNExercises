/*Create 3 sub class of bank SBI,BOI,ICICI all 4 should have method called getDetails
        which provide there specific details like rateofinterest etc,print details of every banks*/
package javaquestions;

public class Question11 {
    public static void main(String[] args) {
        Bank myBank = new Bank("Parent Bank", 7.5);
        myBank.getDetails();
        ICICIBank icici = new ICICIBank("ICICI Bank", 7.6);
        icici.getDetails();
        SBIBank sbi = new SBIBank("State Bank of India", 7.8);
        sbi.getDetails();
        BOIBank boi = new BOIBank("Bank of India", 7.7);
        boi.getDetails();
    }
}

class Bank {
    String bankName;
    double rateOfInterest;

    Bank(String name, double interest) {
        bankName = name;
        rateOfInterest = interest;

    }

    void getDetails() {
        System.out.println("___Bank Details___");
        System.out.println("Name: " + this.bankName);
        System.out.println("Rate of Interest: " + this.rateOfInterest + "%");
    }


}

class ICICIBank extends Bank {
    ICICIBank(String name, double interest) {
        super(name, interest);
    }
}
class SBIBank extends Bank{
    SBIBank(String name, double interest) {
        super(name, interest);
    }
}
class BOIBank  extends Bank{
    BOIBank(String name, double interest) {
        super(name, interest);
    }
}