package strategy.example.basketservice;

import java.math.BigDecimal;

public interface ShoppingBasket {

    BigDecimal calculateBasket(final BigDecimal totalPrice, final String discount);

    BigDecimal calculateBasket(final BigDecimal totalPrice);
}
