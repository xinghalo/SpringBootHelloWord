package xingoo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xinghailong on 2017/8/22.
 */
@RestController
@RequestMapping("a")
public class HelloController {
    @RequestMapping(value = "b")
    public String get() {
        return "Hello, Spring boot! This is GET!";
    }
}
