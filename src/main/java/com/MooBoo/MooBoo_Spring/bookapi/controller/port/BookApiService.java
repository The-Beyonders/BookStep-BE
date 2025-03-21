package com.MooBoo.MooBoo_Spring.bookapi.controller.port;

import com.MooBoo.MooBoo_Spring.bookapi.domain.BookApi;
import com.MooBoo.MooBoo_Spring.bookapi.domain.SearchParam;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.List;

@Service
public interface BookApiService {
    Mono<List<BookApi>> searchBooks(SearchParam searchParam);

    Mono<BookApi> searchBook(String isbn13);
}
