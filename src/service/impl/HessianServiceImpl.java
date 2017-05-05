package service.impl;

import entity.HelloWord;
import service.HessianService;


public class HessianServiceImpl implements HessianService{

    @Override
    public HelloWord sayHelloWord() {
        return new HelloWord("hello word");
    }

}
