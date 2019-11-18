package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;
import model.dictionary;
@Controller
public class DictionaryController {
    dictionary dic = new dictionary();
    @GetMapping("/dictionary")
    public String dictionary() {
        return "dictionary";
    }
    @GetMapping("/translate")
    public String dictionarys(@RequestParam String search, Model model) {
        String result = dic.findById(search);
        model.addAttribute("result",result);
        return "view";
    }
}
