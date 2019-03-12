package Springcore.Question1.Question8_3;

import Springcore.Question1.Question3And4.HotDrink;

public class Tea implements HotDrink {
    @Override
    public void prepareDrink() {
        System.out.println("preparing Tea");
    }
}
