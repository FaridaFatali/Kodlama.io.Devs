package Kodlama.io.Devs.business.concretes;

import Kodlama.io.Devs.business.abstracts.LanguageService;
import Kodlama.io.Devs.business.abstracts.TechnologyService;
import Kodlama.io.Devs.business.request.TechnologyRequest;
import Kodlama.io.Devs.business.response.TechnologyResponse;
import Kodlama.io.Devs.dataAccess.abstracts.TechnologyRepository;
import Kodlama.io.Devs.entities.concretes.Language;
import Kodlama.io.Devs.entities.concretes.Technology;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TechnologyManager implements TechnologyService {
    private TechnologyRepository technologyRepository;
    private LanguageService languageService;

    @Autowired
    public TechnologyManager(TechnologyRepository technologyRepository, LanguageService languageService){
        this.technologyRepository = technologyRepository;
        this.languageService = languageService;
    }


    @Override
    public void add(TechnologyRequest technologyRequest) {
        Technology technology = new Technology();
        Language language = languageService.getById(technologyRequest.getLanguageId());
        technology.setName(technologyRequest.getName());
        technology.setLanguage(language);
        technologyRepository.save(technology);
    }

    @Override
    public void delete(int id) {
        technologyRepository.deleteById(id);
    }

    @Override
    public TechnologyResponse getResponseById(int id) {
        Technology technology = technologyRepository.findById(id);
        TechnologyResponse technologyResponse = new TechnologyResponse();
        technologyResponse.setName(technology.getName());
        technologyResponse.setId(technology.getId());
        technologyResponse.setLanguageName(technology.getLanguage().getName());
        technologyResponse.setLanguageId(technology.getLanguage().getId());
        return null;
    }

    @Override
    public void update(TechnologyRequest technologiesRequest, int id) {
        Technology updateTechnology = technologyRepository.findById(id);
        Language updateLanguageId = languageService.getById(technologiesRequest.getLanguageId());
        updateTechnology.setName(technologiesRequest.getName());
        updateTechnology.setLanguage(updateLanguageId);
        technologyRepository.save(updateTechnology);
    }

    @Override
    public List<TechnologyResponse> getAll() {
        List<Technology> technologies = technologyRepository.findAll();
        List<TechnologyResponse> responses = new ArrayList<>();

        for (Technology technology : technologies) {
            TechnologyResponse technologyResponse = new TechnologyResponse();
            technologyResponse.setName(technology.getName());
            technologyResponse.setId(technology.getId());
            technologyResponse.setLanguageName(technology.getLanguage().getName());
            technologyResponse.setLanguageId(technology.getLanguage().getId());
            responses.add(technologyResponse);
        }
        return responses;
    }
}
