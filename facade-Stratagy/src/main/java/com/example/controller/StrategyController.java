package com.example.controller;

import com.example.service.FileParserStrategyService;
import com.example.strategy.FileTypes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/strategy")
public class StrategyController {

    @Autowired
    private FileParserStrategyService fileParserStrategyService;

    @GetMapping(value = "/xmlParser")
    public String chooseXmlParser() {
        return fileParserStrategyService.getParser(FileTypes.XML).doParse("XML");
    }

    @GetMapping(value = "/HtmlParser")
    public String chooseHtmlParser() {
       return fileParserStrategyService.getParser(FileTypes.HTML).doParse("HTML");
    }

    @GetMapping(value = "/JsonParser")
    public String chooseJsonParser() {
        return fileParserStrategyService.getParser(FileTypes.JSON).doParse("JSON");
    }
}
