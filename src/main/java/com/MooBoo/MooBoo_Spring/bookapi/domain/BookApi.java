package com.MooBoo.MooBoo_Spring.bookapi.domain;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

/**
 * 외부 도서 API를 위한 도메인 엔티티
 */
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PROTECTED)
public class BookApi {
    private String isbn13;
    private String title;
    private String description;
    private String author;
    private String cover;
    private String publisher;
    private String pubDate;
    private Integer itemPage;


    //== 변환 메서드 ==//
    public static BookApi fromBookItem(BookItem bookItem) {
        return BookApi.builder()
                .isbn13(bookItem.getIsbn13())
                .title(bookItem.getTitle())
                .description(bookItem.getDescription())
                .author(bookItem.getAuthor())
                .cover(bookItem.getCover())
                .publisher(bookItem.getPublisher())
                .pubDate(bookItem.getPubDate())
                .itemPage(bookItem.getItemPage())
                .build();
    }
}
