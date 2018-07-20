package com.imooc.sell.Girl;

import org.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class GirlsService {
    @Autowired
    private  GirlsRepository GirlsRepository;
    @Transactional
    public void insertTwo(){
        Girls girlA=new Girls();
        girlA.setCupSize("A");
        girlA.setAge(18);
        GirlsRepository.save(girlA);

        Girls girlB=new Girls();
        girlB.setCupSize("Bbbbbbvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv");
        girlB.setAge(18);
        GirlsRepository.save(girlB);
    }
   
}
