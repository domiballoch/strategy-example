package strategy.example.helper;

import strategy.example.java8discounter.DiscounterJava8;
import org.springframework.stereotype.Component;

@Component
public class DiscountHelper {

    /**
     * Applies strategy logic dynamically
     *
     * @param discountCode
     * @return Discounter interface
     */
    public DiscounterJava8 applyStrategyLogic(final String discountCode) {
        switch (discountCode) {
            case "EASTER20":
                return DiscounterJava8.easterDiscounter();
            case "XMAS35":
                return DiscounterJava8.christmasDiscounter();
            case "FRIDAY50":
                return DiscounterJava8.blackFridayDiscounter();
            default:
                throw new IllegalArgumentException("This code is no longer valid: " + discountCode);
        }
    }

}
