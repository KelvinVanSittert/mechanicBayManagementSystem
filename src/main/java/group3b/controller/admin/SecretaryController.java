package group3b.controller.admin;

import group3b.domain.Secretary;
import group3b.service.SecretaryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/secretary")
public class SecretaryController {
    @Qualifier("ServiceImpl")
    private SecretaryService service;

    @PostMapping("/create")
    @ResponseBody
    public Secretary create(Secretary secretary){
        return service.create(secretary);
    }

    @PostMapping("/update")
    @ResponseBody
    public Secretary update(Secretary secretary){
        return service.update(secretary);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id){
        service.delete(id);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public Secretary read(@PathVariable String id){
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<Secretary> getAll(){
        return service.getAll();
    }
}