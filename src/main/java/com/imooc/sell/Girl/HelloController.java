package com.imooc.sell.Girl;

import com.imooc.sell.Girl.GirlsProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    private GirlsProperties GirlsProperties;
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String say(){
        return GirlsProperties.getCupSize();
    }
}
