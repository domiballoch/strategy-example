package strategy.example.java8discounter;

import java.math.BigDecimal;

public interface DiscounterJava8 {

    BigDecimal applyDiscount(final BigDecimal amount);

    static DiscounterJava8 easterDiscounter() {
        return amount -> amount.multiply(BigDecimal.valueOf(0.2));
    }

    static DiscounterJava8 christmasDiscounter() {
        return amount -> amount.multiply(BigDecimal.valueOf(0.35));
    }

    static DiscounterJava8 blackFridayDiscounter() {
        return amount -> amount.multiply(BigDecimal.valueOf(0.5));
    }

}
