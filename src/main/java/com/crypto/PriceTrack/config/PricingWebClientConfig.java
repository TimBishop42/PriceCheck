package com.crypto.PriceTrack.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class PricingWebClientConfig {

    private static final String COIN_GECKO_BASE_URL = "https://api.coingecko.com/api/v3";

    @Bean(name = "coinGeckoWebClient")
    public WebClient getCoinGeckoWebClient(String url) {
        return WebClient.builder()
                .baseUrl(url)
                .build();
    }

}
