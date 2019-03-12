package Springcore.Question1.Question1;

import Springcore.Question1.Question1.Database;

public class Main {
    public static void main(String[] args) {
        Database database=new Database();
        database.setName("Oracle");
        database.setPort(3342);

        System.out.println(" name "+database.getName()+" port no "+database.getPort());
    }
}
