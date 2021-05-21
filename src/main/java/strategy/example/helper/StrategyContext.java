package strategy.example.helper;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;
import strategy.example.standarddiscounter.Discounter;

import java.math.BigDecimal;

@Getter
@Setter
@Component
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class StrategyContext {

    private Discounter discounter;

    public Discounter executeStrategy() {
        return discounter;
    }

    /**
     * For open closed principle
     */
//    public BigDecimal executeStrategyOCP(final Discounter discounter){
//        return discounter.applyDiscountOCP();
//    }

}
