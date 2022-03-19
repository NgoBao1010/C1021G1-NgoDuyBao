package com.codegym.service.impl;

import org.springframework.stereotype.Service;
import com.codegym.service.IDictionaryService;

import java.util.HashMap;
import java.util.Map;
@Service
public class DictionaryServiceImpl implements IDictionaryService {
    public Map<String,String> keyWord(){
        Map<String,String> map = new HashMap<>();
        map.put("Hello","Xin chào");
        map.put("Follow","Theo dõi");
        map.put("Book","Quyển sách");
        map.put("Note","Vở");
        map.put("Computer","Máy tính");
        map.put("Laptop","Máy tính xách tay");
        map.put("Dictionary","Từ điển");
        map.put("Library","Thư viện");
        return map;
    }

    @Override
    public String check(String input) {
        Map<String,String> mapList = keyWord();
        for (Map.Entry<String,String> entry : mapList.entrySet()) {
            if (entry.getKey().equals(input)){
                return entry.getValue();
            }
        }
        return "File not found !!!";
    }
}
