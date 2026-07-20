package io.herald.MySpringWeb.Controller;

import io.herald.MySpringWeb.Repository.UserRepository;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

    @Autowired
private UserRepository userRepository;

    @PostMapping("deleteUser")
    public String deleteUser(@RequestParam("id") int id , Model m)
    {
        userRepository.deleteById(id);
m.addAttribute("totalUsers",userRepository.findAll());

        return "home";
    }

}
