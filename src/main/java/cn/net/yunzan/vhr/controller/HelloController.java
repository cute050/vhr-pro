package cn.net.yunzan.vhr.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yp
 * @since 2022/11/22
 **/
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello";
    }

}
