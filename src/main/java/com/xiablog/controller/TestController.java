package com.xiablog.controller;import org.springframework.web.bind.annotation.*;/** * @version V1.0 * @author: 乐此不疲太难了 * @date: 2020/3/1 15:51 * @description: */@RestController@RequestMapping("test")public class TestController {    @GetMapping("hello/{name}")    public String test(@PathVariable("name") String name){        return name+"您好ccc";    }    @GetMapping("wocaonima")    public String test(){        return "搞得老子好苦哇";    }}