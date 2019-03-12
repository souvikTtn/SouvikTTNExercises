package Springcore.Question1.Question8And9;

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
    public void setHotDrink(HotDrink hotDrink) {
        this.hotDrink = hotDrink;
    }
}
