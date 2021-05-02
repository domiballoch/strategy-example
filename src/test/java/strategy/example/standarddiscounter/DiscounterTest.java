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
        final BigDecimal totalPrice = easterDiscounter.applyDiscount(BigDecimal.valueOf(100.00));
        assertThat(totalPrice).isEqualByComparingTo(BigDecimal.valueOf(20));
    }

    @Test
    public void shouldApplyChristmasDiscount() {
        final BigDecimal totalPrice = christmasDiscounter.applyDiscount(BigDecimal.valueOf(100.00));
        assertThat(totalPrice).isEqualByComparingTo(BigDecimal.valueOf(35));
    }

    @Test
    public void shouldApplyBlackFridayDiscount() {
        final BigDecimal totalPrice = blackFridayDiscounter.applyDiscount(BigDecimal.valueOf(100.00));
        assertThat(totalPrice).isEqualByComparingTo(BigDecimal.valueOf(50));
    }
}
