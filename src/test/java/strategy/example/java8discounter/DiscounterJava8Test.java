package strategy.example.java8discounter;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;

public class DiscounterJava8Test {

    @Test
    public void shouldApplyEasterDiscount() {
        final BigDecimal totalPrice = BigDecimal.valueOf(100.00);
        final BigDecimal easterDiscount = DiscounterJava8.easterDiscounter().applyDiscount(totalPrice);
        assertThat(easterDiscount).isEqualByComparingTo(BigDecimal.valueOf(20));
    }

    @Test
    public void shouldApplyChristmasDiscount() {
        final BigDecimal totalPrice = BigDecimal.valueOf(100.00);
        final BigDecimal christmasDiscount = DiscounterJava8.christmasDiscounter().applyDiscount(totalPrice);
        assertThat(christmasDiscount).isEqualByComparingTo(BigDecimal.valueOf(35));
    }

    @Test
    public void shouldApplyBlackFridayDiscount() {
        final BigDecimal totalPrice = BigDecimal.valueOf(100.00);
        final BigDecimal blackFridayDiscount = DiscounterJava8.blackFridayDiscounter().applyDiscount(totalPrice);
        assertThat(blackFridayDiscount).isEqualByComparingTo(BigDecimal.valueOf(50));
    }

}
