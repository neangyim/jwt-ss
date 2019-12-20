package co.simplon.web;

import co.simplon.entites.AppUser;
import co.simplon.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountRestController {
    @Autowired
    private AccountService accountService;
    @PostMapping
    public AppUser register(@RequestBody AppUser user){
        return accountService.saveUser(user);

    }
}
