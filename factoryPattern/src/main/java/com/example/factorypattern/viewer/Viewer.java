package com.example.factorypattern.viewer;

public interface Viewer<T> {
    ViewerType getType();
    String view(T object);
}
