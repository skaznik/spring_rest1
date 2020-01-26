package spring2.spring2.Controller;

import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.util.Calendar;

@RequestMapping("/param")
@RestController
public class DrugiKontroler {

    @GetMapping("/tablice")
    public String tablice(@RequestParam String[] strs) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < strs.length; ++i) {
            sb.append(strs[i]);
            if (i != strs.length - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }


    @GetMapping("/dodaj")
    public int dodaj(@RequestParam(required = false) Integer a,
                     @RequestParam(required = false) Integer b) {
        if (a == null) {
            a = 0;
        }
        if (b == null) {
            b = 0;
        }
        return a + b;
    }

    @GetMapping("/odejmij")
    public int odejmij(@RequestParam int a, @RequestParam int b) {
        return a - b;
    }
    @GetMapping("/mnoz")
    public int mnoz(@RequestParam int a, @RequestParam int b) {
        return a * b;
    }


}
