package strategy.example.helper;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import strategy.example.standarddiscounter.Discounter;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Getter
@Setter
@Component
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class StrategyContext {

    private Discounter discounter;

    /**
     * For open closed principle
     */
//    public BigDecimal executeStrategyOCP(final Discounter discounter){
//        return discounter.applyDiscountOCP();
//    }

}
