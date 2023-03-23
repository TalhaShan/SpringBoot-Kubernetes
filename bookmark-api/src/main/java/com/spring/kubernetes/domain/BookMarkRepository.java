package com.spring.kubernetes.domain;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface BookMarkRepository extends JpaRepository<BookMark,Long> {

    @Query("select new com.spring.kubernetes.domain.BookmarkDto(b.Id,b.title,b.url,b.createdAt) from BookMark  b")
    Page<BookmarkDto> findBookMark(Pageable pageable);
}
