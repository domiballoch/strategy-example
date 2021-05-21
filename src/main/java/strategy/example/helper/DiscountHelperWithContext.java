package strategy.example.helper;

import strategy.example.standarddiscounter.BlackFridayDiscounter;
import strategy.example.standarddiscounter.ChristmasDiscounter;
import strategy.example.standarddiscounter.Discounter;
import strategy.example.standarddiscounter.EasterDiscounter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DiscountHelperWithContext {

    @Autowired
    private StrategyContext strategyContext;

    @Autowired
    private EasterDiscounter easterDiscounter;

    @Autowired
    private ChristmasDiscounter christmasDiscounter;

    @Autowired
    private BlackFridayDiscounter blackFridayDiscounter;

    /**
     * Applies strategy logic dynamically
     *
     * @param discountCode
     * @return Discounter interface
     */
    public Discounter applyStrategyLogic(final String discountCode) {
        switch (discountCode) {
            case "EASTER20":
                strategyContext.setDiscounter(easterDiscounter);
                break;
            case "XMAS35":
                strategyContext.setDiscounter(christmasDiscounter);
                break;
            case "FRIDAY50":
                strategyContext.setDiscounter(blackFridayDiscounter);
                break;
            default:
                throw new IllegalArgumentException("This code is no longer valid: " + discountCode);
        }
        return strategyContext.getDiscounter(); //or strategyContext.executeStrategy();
    }

}
