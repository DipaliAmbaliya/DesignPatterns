package com.example.service;

import com.example.strategy.FileTypes;
import com.example.strategy.HtmlParser;
import com.example.strategy.JsonParser;
import com.example.strategy.XmlParser;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class FileParserStrategyService {
    private Map<FileTypes, IFileParserStrategy> fileParserStrategyMap =
            Map.of(FileTypes.HTML,new HtmlParser(),FileTypes.XML,new XmlParser(),FileTypes.JSON,new JsonParser());
    public IFileParserStrategy getParser(FileTypes fileTypes){
        return fileParserStrategyMap.get(fileTypes);
    }
}
