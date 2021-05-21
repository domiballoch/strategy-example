package strategy.example.standarddiscounter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import strategy.example.config.ConfigProperties;
import strategy.example.domain.FreeGift;

import java.math.BigDecimal;

@Slf4j
@Component
public class BlackFridayDiscounter implements Discounter, FreeGiftOffer {

      private ConfigProperties configProperties;

    /**
     * Alternative to Autowiring
     * Constructor injection example - refer to solid.txt
     */
    public BlackFridayDiscounter(ConfigProperties configProperties){
        this.configProperties = configProperties;
    }

    /**
     * Apply black friday discount
     *
     * @param amount
     * @return multiple of BigDecimal 0.5
     */
    @Override
    public BigDecimal applyDiscount(final BigDecimal amount) {
        log.info("Applying discount: {}", amount);
        return amount.multiply(new BigDecimal(String.valueOf(configProperties.getBlackFriday())));
    }

    /**
     * Adds freeGift to basket - new behaviour in strategy
     *
     * @param freeGift
     * @return
     */
    @Override
    public FreeGift addFreeGift(FreeGift freeGift) {
        //basketService.addItemToBasket(freeGift);
        return freeGift;
    }
}
