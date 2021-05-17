package strategy.example.basketservice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import strategy.example.helper.DiscountHelper;
import strategy.example.helper.DiscountHelperWithContext;
import strategy.example.standarddiscounter.Discounter;
import strategy.example.utils.StrategyUtils;

import java.math.BigDecimal;

@Slf4j
@Service
public class ShoppingBasketImpl implements ShoppingBasket {

    @Autowired
    private DiscountHelper discountHelper;

    @Autowired
    private DiscountHelperWithContext discountHelperWithContext;

    /**
     * Calc of price of basket: total cost minus discount
     * Discounter can be switched from standard design to java 8
     *
     * @param totalPrice
     * @param discountCode
     * @return total as BigDecimal
     */
    public BigDecimal calculateBasket(final BigDecimal totalPrice, final String discountCode){
        final Discounter discounter = discountHelperWithContext.applyStrategyLogic(discountCode);
        //final DiscounterJava8 discounter = discountHelper.applyStrategyLogic(discountCode);
        final BigDecimal finalPrice = StrategyUtils.returnValueWithScale(totalPrice.subtract(discounter.applyDiscount(totalPrice)));
        log.info("Sum of basket: {}", StrategyUtils.returnValueWithScale(totalPrice));
        log.info("Discount applied: {}", StrategyUtils.returnValueWithScale(discounter.applyDiscount(totalPrice)));
        log.info("Final price: {}", StrategyUtils.returnValueWithScale(totalPrice.subtract(discounter.applyDiscount(totalPrice))));
        return StrategyUtils.returnValueWithScale(totalPrice.subtract(discounter.applyDiscount(totalPrice)));
    }

    /**
     * Calc total price of basket
     *
     * @param totalPrice
     * @return total as BigDecimal
     */
    public BigDecimal calculateBasket(final BigDecimal totalPrice){
        log.info("Sum of basket: {}", totalPrice);
        return StrategyUtils.returnValueWithScale(totalPrice);
    }
}
