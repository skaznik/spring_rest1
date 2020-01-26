package spring2.spring2.Controller;


import org.springframework.web.bind.annotation.*;
import spring2.spring2.Model.User;

import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RequestMapping("/body")
@RestController
public class CzwartyKontroler {

    @PostMapping(path = "/odwroc", consumes = "text/plain")
    public String odwroc(@RequestBody String string) {
        char[] znaki = string.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = znaki.length-1; i >=0; --i) {
            sb.append(znaki[i]);
        }
        return sb.toString();
    }
    @PostMapping(path = "/tablice", consumes = "application/json")
    public String tablice(@RequestBody String[] strs) {
        return Stream.of(strs)
                .map(String::toUpperCase)
                .collect(Collectors.joining(";"));
            }

            @PostMapping(path = "/uprosc", consumes = "application/json")
    public String uprosc(@RequestBody User user) {
        return user.getName() + " " + user.getNazwisko() +
                " lat " + user.getWiek();
            }

}
