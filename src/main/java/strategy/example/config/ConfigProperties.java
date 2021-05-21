package strategy.example.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;

@Getter
@Setter
@Configuration
@ConfigurationProperties(prefix = "discount")
public class ConfigProperties {

    /**
     * BigDecimal used for precision and immutability
     * Use new when generating rather than valueOf as the latter uses Double which is not precise.
     */
    private BigDecimal easter;
    private BigDecimal christmas;
    private BigDecimal blackFriday;

}

