package com.example.factorypattern.viewer;

import com.example.factorypattern.model.Document;
import org.springframework.stereotype.Component;

@Component
public class DocumentViewer implements Viewer<Document>{
    private static final ViewerType VIEWER_TYPE = ViewerType.DOCUMENT;

    @Override
    public ViewerType getType() {
        return VIEWER_TYPE;
    }

    @Override
    public String view(Document object) {
        return "Viewing document";
    }
}
