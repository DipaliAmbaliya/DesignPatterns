package com.example.faced;

import com.example.service.IFileParser;

public class JsonParser implements IFileParser {

    @Override
    public String parse(String content) {
        System.out.println("Contet : ".concat(content));
        return "Im JSON parser";
    }
}
