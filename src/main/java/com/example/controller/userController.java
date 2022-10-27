package com.example.controller;

import com.example.entity.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class userController {
    @Autowired
    public com.example.service.userService userService;
    @GetMapping
    public Result getAll(user user){
     List<user> list=userService.list();
        System.out.println(list);
     return new Result(list);
    }

    @PostMapping
    public void add(@RequestBody user user){
        userService.save(user);
    }


    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        userService.removeById(id);
    }


    @PutMapping
    public void update(@RequestBody user user){
        userService.updateById(user);
    }

    @GetMapping("{id}")
    public Result getById(@PathVariable Integer id){
        user user = userService.getById(id);
        return new Result(user);
    }
}
