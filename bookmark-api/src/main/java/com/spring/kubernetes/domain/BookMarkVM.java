package com.spring.kubernetes.domain;

import java.time.Instant;

public interface BookMarkVM {
    Long getId();
    String getTitle();
    String getUrl();
    Instant getCreatedAt();
}