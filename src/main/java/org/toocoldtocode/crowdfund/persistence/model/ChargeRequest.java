package org.toocoldtocode.crowdfund.persistence.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class ChargeRequest {

    public enum Currency {
        EUR, USD;
    }
    private String description;
    private int amount;
    private Currency currency;
    private String stripeEmail;
    private String stripeToken;
}
