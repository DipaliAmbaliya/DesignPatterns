package com.example.strategy;

import com.example.service.IFileParserStrategy;

public class HtmlParser implements IFileParserStrategy {

    @Override
    public String doParse(String content) {
        System.out.println("Contet : ".concat(content));
        return "Im HTML parser";
    }
}
