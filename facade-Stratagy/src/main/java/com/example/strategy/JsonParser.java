package com.example.strategy;

import com.example.service.IFileParserStrategy;

public class JsonParser implements IFileParserStrategy {

    @Override
    public String doParse(String content) {
        System.out.println("Contet : ".concat(content));
        return "Im JSON parser";
    }
}
