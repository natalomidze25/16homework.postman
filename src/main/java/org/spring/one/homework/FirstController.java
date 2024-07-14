package org.spring.one.homework;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.security.Key;

@RestController
@RequestMapping("first")
public class FirstController {
    @GetMapping
    public String get(@RequestParam String key){
        return "get method sucssess, key =" + key;
    }
    @PutMapping
    public String update(@RequestParam String key){
        return "update method sucssess, key =" + key;

    }
    @PostMapping
    public  String create(@RequestParam String key){
        return "create method sucssess, key ="+key;

    }
    @DeleteMapping()
    public  String delete(@RequestParam String key){
        return "delete method sucssess,key = " + key;

    }
}
