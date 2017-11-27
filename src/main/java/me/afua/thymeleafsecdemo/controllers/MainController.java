package me.afua.thymeleafsecdemo.controllers;

import me.afua.thymeleafsecdemo.entities.Jobseeker;
import me.afua.thymeleafsecdemo.entities.UserData;
import me.afua.thymeleafsecdemo.entities.UserService;
import me.afua.thymeleafsecdemo.repositories.JobseekerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.security.Principal;

@Controller
public class MainController {
    @Autowired
    private UserService userService;


    @Autowired
   private JobseekerRepository jobseekerRepository;


    @RequestMapping("/login")
    public String login()
    {
        return "login";
    }


    @RequestMapping("/pageone")
    public String showPageOne(Model model)
    {
        model.addAttribute("title","First Page");
        model.addAttribute("pagenumber","1");
        return "pageone";
    }
    @RequestMapping("/")
    public String showMainPage(Principal p) {
        //Principal allows you to store to name you except user to have store object parameters in repository

        return "index";
    }
    @GetMapping("/register")
    public String showRegistrationPage(Model model){
        model.addAttribute("user", new UserData ());
        model.addAttribute("pagenumber","4");
        return "registration";
    }

    @PostMapping("/register")
    public String processRegistrationPage(
            @Valid @ModelAttribute("user") UserData user,
            BindingResult result,
            Model model){

        model.addAttribute("user", user);

        if (result.hasErrors()) {
            return "registration";
        } else {
            userService.saveUserData(user);
            model.addAttribute("message", "User Account Successfully Created");
        }
        return "login";
    }

//now its jobseeker
    @GetMapping("/jobseeker")
    public String jobseekerForm(Model model) {
        model.addAttribute("jobseeker", new Jobseeker());
        return "jobseekerform";

    }
    @PostMapping("/jobseeker")
    public String processEmployePage(
            @Valid @ModelAttribute("jobseeker") Jobseeker jobseeker,
            BindingResult result,
            Model model){

        model.addAttribute("jobseeker", jobseeker);

        if (result.hasErrors()) {
            return "jobseekerform";
        } else {
            jobseekerRepository.save(jobseeker);
            model.addAttribute("message", "User Successfully Insert there information");
        }
        return "show";
    }


    @PostMapping("/process")
    public String processForm(@Valid Jobseeker jobseeker, BindingResult result) {
        if (result.hasErrors()) {
            return "jobseekerform";
        }
        jobseekerRepository.save(jobseeker);
        return "redirect:/";
    }

    @RequestMapping("detail/{id}")
    public String showjobseeker(@PathVariable("id") long id, Model model){
        model.addAttribute("jobseeker",jobseekerRepository.findOne(id));
        return"Show";
    }

    @GetMapping("/search")
    public String getSearch()
    {
        return "search";
    }

//    @PostMapping("/search")
//    public String showSearchResults(HttpServletRequest request, Model model)
//    {
//        //Get the search string from the result form
//        String searchString = request.getParameter("search");
//        model.addAttribute("search",searchString);
//        model.addAttribute("employees",employeeRepository.findOneBySkillContainingIgnoreCase(searchString));
//        return "list";
//    }
}




