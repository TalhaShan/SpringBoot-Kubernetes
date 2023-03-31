package com.spring.kubernetes.domain;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.Instant;


@Service
@Transactional
@RequiredArgsConstructor
public class BookMarkService {

    private final BookMarkRepository bookMarkRepository;
    private final BookmarkMapper bookmarkMapper;

    //
//    @Transactional(readOnly = true)
//    public BookmarksDTO getBookMarks(Integer page) {
//        int pageNo = page < 0 ? 0 : page - 1;
//        Pageable pageable = PageRequest.of(pageNo, 10, Sort.Direction.DESC, "createdAt");
//        Page<BookmarkDto> bookmarkPage = bookMarkRepository.findAll(pageable).map(bookmarkMapper::toDTO);
//        return new BookmarksDTO(bookmarkPage);
//    }



    @Transactional(readOnly = true)
    public BookmarksDTO getBookMarks(Integer page) {
        int pageNo = page < 0 ? 0 : page - 1;
        Pageable pageable = PageRequest.of(pageNo, 10, Sort.Direction.DESC, "createdAt");
        Page<BookmarkDto> bookmarkPage = bookMarkRepository.findBookMark(pageable);
        return new BookmarksDTO(bookmarkPage);
    }


@Transactional(readOnly = true)
public BookmarksDTO searchBookMarks(String query, Integer page) {
    int pageNo = page < 0 ? 0 : page - 1;
    Pageable pageable = PageRequest.of(pageNo, 10, Sort.Direction.DESC, "createdAt");

    Page<BookmarkDto> bookmarkPage = bookMarkRepository.findByTitleContainsIgnoreCase(query,pageable);
   // Page<BookmarkDto> bookmarkPage = bookMarkRepository.findByTitleContainsIgnoreCase(query,pageable);
    return new BookmarksDTO(bookmarkPage);

}

    public BookmarkDto createBookMark(CreateBookMarkRequest request) {
        BookMark bookMark  = new BookMark(null,request.getTitle(),request.getUrl(), Instant.now());
        BookMark saveBookmark = bookMarkRepository.save(bookMark);

        return bookmarkMapper.toDTO(saveBookmark);
    }
}
