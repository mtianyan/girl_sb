package com.mtianyan.girl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by mtianyan on 2018/2/4 0004.
 */
@RestController
public class GirlController {

    @Autowired
    private GirlRepository girlRepository;
    @Autowired
    private GirlService girlService;
    /**
     * 查询所有女生列表
     * @return
     */

    @GetMapping(value = "/girls")
    public List<Girl> girlList(){
        return girlRepository.findAll();
    }

    /**
     * 添加一个女生
     * @param cupSize
     * @param age
     * @return
     */
    @PostMapping(value = "/girls")
    public Girl grilAdd(@RequestParam("cupSize") String cupSize,
                          @RequestParam("age") Integer age
                          ){
        Girl girl = new Girl();
        girl.setCupSize(cupSize);
        girl.setAge(age);

        return girlRepository.save(girl);
    }

    /**
     * 通过id查询一个女生
     * @param id
     * @return
     */
    @GetMapping(value = "/girls/{id}")
    public Girl girlGet(@PathVariable("id") Integer id){
        return girlRepository.findOne(id);
    }

    @PutMapping(value = "/girls/{id}")
    public Girl girlUpdate(@RequestParam("cupSize") String cupSize,
                           @RequestParam("age") Integer age,
                           @PathVariable("id") Integer id){
        Girl girl = new Girl();
        girl.setId(id);
        girl.setCupSize(cupSize);
        girl.setAge(age);

        return girlRepository.save(girl);

    }

    @DeleteMapping(value = "/girls/{id}")
    public void girlDelete(@PathVariable("id") Integer id){
        girlRepository.delete(id);
    }
    // 通过年龄查询
    @GetMapping(value = "/girls/age/{age}")
    public List<Girl> girlListByAge(@PathVariable("age") Integer age){
        return girlRepository.findByAge(age);
    }

    @PostMapping(value = "/girl/two")
    public  void  girlTwo(){
        girlService.insertTwo();
    }
}


