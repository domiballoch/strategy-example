package strategy.example.basketservice;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class ShoppingBasketTest {

    @Autowired
    private ShoppingBasketImpl shoppingBasketImpl;

    private static final String EASTER_CODE = "EASTER20";
    private static final String XMAS_CODE = "XMAS35";
    private static final String BLACK_FRIDAY_CODE = "FRIDAY50";
    private static final String EXPIRED_CODE = "25-OFF";

    @Test
    public void shouldApplyStrategyWithEasterDiscountAndCalcTotal() {
        final BigDecimal totalPrice = new BigDecimal("100.00");
        final BigDecimal priceMinusEasterDiscount = shoppingBasketImpl.calculateBasket(totalPrice, EASTER_CODE);

        assertThat(priceMinusEasterDiscount).isEqualByComparingTo(new BigDecimal("80.00"));
    }

    @Test
    public void shouldApplyStrategyWithChristmasDiscountAndCalcTotal() {
        final BigDecimal totalPrice = (new BigDecimal("100.00"));
        final BigDecimal priceMinusChristmasDiscount = shoppingBasketImpl.calculateBasket(totalPrice, XMAS_CODE);

        assertThat(priceMinusChristmasDiscount).isEqualByComparingTo(new BigDecimal("65.00"));
    }

    @Test
    public void shouldApplyStrategyWithBlackFridayDiscountAndCalcTotal() {
        final BigDecimal totalPrice = (new BigDecimal("100.00"));
        final BigDecimal priceMinusBlackFridayDiscount = shoppingBasketImpl.calculateBasket(totalPrice, BLACK_FRIDAY_CODE);

        assertThat(priceMinusBlackFridayDiscount).isEqualByComparingTo(new BigDecimal("50.00"));
    }

    @Test
    public void shouldThrowException() {
        final BigDecimal productPrice = (new BigDecimal("100.00"));
        final Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            shoppingBasketImpl.calculateBasket(productPrice, EXPIRED_CODE);
        });
        final String expectedMessage = "This code is no longer valid: ";
        final String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void shouldReturnTotalWithoutDiscount() {
        final BigDecimal productPrice = (new BigDecimal("100.00"));
        final BigDecimal price = shoppingBasketImpl.calculateBasket(productPrice);

        assertThat(price).isEqualByComparingTo(new BigDecimal("100.00"));
    }
}
