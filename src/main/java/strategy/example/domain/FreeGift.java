package strategy.example.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum FreeGift {

    CUDDLYTOY("TOY"),
    VOUCHER("VOUCHER"),
    BOBBLEHEAD("BOB"),
    PEN("PEN"),
    PHONECASE("CASE"),
    DVD("DVD"),
    NONE("NONE");

    private String abbreviation;

}
