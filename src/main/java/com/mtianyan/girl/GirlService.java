package com.mtianyan.girl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * Created by mtianyan on 2018/2/4 0004.
 */
@Service
public class GirlService {
    @Autowired
    private GirlRepository girlRepository;

    @Transactional
    public void insertTwo(){
        Girl girlA = new Girl();
        girlA.setCupSize("A");
        girlA.setAge(18);
        girlRepository.save(girlA);

        Girl girlB = new Girl();
        girlA.setCupSize("BB");
        girlA.setAge(19);
        girlRepository.save(girlB);

    }

}
