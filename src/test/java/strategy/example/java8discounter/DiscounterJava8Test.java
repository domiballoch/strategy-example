package strategy.example.java8discounter;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;

public class DiscounterJava8Test {

    @Test
    public void shouldApplyEasterDiscount() {
        final BigDecimal totalPrice = new BigDecimal("100.00");
        final BigDecimal easterDiscount = DiscounterJava8.easterDiscounter().applyDiscount(totalPrice);
        assertThat(easterDiscount).isEqualByComparingTo(new BigDecimal("20"));
    }

    @Test
    public void shouldApplyChristmasDiscount() {
        final BigDecimal totalPrice = new BigDecimal("100.00");
        final BigDecimal christmasDiscount = DiscounterJava8.christmasDiscounter().applyDiscount(totalPrice);
        assertThat(christmasDiscount).isEqualByComparingTo(new BigDecimal("35"));
    }

    @Test
    public void shouldApplyBlackFridayDiscount() {
        final BigDecimal totalPrice = new BigDecimal("100.00");
        final BigDecimal blackFridayDiscount = DiscounterJava8.blackFridayDiscounter().applyDiscount(totalPrice);
        assertThat(blackFridayDiscount).isEqualByComparingTo(new BigDecimal("50"));
    }

}
