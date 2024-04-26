package com.example.factorypattern.viewer;

import com.example.factorypattern.model.Video;
import org.springframework.stereotype.Component;

@Component
public class VideoViewer implements Viewer<Video> {
    private static final ViewerType VIEWER_TYPE = ViewerType.VIDEO;

    @Override
    public ViewerType getType() {
        return VIEWER_TYPE;
    }

    @Override
    public String view(Video object) {
        return "Viewing video";
    }
}
