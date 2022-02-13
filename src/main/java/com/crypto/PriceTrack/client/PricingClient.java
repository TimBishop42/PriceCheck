package com.crypto.PriceTrack.client;

import com.crypto.PriceTrack.model.PriceData;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

@Service
@RequiredArgsConstructor
public class PricingClient {

    private final WebClient webclient;

    public Flux<PriceData> getAllSymbols
}
