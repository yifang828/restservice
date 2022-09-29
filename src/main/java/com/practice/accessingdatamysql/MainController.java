package com.practice.accessingdatamysql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path="/demo")
public class MainController {
    @Autowired
    private UserRepository userRepository;


    @PostMapping(path="/add")
    public @ResponseBody String addNewUser(@RequestParam String name, @RequestParam String email){
        Users user = new Users();
        user.setName(name);
        user.setEmail(email);
        userRepository.save(user);
        return "Saved.";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Users> getAllUsers(){
        return userRepository.findAll();
    }
}
