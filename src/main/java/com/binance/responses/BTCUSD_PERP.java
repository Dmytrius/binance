package com.binance.responses;

import com.binance.enums.*;
import com.binance.enums.Symbol;
import lombok.Data;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Date;

@Data
public class BTCUSD_PERP {

    Date lastUpdateId;
    Symbol symbol;
    Pair pair;
    Date E;
    Date T;
    ArrayList<AbstractMap.SimpleEntry<String, String>> bids;
    ArrayList<AbstractMap.SimpleEntry<String, String>> asks;
}
