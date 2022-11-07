package Kodlama.io.Devs.webApi.controllers;

import Kodlama.io.Devs.business.abstracts.LanguageService;
import Kodlama.io.Devs.business.request.LanguageRequest;
import Kodlama.io.Devs.business.response.LanguageResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/languages")
public class LanguagesController {

    private LanguageService languageService;

    @Autowired
    public LanguagesController(LanguageService languageService) {
        this.languageService = languageService;
    }

    @GetMapping("/getall")
    public List<LanguageResponse> getAll(){
        return languageService.getAll();
    }

    @PostMapping("/add")
    public void add(LanguageRequest language) throws Exception{
        languageService.add(language);
    }

    @DeleteMapping("/delete")
    public void delete(int id){
        languageService.delete(id);
    }

    @PutMapping("/update")
    public void update(int id, LanguageRequest language){
        languageService.update(language, id);
    }

    @GetMapping("/get")
    public LanguageResponse getById(int id){
        return languageService.getResponseById(id);
    }
}
