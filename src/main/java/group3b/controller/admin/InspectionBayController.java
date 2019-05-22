package group3b.controller.admin;

import group3b.domain.InspectionBay;
import group3b.service.InspectionBayService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/inspectionBay")
public class InspectionBayController {
    @Qualifier("ServiceImpl")
    private InspectionBayService service;

    @PostMapping("/create")
    @ResponseBody
    public InspectionBay create(InspectionBay inspectionBay){
        return service.create(inspectionBay);
    }

    @PostMapping("/update")
    @ResponseBody
    public InspectionBay update(InspectionBay inspectionBay){
        return service.update(inspectionBay);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id){
        service.delete(id);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public InspectionBay read(@PathVariable String id){
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<InspectionBay> getAll(){
        return service.getAll();
    }
}