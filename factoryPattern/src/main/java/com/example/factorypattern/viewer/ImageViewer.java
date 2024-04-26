package com.example.factorypattern.viewer;

import com.example.factorypattern.model.Image;
import org.springframework.stereotype.Component;

@Component
public class ImageViewer implements Viewer<Image> {
    private static final ViewerType VIEWER_TYPE = ViewerType.IMAGE;

    @Override
    public ViewerType getType() {
        return VIEWER_TYPE;
    }

    @Override
    public String view(Image object) {
        return "Viewing image";
    }
}
