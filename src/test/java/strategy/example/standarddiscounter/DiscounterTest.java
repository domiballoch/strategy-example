package strategy.example.standarddiscounter;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

import java.math.BigDecimal;

@SpringBootTest
public class DiscounterTest {

    @Autowired
    private Discounter easterDiscounter;

    @Autowired
    private Discounter christmasDiscounter;

    @Autowired
    private Discounter blackFridayDiscounter;

    @Test
    public void shouldApplyEasterDiscount() {
        final BigDecimal totalPrice = easterDiscounter.applyDiscount(new BigDecimal("100.00"));
        assertThat(totalPrice).isEqualByComparingTo(new BigDecimal("20.00"));
    }

    @Test
    public void shouldApplyChristmasDiscount() {
        final BigDecimal totalPrice = christmasDiscounter.applyDiscount(new BigDecimal("100.00"));
        assertThat(totalPrice).isEqualByComparingTo(new BigDecimal("35.00"));
    }

    @Test
    public void shouldApplyBlackFridayDiscount() {
        final BigDecimal totalPrice = blackFridayDiscounter.applyDiscount(new BigDecimal("100.00"));
        assertThat(totalPrice).isEqualByComparingTo(new BigDecimal("50.00"));
    }
}
