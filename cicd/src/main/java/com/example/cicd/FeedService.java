package com.example.cicd;

import com.example.cicd.dto.FeedDetailResponse;
import com.example.cicd.dto.FeedWriteRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FeedService {

    private final FeedRepository feedRepository;

    public void writeFeed(FeedWriteRequest feedWriteRequest) {
        Feed feed = new Feed(feedWriteRequest.getTitle(), feedWriteRequest.getContents());
        feedRepository.save(feed);
    }

    public FeedDetailResponse searchFeed(Long feedId) {
        Feed feed = feedRepository.findById(feedId)
                                  .get();
        return new FeedDetailResponse(feed.getTitle(), feed.getContents());
    }
}
