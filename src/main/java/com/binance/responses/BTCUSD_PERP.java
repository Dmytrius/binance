package com.binance.responses;

import com.binance.enums.Pair;
import com.binance.enums.Symbol;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.ArrayList;
import java.util.Date;

@Data
public class BTCUSD_PERP {


    Integer lastUpdateId;
    @JsonProperty("s")
    Symbol symbol;
    @JsonProperty("ps")
    Pair pair;
    @JsonProperty("E")
    Date E;
    @JsonProperty("T")
    Date T;
    @JsonProperty("b")
    ArrayList<ArrayList<String>> bids;
    @JsonProperty("a")
    ArrayList<ArrayList<String>> asks;
}
