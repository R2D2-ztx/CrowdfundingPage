package org.toocoldtocode.crowdfund.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.toocoldtocode.crowdfund.persistence.model.ChargeRequest;

@RestController
public class CheckoutController {

    @Value("${STRIPE_API_KEY}")
    private String stripeApiKey;

    @RequestMapping("/checkout")
    public String checkout(Model model) {
        model.addAttribute("amount", 50 * 100); // in cents
        model.addAttribute("stripeApiKey", stripeApiKey);
        model.addAttribute("currency", ChargeRequest.Currency.EUR);
        return "checkout";
    }
}
