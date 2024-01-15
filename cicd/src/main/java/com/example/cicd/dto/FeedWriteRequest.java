package com.example.cicd.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class FeedWriteRequest {

    private String title;
    private String contents;
}
