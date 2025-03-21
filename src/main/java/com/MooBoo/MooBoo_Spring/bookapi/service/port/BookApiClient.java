package com.MooBoo.MooBoo_Spring.bookapi.service.port;

import com.MooBoo.MooBoo_Spring.bookapi.domain.BookApi;
import com.MooBoo.MooBoo_Spring.bookapi.domain.SearchParam;
import reactor.core.publisher.Mono;

import java.io.UnsupportedEncodingException;
import java.util.List;

public interface BookApiClient {

    Mono<List<BookApi>> getBooksBySearchParam(SearchParam searchParam);

    Mono<BookApi> getBookByIsbn(String isbn);
}
