package com.binance.services;

import com.binance.entities.BTCUSDT;
import com.binance.responses.BTCUSD_PERP;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class BTCUSDTServiseImpl implements BTCUSDTService {

    @Autowired
    private ApplicationContext context;
    @Autowired
    private ObjectMapper mapper;
    @Override
    public BTCUSD_PERP getOrderBook() {
        BTCUSDT btcusdt = context.getBean(BTCUSDT.class);
        BTCUSD_PERP response;
        try {
            response = mapper.readValue(btcusdt.message, BTCUSD_PERP.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        response.setLastUpdateId(btcusdt.id);
        return response;
    }
}
