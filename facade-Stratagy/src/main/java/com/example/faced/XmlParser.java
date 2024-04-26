package com.example.faced;


import com.example.service.IFileParser;

public class XmlParser implements IFileParser {

    @Override
    public String parse(String content) {
        System.out.println("Contet : ".concat(content));
        return "Im XML parser";
    }
}
