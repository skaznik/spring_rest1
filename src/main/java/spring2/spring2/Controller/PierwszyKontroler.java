package spring2.spring2.Controller;

import org.springframework.web.bind.annotation.*;

@RequestMapping("/test")
@RestController
public class PierwszyKontroler {

    @GetMapping("/dodaj/{a}/{b}")

    public int dodaj(@PathVariable int a, @PathVariable int b) {
        return a + b;
    }


    @GetMapping
    public String helloworld() {
        return "Hello world";
    }
    @PostMapping
    public String helloworld2() {
        return "Hello world2";
    }
}
