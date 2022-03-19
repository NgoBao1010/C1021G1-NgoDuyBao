package com.codegym.service;

import org.springframework.stereotype.Service;

import java.util.Map;
public interface IDictionaryService {
    Map<String,String> keyWord();
    String check(String input);
}
