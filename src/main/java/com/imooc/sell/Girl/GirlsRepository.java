package com.imooc.sell.Girl;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GirlsRepository extends JpaRepository <Girls,Integer> {
   public List<Girls> findByAge(Integer age);
}
