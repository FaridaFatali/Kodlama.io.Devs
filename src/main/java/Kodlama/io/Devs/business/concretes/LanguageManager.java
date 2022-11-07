package Kodlama.io.Devs.business.concretes;

import Kodlama.io.Devs.business.abstracts.LanguageService;
import Kodlama.io.Devs.business.request.LanguageRequest;
import Kodlama.io.Devs.business.response.LanguageResponse;
import Kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import Kodlama.io.Devs.entities.concretes.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


public class LanguageManager implements LanguageService {

    private LanguageRepository languageRepository;



    public LanguageManager(LanguageRepository languageRepository) {
        this.languageRepository = languageRepository;
    }


    @Override
    public List<LanguageResponse> getAll() {
        List<Language> languages = languageRepository.findAll();
        List<LanguageResponse> responses = new ArrayList<LanguageResponse>();

        for (Language language : languages) {
            LanguageResponse responseItem = new LanguageResponse();
            responseItem.setId(language.getId());
            responseItem.setName(language.getName());
            responses.add(responseItem);
        }
        return responses;
    }

    @Override
    public LanguageResponse getResponseById(int id) {
        Language language = languageRepository.findById(id);
        LanguageResponse languageResponse = new LanguageResponse();
        languageRepository.findById(languageResponse.getId());
        return languageResponse;
    }

    @Override
    public Language getById(int id) {
        return languageRepository.findById(id);
    }

    @Override
    public void add(LanguageRequest languageRequest) {
        Language language = new Language();
        language.setName(language.getName());
        this.languageRepository.save(language);
    }

    @Override
    public void delete(int id) {
        languageRepository.deleteById(id);
    }

    @Override
    public void update(LanguageRequest languageRequest, int id) {
        Language language = languageRepository.findById(id);
        language.setName(languageRequest.getName());
        languageRepository.save(language);
    }


}
