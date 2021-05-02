package strategy.example.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Getter
@Setter
@Configuration
@ConfigurationProperties(prefix = "discount")
public class ConfigProperties {

    private Double easter;
    private Double christmas;
    private Double blackFriday;

}

