package com.binance.services;

import com.binance.connector.futures.client.impl.CMWebsocketClientImpl;
import com.binance.entity.BidsAndAsks;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.springframework.stereotype.Service;

@Service
public class GetBidsAsksService {
    private final String SYMBOL = "BTCUSD_PERP";
    public BidsAndAsks bidsAndAsks;
    private ObjectMapper mapper = new ObjectMapper();

    public void startGetBTCUSDT_PREP(){
        CMWebsocketClientImpl client = new CMWebsocketClientImpl();
        client.diffDepthStream(SYMBOL, 100, ((event) -> {
            try {
                mapper.enable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
                bidsAndAsks = mapper.readValue(event, BidsAndAsks.class);
                System.out.println(bidsAndAsks.toString());
            } catch (JsonProcessingException e) {
                throw new RuntimeException(e);
            }
        }));
    }
}
