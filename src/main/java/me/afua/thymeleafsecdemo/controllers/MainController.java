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
    public String login() {
        return "login";
    }

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/register")
    public String showRegistrationPage(Model model) {
        model.addAttribute("user", new UserData());
        model.addAttribute("pagenumber", "4");
        return "registration";
    }

    @PostMapping("/register")
    public String processRegistrationPage(
            @Valid @ModelAttribute("user") UserData user,
            BindingResult result,
            Model model) {

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



//    @RequestMapping("/list")
//    public String listCourse(Model model) {
//
//        model.addAttribute("jobseekers", jobseekerRepository.findAll());
//        return "list";
//    }

    @GetMapping("/jobseeker")
    public String jobseekerForm(Model model) {
        model.addAttribute("jobseeker", new Jobseeker());
        return "jobseekerform";

    }

    @PostMapping("/process")
    public String processForm(@Valid Jobseeker jobseeker, BindingResult result) {

        if (result.hasErrors()) {System.out.print(result.toString());
            return "jobseekerform";
        }
        jobseekerRepository.save(jobseeker);

        return "show";
    }

    @RequestMapping("detail/{id}")
    public String showJobseeker(@PathVariable("id") long id, Model model) {
        model.addAttribute("jobseeker", jobseekerRepository.findOne(id));
        return "show";

    }
      @RequestMapping("/jobseeker/search")
    public String searchpeople(){
        return"search";
      }
//      @PostMapping("/jobseeker/search")
//    public String processSearchpeople(@RequestParam String searchedname,Model model){
//        Iterable<Jobseeker> people=jobseekerRepository.findAllByFull_nameContainingIgnoreCase(searchedname ,searchedname);
//        model.addAttribute("people",people);
//        model.addAttribute("searchStr",searchedname);
//        return "search";
//      }
      @RequestMapping("/recruiter/details/id")
    public String showUserresume(@PathVariable("id") long id,Model model){
        model.addAttribute("jobseeker",jobseekerRepository.findOne(id));
        return "show";
      }
        }






