package org.toocoldtocode.crowdfund.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.toocoldtocode.crowdfund.StripeAPIKey;
import org.toocoldtocode.crowdfund.persistence.model.ChargeRequest;

import javax.annotation.PostConstruct;

@RestController
public class CheckoutController {

    private String stripeApiKey;

    @PostConstruct
    public void init() {
        stripeApiKey = StripeAPIKey.getKey();
    }

    @RequestMapping("/checkout")
    public String checkout(Model model) {
        model.addAttribute("amount", 50 * 100); // in cents. hardcoded for now
        model.addAttribute("stripeApiKey", stripeApiKey);
        model.addAttribute("currency", ChargeRequest.Currency.EUR);
        return "checkout";
    }
}
