package com.binance.services;

import com.binance.responses.BTCUSD_PERP;
import org.springframework.stereotype.Service;

public interface BTCUSDTService {
    BTCUSD_PERP getOrderBook();
}
