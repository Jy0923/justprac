package com.example.cicd;

import com.example.cicd.dto.FeedWriteRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/feed")
@RequiredArgsConstructor
public class FeedController {

    private final FeedService feedService;

    @PostMapping
    public ResponseEntity<?> writeFeed(@RequestBody FeedWriteRequest feedWriteRequest) {
        feedService.writeFeed(feedWriteRequest);
        return ResponseEntity.status(HttpStatus.OK)
                             .build();
    }

    @GetMapping("/{feedId}")
    public ResponseEntity<?> searchFeed(@PathVariable Long feedId) {
        return ResponseEntity.status(HttpStatus.OK)
                             .body(feedService.searchFeed(feedId));
    }
}
