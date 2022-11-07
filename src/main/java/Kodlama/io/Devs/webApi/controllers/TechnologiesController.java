package Kodlama.io.Devs.webApi.controllers;

import Kodlama.io.Devs.business.abstracts.TechnologyService;
import Kodlama.io.Devs.business.request.TechnologyRequest;
import Kodlama.io.Devs.business.response.TechnologyResponse;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/technologies")
public class TechnologiesController {
    private TechnologyService technologyService;

    public TechnologiesController(TechnologyService technologyService) {
        this.technologyService = technologyService;
    }

    @GetMapping("/getall")
    public List<TechnologyResponse> getAll(){
        return technologyService.getAll();
    }

    @PostMapping("/add")
    public void add(TechnologyRequest technologyRequest) throws Exception{
        technologyService.add(technologyRequest);
    }

    @DeleteMapping("/delete")
    public void delete(int id){
        technologyService.delete(id);
    }

    @PutMapping("/update")
    public void update(int id, TechnologyRequest technologyRequest){
        technologyService.update(technologyRequest, id);
    }

    @GetMapping("/get")
    public TechnologyResponse getById(int id){
        return technologyService.getResponseById(id);
    }
}
