package com.example.faced;

import com.example.service.FileParserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;


@SpringBootTest
class FacedPatternTests {

    @Autowired
    private FileParserService fileParserService;

    @Test
    void chooseXmlParser() {
        assertEquals("Im XML parser",fileParserService.xmlParser("XML"));
    }

    @Test
    void chooseHtmlParser() {
        assertEquals("Im HTML parser",fileParserService.htmlParser("HTML"));
    }

    @Test
    void chooseJsonParser() {
        assertEquals("Im JSON parser",fileParserService.jsonParser("JSON"));
    }

    @Test
    void incorrenctFileTypeXmlParser() {
        assertNotEquals("Im XML parser",fileParserService.htmlParser("XML"));
    }

    @Test
    void incorrenctFileTypeHtmlParser() {
        assertNotEquals("Im HTML parser",fileParserService.jsonParser("HTML"));
    }

    @Test
    void incorrenctFileTypeJsonParser() {
        assertNotEquals("Im JSON parser",fileParserService.xmlParser("JSON"));
    }

}
