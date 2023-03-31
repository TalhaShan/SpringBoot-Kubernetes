package com.spring.kubernetes.domain;

import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateBookMarkRequest {

    @NotEmpty(message = "Title should not be empty")
    private String title;
    @NotEmpty(message = "Url should not be empty")
    private String url;

}
