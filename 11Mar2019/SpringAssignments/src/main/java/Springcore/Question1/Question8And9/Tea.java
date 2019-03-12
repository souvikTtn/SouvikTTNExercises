package Springcore.Question1.Question8And9;

import Springcore.Question1.Question3And4.HotDrink;
import org.springframework.stereotype.Component;

@Component
public class Tea implements HotDrink {
    @Override
    public void prepareDrink() {
        System.out.println("preparing Tea");
    }
}
