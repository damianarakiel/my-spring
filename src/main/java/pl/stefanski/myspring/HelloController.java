package pl.stefanski.myspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;

@Controller
@RequestMapping("/")
public class HelloController {

    private MyObjectRepository myObjectRepository;

    public HelloController(MyObjectRepository myObjectRepository){
        this.myObjectRepository = myObjectRepository;
        myObjectRepository.save(new MyObject((long) 1, "REPOZYTORIUM"));
    }

    @GetMapping
    public String getHello() {
        return "hello";
    }

    @PostMapping
    public String postHello(MyObject myObject) {
        myObjectRepository.save(myObject);
        return "redirect:/";
    }

    @ModelAttribute("allMyObject")
    public Collection<MyObject> allMyObject(){
        return myObjectRepository.findAll();
    }

}
