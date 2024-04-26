package com.example.strategy;

import com.example.service.FileParserStrategyService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;


@SpringBootTest
class StrategyPatternTests {

    @Autowired
    private FileParserStrategyService fileParserStrategyService;

    @Test
    void chooseXmlParser() {
        assertEquals("Im XML parser",fileParserStrategyService.getParser(FileTypes.XML).doParse("XML"));
    }

    @Test
    void chooseHtmlParser() {
        assertEquals("Im HTML parser",fileParserStrategyService.getParser(FileTypes.HTML).doParse("HTML"));
    }

    @Test
    void chooseJsonParser() {
        assertEquals("Im JSON parser",fileParserStrategyService.getParser(FileTypes.JSON).doParse("JSON"));
    }

    @Test
    void incorrenctFileTypeXmlParser() {
        assertNotEquals("Im XML parser",fileParserStrategyService.getParser(FileTypes.HTML).doParse("XML"));
    }

    @Test
    void incorrenctFileTypeHtmlParser() {
        assertNotEquals("Im HTML parser",fileParserStrategyService.getParser(FileTypes.JSON).doParse("HTML"));
    }

    @Test
    void incorrenctFileTypeJsonParser() {
        assertNotEquals("Im JSON parser",fileParserStrategyService.getParser(FileTypes.XML).doParse("JSON"));
    }

}
