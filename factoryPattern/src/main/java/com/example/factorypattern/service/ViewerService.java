package com.example.factorypattern.service;

import com.example.factorypattern.viewer.ViewerFactory;
import com.example.factorypattern.viewer.ViewerType;
import org.springframework.stereotype.Service;

@Service
public class ViewerService {
    private final ViewerFactory viewerFactory;

    public ViewerService(ViewerFactory viewerFactory) {
        this.viewerFactory = viewerFactory;
    }

    public String view(ViewerType viewerType, Object o) {
        return viewerFactory.getViewer(viewerType).view(o);
    }
}
