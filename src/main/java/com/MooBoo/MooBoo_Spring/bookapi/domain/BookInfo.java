package com.MooBoo.MooBoo_Spring.bookapi.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class BookInfo {
    @JsonProperty("itemPage")
    private String itemPage;
}
