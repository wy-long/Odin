package com.example.demo.controller;

import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("redisTest")
public class Demo6RedisController {

    @Autowired
    private RedisTemplate redisTemplate;
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @GetMapping("/set/{key}/{value}")
    public String getStringFromRedis(@PathVariable(name = "key") String key,
                                     @PathVariable(name = "value") String value) {
        stringRedisTemplate.opsForValue().set(key, value);
        return "添加成功";
    }

    @GetMapping("/get/{key}")
    public String setStringToRedis(@PathVariable(name="key") String key) {
        return stringRedisTemplate.opsForValue().get(key);
    }

    @GetMapping("/addUser")
    public String setObjectToRedis(){
        User user = new User();
        user.setId(new Long(100));
        user.setName("张三");
        redisTemplate.opsForValue().set("user111",user);
        return "添加成功";
    }

    @GetMapping("/getUser/{key}")
    public Object getObjectFromRedis(@PathVariable(name="key") String key){
        return redisTemplate.opsForValue().get(key);
    }
}
