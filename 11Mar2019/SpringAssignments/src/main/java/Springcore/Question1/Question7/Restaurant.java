package Springcore.Question1.Question7;

import Springcore.Question1.Question3And4.HotDrink;
import org.springframework.beans.factory.annotation.Required;

public class Restaurant {
    private HotDrink hotDrink;
    public HotDrink getHotDrink() {
        return hotDrink;
    }

    @Required
    public void setHotDrink(HotDrink hotDrink) {
        this.hotDrink = hotDrink;
    }
}
