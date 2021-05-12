package strategy.example.helper;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import strategy.example.standarddiscounter.Discounter;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class StrategyContext {

    private Discounter discounter;

}
