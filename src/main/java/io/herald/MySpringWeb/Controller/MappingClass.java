package io.herald.MySpringWeb.Controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller  //Handles Http Requests : Get, Post, etc
public class MappingClass {

@GetMapping("/") //url pattern for mapping
    public String openFirstPage()
    {
        return "firstPage.html";
    }


    @GetMapping("/nextPage")
    public String OpenNextPage()
    {
        return "nextPage.html";
    }

    @GetMapping("/login")
    public String loginPage()
    {
        return "login.html";
    }

    @PostMapping("/login")
    public String loginPost(HttpServletRequest request)
    {
String username= request.getParameter("username");
String password = request.getParameter("password");
        System.out.println(username);
        System.out.println(password);

        if(username.equals("admin") && password.equals("admin"))
        {
            return "home.html";
        }

            return "login.html";


//When a form data does post request, HttpServletRequest obtains
        //those data as parameters in controller.


    }

}
