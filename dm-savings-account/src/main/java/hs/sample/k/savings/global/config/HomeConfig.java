package hs.sample.k.savings.global.config;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Home redirection to swagger api documentation
 */
@Controller
public class HomeConfig {
    @RequestMapping(value = "/")
    public String index() {
        System.out.println("/swagger-ui/index.html");
        return "redirect:/swagger-ui/index.html\n";
    }
}
