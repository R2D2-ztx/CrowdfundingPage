package org.toocoldtocode.crowdfund;

import io.github.cdimascio.dotenv.Dotenv;

/*
* Singleton Class to provide Stripe's api key across the application
* */
public class StripeAPIKey {

    private static StripeAPIKey stripeAPIKey = null;
    private String apiKey;

    private StripeAPIKey() {
        Dotenv dotenv = Dotenv.load();
        apiKey = dotenv.get("STRIPE_API_KEY");
    }

    public static StripeAPIKey getInstance() {
        if (stripeAPIKey == null) {
            stripeAPIKey = new StripeAPIKey();
        }

        return stripeAPIKey;
    }

    public static String getKey() {
        return getInstance().apiKey;
    }
}
