package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class SkillsController {

    @RequestMapping
    public String skillsList() {
        return "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list:</h2>" +
                "<ol>" +
                    "<li>Java</li>" +
                    "<li>JavaScript</li>" +
                    "<li>Python</li>" +
                "</ol>";
    }

    @PostMapping("favSkillsList")
    public static String createFavSkillsList(@RequestParam String name, @RequestParam String firstFavLang,
                                             @RequestParam String secondFavLang, @RequestParam String thirdFavLang) {
        return "<h1>" + name + "</h1>" +
                "<ol>" +
                "<li>" + firstFavLang + "</li>" +
                "<li>" + secondFavLang + "</li>" +
                "<li>" + thirdFavLang + "</li>" +
                "</ol>";
    }

    @GetMapping("form")
    public String skillsForm() {
        return "<form action='favSkillsList' method='POST'>" +
                "<label>Name: </label>" +
                "<input type='text' name='name'/>" +
                "<br>" +
                "<label>My favorite language: </label>" +
                "<select name='firstFavLang'>" +
                    "<option value='Java'>Java</option>" +
                    "<option value='JavaScript'>JavaScript</option>" +
                    "<option value='Python'>Python</option>" +
                "</select>" +
                "<br>" +
                "<label>My second favorite language: </label>" +
                "<select name='secondFavLang'>" +
                    "<option value='Java'>Java</option>" +
                    "<option value='JavaScript'>JavaScript</option>" +
                    "<option value='Python'>Python</option>" +
                "</select>" +
                "<br>" +
                "<label>My third favorite language: </label>" +
                "<select name='thirdFavLang'>" +
                    "<option value='Java'>Java</option>" +
                    "<option value='JavaScript'>JavaScript</option>" +
                    "<option value='Python'>Python</option>" +
                "</select>" +
                "<br>" +
                "<input type='submit' value='Submit'>" +
                "</form>";
    }
}
