package com.spring.kubernetes.api;

import com.spring.kubernetes.domain.*;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bookmarks")
@RequiredArgsConstructor
public class BookMarkController {
    public final BookMarkService bookMarkService;

    @GetMapping
    public BookmarksDTO getBookMarks(@RequestParam(name = "page", defaultValue = "1") Integer page,
                                     @RequestParam(name = "query", defaultValue = "") String query) {
        if (query == null || query.trim().length() == 0) {
            return bookMarkService.getBookMarks(page);
        }
        return bookMarkService.searchBookMarks(query,page);

    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public BookmarkDto createBookMark(@RequestBody @Valid CreateBookMarkRequest request){

        return bookMarkService.createBookMark(request);
    }

}
