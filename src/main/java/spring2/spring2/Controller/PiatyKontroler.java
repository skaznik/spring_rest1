package spring2.spring2.Controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import spring2.spring2.Model.User;

@RequestMapping("/mieszany")
@RestController
public class PiatyKontroler {

    @PostMapping
    public User stworz(@RequestParam String name,
                       @RequestParam String nazwisko,
                       @RequestParam int wiek) {


    }

}
