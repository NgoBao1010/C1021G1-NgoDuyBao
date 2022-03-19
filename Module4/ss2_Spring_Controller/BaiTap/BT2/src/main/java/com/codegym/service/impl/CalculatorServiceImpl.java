package com.codegym.service.impl;

import com.codegym.service.ICalculatorService;
import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements ICalculatorService {
    @Override
    public int calculator(int value1,int value2,String calculation) {
        int result = 0;
        switch (calculation){
            case "+":
                result = value1 + value2;
                break;
            case "-":
                result = value1 - value2;
                break;
            case "*":
                result = value1 * value2;
                break;
            case "/":
                result = value1 / value2;
                break;
        }
        return result;
    }

}
