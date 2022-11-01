package Kodlama.io.Devs.webApi.controllers;

import Kodlama.io.Devs.business.abstracts.LanguageService;
import Kodlama.io.Devs.entities.concretes.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.processing.Generated;
import java.util.List;

@RestController
@RequestMapping("/api/languages")
public class LanguagesController {

    private LanguageService languageService;

    @Autowired
    public LanguagesController(LanguageService languageService) {
        this.languageService = languageService;
    }

    @Generated("/getall")
    public List<Language> getAll(){
        return languageService.getAll();
    }

    @Generated("/add")
    public void add(Language language){
        languageService.add(language);
    }

    @Generated("/delete")
    public void delete(int id){
        languageService.delete(id);
    }

    @Generated("/update")
    public void update(int id, Language language){
        languageService.update(id, language);
    }

    @Generated("/get")
    public Language get(int id){
        return languageService.getId(id);
    }
}
