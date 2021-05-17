package strategy.example.standarddiscounter;

import java.math.BigDecimal;

public interface Discounter {

    BigDecimal applyDiscount(final BigDecimal amount);

    /**
     * For open closed principle
     */
    //BigDecimal applyDiscountOCP();
}
