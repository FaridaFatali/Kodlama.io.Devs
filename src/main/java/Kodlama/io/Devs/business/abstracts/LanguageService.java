package Kodlama.io.Devs.business.abstracts;

import Kodlama.io.Devs.business.request.LanguageRequest;
import Kodlama.io.Devs.business.response.LanguageResponse;
import Kodlama.io.Devs.entities.concretes.Language;

import java.util.List;

public interface LanguageService {
    List<LanguageResponse> getAll();

    LanguageResponse getResponseById(int id);

    Language getById(int id);
    void add(LanguageRequest languageRequest);
    void delete(int id);
    void update(LanguageRequest languageRequest , int id);
}
