package com.example.cicd.dto;

import lombok.Getter;

@Getter
public class FeedDetailResponse {

    private String title;
    private String contents;

    public FeedDetailResponse(String title, String contents) {
        this.title = title;
        this.contents = contents;
    }
}
