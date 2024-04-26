package com.example.controller;

import com.example.service.FileParserService;
import com.example.service.FileParserStrategyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/facade")
public class FacedController {

    @Autowired
    private FileParserService fileParserService;

    @GetMapping(value = "/xmlParser")
    public String chooseXmlParser() {
       return fileParserService.xmlParser("XML");
    }

    @GetMapping(value = "/HtmlParser")
    public String chooseHtmlParser() {
        return fileParserService.htmlParser("HTML");
    }

    @GetMapping(value = "/JsonParser")
    public String  chooseJsonParser() {
        return fileParserService.jsonParser("JSON");
    }



}
