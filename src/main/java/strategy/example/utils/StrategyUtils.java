package strategy.example.utils;

import lombok.experimental.UtilityClass;

import java.math.BigDecimal;
import java.math.RoundingMode;

@UtilityClass
public class StrategyUtils {

    public BigDecimal returnValueWithScale(final BigDecimal value) {
        return value.setScale(2, RoundingMode.HALF_UP) ;
    }
}
