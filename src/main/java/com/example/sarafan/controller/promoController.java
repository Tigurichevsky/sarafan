package com.example.sarafan.controller;

import com.example.sarafan.Promo;
import com.example.sarafan.controller.exceptions.NotFoundException;
import org.springframework.web.bind.annotation.RequestMapping;


import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("promo")
public class promoController {
    private int counter = 4;

    private ArrayList<Promo> collection_promo = new ArrayList<Promo>(){{
        add(new Promo(1, "dsd", "3213", null, null));

    }};

    //1231212312213212131312
    @GetMapping
    public ArrayList<Promo> list1(){
        return collection_promo;
    }
    //2313123123123123123123113123131231
    @GetMapping("{id}")
    public Promo getOne_Promo(@PathVariable String id) {
        return getpromo(id);
    }

    private Promo getpromo(@PathVariable String id) {
        int i = Integer.parseInt(id);
        return collection_promo.stream()


                .filter(collection_promo -> i==collection_promo.getId())
                .findFirst()
                .orElseThrow(NotFoundException::new);
    }

//    @PostMapping
//    public ArrayList<Promo> create(@RequestBody ArrayList<Promo> promo) {
//        promo.add("id", String.valueOf(counter++));
//
//        promos.add(promo);
//
//        return promo;
//    }
//
//    @PutMapping("{id}")
//    public Map<String, String> update(@PathVariable String id, @RequestBody Map<String, String> promo) {
//        Map<String, String> promoFromDb = getpromo(id);
//
//        promoFromDb.putAll(promo);
//        promoFromDb.put("id", id);
//
//        return promoFromDb;
//    }
//
//    @DeleteMapping("{id}")
//    public void delete(@PathVariable String id) {
//        Map<String, String> promo = getpromo(id);
//
//        promos.remove(promo);
//    }
}