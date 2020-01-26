package spring2.spring2.Controller;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.util.Calendar;
@Validated
@RequestMapping("/test")
@RestController
public class PierwszyKontroler {

    @GetMapping("/dodaj/{a}/{b}")
    public int dodaj(@PathVariable int a, @PathVariable int b) {
        return a + b;
    }
    @GetMapping("/odejmij/{a}/{b}")
    public int odejmij(@PathVariable int a, @PathVariable int b) {
        return a - b;
    }

    @GetMapping("/mnoz/{a}/{b}")
    public int mnoz(@PathVariable int a, @PathVariable int b) {
        return a * b;
    }

    @GetMapping("/dziel/{a}/{b}")
    public int dziel(@PathVariable int a, @PathVariable int b) {
        return a / b;
    }

    @GetMapping("/dzienTygodnia/{rok}/{miesiac}/{dzien}")
    public int dzienTygodnia(
            @PathVariable int dzien,
            @PathVariable @Min(1) @Max(12) int miesiac,
            @PathVariable int rok){
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, rok);
        calendar.set(Calendar.MONTH, miesiac-1);
        calendar.set(Calendar.DAY_OF_MONTH, dzien);
        return calendar.get(Calendar.DAY_OF_WEEK);

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
