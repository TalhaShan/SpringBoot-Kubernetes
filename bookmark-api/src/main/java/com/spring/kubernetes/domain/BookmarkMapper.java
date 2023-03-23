package com.spring.kubernetes.domain;

import org.springframework.stereotype.Component;

@Component
public class BookmarkMapper {

    public BookmarkDto toDTO(BookMark bookMark){
        BookmarkDto dto = new BookmarkDto();

        dto.setCreatedAt(bookMark.getCreatedAt());
        dto.setId(bookMark.getId());
        dto.setTitle(bookMark.getTitle());
        dto.setUrl(bookMark.getUrl());
        return dto;
    }

}
