package com.example.service;

import com.example.faced.HtmlParser;
import com.example.faced.JsonParser;
import com.example.faced.XmlParser;
import org.springframework.stereotype.Service;

@Service
public class FileParserService {
    private IFileParser htmlParser;
    private IFileParser jsonParser;
    private IFileParser xmlParser;

    public FileParserService() {
        htmlParser = new HtmlParser();
        jsonParser = new JsonParser();
        xmlParser = new XmlParser();
    }

    public String htmlParser(String content){
        return htmlParser.parse(content);
    }
    public String jsonParser(String content){
        return jsonParser.parse(content);
    }
    public String xmlParser(String content){
        return xmlParser.parse(content);
    }
}
