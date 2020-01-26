package spring2.spring2.Controller;


import org.springframework.web.bind.annotation.*;
import org.webjars.NotFoundException;
import spring2.spring2.Model.User;

@RequestMapping("/mieszany")
@RestController
public class PiatyKontroler {
private User user;

    @PostMapping
    public User stworz(@RequestParam String name,
                       @RequestParam String nazwisko,
                       @RequestParam int wiek) {
        user = new User(name, nazwisko, wiek);
                return user;
    }
     @PatchMapping("dodaj/uprawnienie")
    public User dodaj(@PathVariable String uprawnienie) {
        if (user == null) {
            throw new NotFoundException("User not found");
        }
        user.addUprawnienia(uprawnienie);
        return user

     }

}
