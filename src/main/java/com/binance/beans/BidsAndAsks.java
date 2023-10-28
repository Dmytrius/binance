package com.binance.beans;

import com.binance.connector.futures.client.impl.CMWebsocketClientImpl;
import com.binance.entities.BTCUSDT;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BidsAndAsks {

    private final String SYMBOL = "BTCUSD_PERP";
    @Autowired
    public BTCUSDT btcusdt;

    @PostConstruct
    public void init(){
        CMWebsocketClientImpl client = new CMWebsocketClientImpl();
        btcusdt.id = client.diffDepthStream(SYMBOL, 100, ((event) -> {
                btcusdt.message = event;
                System.out.println(btcusdt.toString());
        }));
    }
}