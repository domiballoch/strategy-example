package strategy.example.standarddiscounter;

import strategy.example.config.ConfigProperties;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Slf4j
@Setter
@Component
public class EasterDiscounter implements Discounter {

    @Autowired
    private ConfigProperties configProperties;

    /**
     * Apply easter discount
     *
     * @param amount
     * @return multiple of BigDecimal 0.2
     */
    @Override
    public BigDecimal applyDiscount(final BigDecimal amount) {
        log.info("Applying discount: {}", amount);
        return amount.multiply(BigDecimal.valueOf(configProperties.getEaster()));
    }
}
