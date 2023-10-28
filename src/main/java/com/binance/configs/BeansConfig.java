package com.binance.configs;

import com.binance.beans.BidsAndAsks;
import com.binance.entities.BTCUSDT;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BeansConfig {
    @Bean
    BidsAndAsks bidsAndAsks(){
        return new BidsAndAsks();
    }

    @Bean
    @Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
    @Qualifier("BTCUSDT")
    BTCUSDT btcusdt(){
        return new BTCUSDT();
    }
}
