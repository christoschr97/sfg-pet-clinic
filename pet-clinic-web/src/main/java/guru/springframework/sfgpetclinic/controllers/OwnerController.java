package guru.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/owners")
@Controller
public class OwnerController {

  @RequestMapping({"", "/", "/index", "/index.html", "/owners.html"})
  public String listOwners() {
    return "owners/index";
  }

}
