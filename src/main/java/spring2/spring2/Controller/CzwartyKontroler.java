package spring2.spring2.Controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
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

}
