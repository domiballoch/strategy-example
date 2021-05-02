package strategy.example.helper;

import strategy.example.standarddiscounter.Discounter;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class StrategyContext {

    private Discounter discounter;

}
