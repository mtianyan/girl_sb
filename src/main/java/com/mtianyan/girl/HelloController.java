package com.mtianyan.girl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by mtianyan on 2018/2/2 0002.
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private GirlProperties girlProperties;

//    @RequestMapping(value = "/say", method = RequestMethod.GET)
    @GetMapping(value = "/say")
    public  String say(@RequestParam(value = "id",required = false,defaultValue ="0") Integer id){
//        return  girlProperties.getCupSize();
        return "id:"+id;
    }
}
