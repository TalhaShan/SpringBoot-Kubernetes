package com.spring.kubernetes.domain;

import org.springframework.stereotype.Component;

@Component
public class BookmarkMapper {

    public BookmarkDto toDTO(BookMark bookMark) {
        return new BookmarkDto(
                bookMark.getId(),
                bookMark.getTitle(),
                bookMark.getUrl(),
                bookMark.getCreatedAt()
        );
    }

}
