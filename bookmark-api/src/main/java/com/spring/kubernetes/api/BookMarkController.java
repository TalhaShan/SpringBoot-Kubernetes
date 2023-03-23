package com.spring.kubernetes.api;

import com.spring.kubernetes.domain.BookMark;
import com.spring.kubernetes.domain.BookMarkService;
import com.spring.kubernetes.domain.BookmarkMapper;
import com.spring.kubernetes.domain.BookmarksDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/bookmarks")
@RequiredArgsConstructor
public class BookMarkController {
    public final BookMarkService bookMarkService;

    @GetMapping
    public BookmarksDTO getBookMarks(@RequestParam(name = "page",defaultValue = "1") Integer page) {
        return bookMarkService.getBookMarks(page);
    }

}
