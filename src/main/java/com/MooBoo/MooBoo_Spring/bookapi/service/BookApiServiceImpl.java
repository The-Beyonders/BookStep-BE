package com.MooBoo.MooBoo_Spring.bookapi.service;

import com.MooBoo.MooBoo_Spring.bookapi.controller.port.BookApiService;
import com.MooBoo.MooBoo_Spring.bookapi.domain.BookApi;
import com.MooBoo.MooBoo_Spring.bookapi.domain.SearchParam;
import com.MooBoo.MooBoo_Spring.bookapi.service.port.BookApiClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookApiServiceImpl implements BookApiService {

    private final BookApiClient bookApiClient;

    @Override
    public Mono<List<BookApi>> searchBooks(SearchParam searchParam) {
        return bookApiClient.getBooksBySearchParam(searchParam);
    }

    @Override
    public Mono<BookApi> searchBook(String isbn13) {
        return bookApiClient.getBookByIsbn(isbn13);
    }
}
