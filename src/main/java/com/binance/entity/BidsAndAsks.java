package com.binance.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.Date;

@Data
@ToString
public class BidsAndAsks {
    String e;
    @JsonProperty("E") Date _E;
    @JsonProperty("T") Date _T;
    String s;
    String ps;
    @JsonProperty("U") String _U;
    String u;
    String pu;
    ArrayList<ArrayList<String>> b;
    ArrayList<ArrayList<String>> a;
}
