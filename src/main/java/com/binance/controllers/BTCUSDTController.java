package com.binance.controllers;

import com.binance.responses.BTCUSD_PERP;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BTCUSDTController {

    @GetMapping(path = "/dapi/v1/depth")
    public BTCUSD_PERP getOrderBook(
            @PathVariable String symbol,
            @PathVariable Integer limit
            ){
        return new BTCUSD_PERP();
    }
}
