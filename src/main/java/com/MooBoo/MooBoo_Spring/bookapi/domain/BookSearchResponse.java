package com.MooBoo.MooBoo_Spring.bookapi.domain;

import lombok.Builder;
import lombok.Data;

/**
 * API 응답을 위한 DTO
 */
@Data
@Builder
public class BookSearchResponse {
    private String isbn13;
    private String title;
    private String description;
    private String author;
    private String cover;
    private String publisher;
    private String pubDate;
    private String itemPage;

}

