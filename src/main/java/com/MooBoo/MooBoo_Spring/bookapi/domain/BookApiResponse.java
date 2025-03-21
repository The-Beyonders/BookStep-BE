package com.MooBoo.MooBoo_Spring.bookapi.domain;

import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * 외부 API 로부터 데이터를 저장할 DTO
 */
@Data
@Builder
public class BookApiResponse {

    private Integer totalResults;
    private String query;
    private List<BookItem> item = new ArrayList<>();

}
