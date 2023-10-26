package com.binance.controllers;

import com.binance.responses.BTCUSD_PERP;
import com.binance.services.BTCUSDTService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BTCUSDTController {

    private final BTCUSDTService service;

    @Autowired
    public BTCUSDTController(BTCUSDTService service) {
        this.service = service;
    }

    @GetMapping(path = "/dapi/v1/depth",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public BTCUSD_PERP getOrderBook(
            @RequestParam String symbol,
            @RequestParam(required = false, defaultValue = "500") String limit
            ){
        return service.getOrderBook();
    }
}
