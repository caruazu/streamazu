package com.example.stremazu.service;

public interface InterfaceConverteDados {
    <T> T obterDados(String json, Class<T> classe);
}
