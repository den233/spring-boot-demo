package com.imooc.sell.Girl;

import org.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController

public class GirlsController {
    @Autowired
    private GirlsRepository GirlsRepository;
    @Autowired
    private GirlsService GirlsService;

    @GetMapping(value = "/hello")
    public List<Girls> getGirlsList() {
        return GirlsRepository.findAll();
    }

    @PostMapping(value = "/hello")
    public Girls girlAdd(@RequestParam("cupSize") String cupSize, @RequestParam("age") Integer age) {
        Girls girls = new Girls();
        girls.setCupSize(cupSize);
        girls.setAge(age);
        return GirlsRepository.save(girls);
    }

    //查询
    @GetMapping(value = "/hello/{id}")
    public Girls girlFindOne(@PathVariable("id") Integer id) {
        return GirlsRepository.findOne(id);
    }

    //更新
    @PutMapping(value = "/girls/{id}")
    public Girls girlUpdate(@PathVariable("id") Integer id,
                            @RequestParam("cupSize") String cupSize,
                            @RequestParam("age") Integer age
    ) {
        Girls girls = new Girls();
        girls.setId(id);
        girls.setCupSize(cupSize);
        girls.setAge(age);
        return GirlsRepository.save(girls);
    }

    @DeleteMapping(value = "/girls/{id}")
    public void personDelete(@PathVariable("id") Integer id) {
        GirlsRepository.delete(id);

    }
    //通过年龄查询
    @GetMapping(value = "/girls/age/{age}")
    public List<Girls> getGirlsAge(@PathVariable("age") Integer age) {
        return GirlsRepository.findByAge(age);
    }

    @PostMapping(value = "/girls/two")
    public void girlTwo(){
       GirlsService.insertTwo();

    }
}