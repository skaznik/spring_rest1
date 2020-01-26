package spring2.spring2.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/test")
@RestController
public class PierwszyKontroler {

    @RequestMapping
    public String helloworld() {
        return "Hello world";
    }
}
