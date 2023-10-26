package com.binance.configs;

import com.binance.entity.BidsAndAsks;
import com.binance.services.GetBidsAsksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BidsAsksConfig {

    public GetBidsAsksService service;

    @Autowired
    public BidsAsksConfig(GetBidsAsksService service) {
        this.service = service;
    }

    @Bean
    public void BidsAndAsks(){
        service.startGetBTCUSDT_PREP();
    }
}
