package com.example.factorypattern.controller;

import com.example.factorypattern.model.Document;
import com.example.factorypattern.model.Image;
import com.example.factorypattern.model.Video;
import com.example.factorypattern.service.ViewerService;
import com.example.factorypattern.viewer.ViewerType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ViewController {
    @Autowired
    private ViewerService viewerService;

    @GetMapping(value = "/viewImage")
    public String viewImage() {
        return viewerService.view(ViewerType.IMAGE, new Image());
    }

    @GetMapping(value = "/viewVideo")
    public String viewVideo() {
        return viewerService.view(ViewerType.VIDEO, new Video());
    }

    @GetMapping(value = "/viewDoc")
    public String viewDoc() {
        return viewerService.view(ViewerType.DOCUMENT, new Document());
    }
}
