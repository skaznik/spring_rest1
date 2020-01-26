package spring2.spring2.Controller;

import org.springframework.web.bind.annotation.*;


@RequestMapping("/header")
@RestController
public class TrzeciKontroler {

    @GetMapping("/dodaj")
    public int dodaj(@RequestHeader("header_A") int a,
                     @RequestHeader("header_B") int b) {
        return a + b;
    }

    @GetMapping("/odejmij")
    public int odejmij(@RequestHeader("header_A") int a,
                     @RequestHeader("header_B") int b) {
        return a - b;
    }

    @GetMapping("/mnoz")
    public int mnoz(@RequestHeader("header_A") int a,
                     @RequestHeader("header_B") int b) {
        return a * b;
    }

    @GetMapping("/dziel")
    public int dziel(@RequestHeader("header_A") int a,
                     @RequestHeader("header_B") int b) {
        return a / b;
    }
    @GetMapping("/tablice")
    public String tablice(@RequestHeader String[] strs) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < strs.length; ++i) {
            sb.append(strs[i]);
            if (i != strs.length - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }
}
