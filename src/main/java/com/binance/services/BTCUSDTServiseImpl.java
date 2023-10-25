package com.binance.services;

import com.binance.responses.BTCUSD_PERP;
import org.springframework.stereotype.Service;

@Service
public class BTCUSDTServiseImpl implements BTCUSDTService {
    @Override
    public BTCUSD_PERP getOrderBook() {
        return new BTCUSD_PERP();
    }
}
