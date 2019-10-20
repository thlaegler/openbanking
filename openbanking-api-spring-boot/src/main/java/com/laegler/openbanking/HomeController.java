package com.laegler.openbanking;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
  @RequestMapping(value = "/")
  public String index() {
    System.out.println("swagger-ui.html");
    return "redirect:swagger-ui.html";
  }
}
