package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
//@RequestMapping("/convert")
public class ConvertController {
    @GetMapping("/showconvert")
    public ModelAndView showConvert() {
        ModelAndView modelAndView = new ModelAndView("list");
        return modelAndView;
    }
    @PostMapping("/convert")
    public String convert(@RequestParam int money, ModelMap modelMap) {
        int showmoney = money * 23000;
        modelMap.addAttribute("money", showmoney);
        return "list";
    }

}
