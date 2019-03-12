package Springcore.Question1.Question8_2;

import Springcore.Question1.Question3And4.HotDrink;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Restaurant {
    private HotDrink hotDrink;

    public HotDrink getHotDrink() {
        return hotDrink;
    }

    @Autowired
    public Restaurant(HotDrink hotDrink){
        this.hotDrink=hotDrink;
    }
}
