package TuoMin.Service.Hanlder;

import TuoMin.Service.Service.service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import javax.annotation.Resource;

import java.util.Map;

/**
 * @功能
 */

@RestController
public class handler {
    @Resource
    public service service;

    @RequestMapping ("/get2")
    public String test2(){
        return  "nihao";

    }
    @RequestMapping ("/get1")
    public  Map test1(){

        Map<String, Object> say = service.say();
        return say;
    }
}
