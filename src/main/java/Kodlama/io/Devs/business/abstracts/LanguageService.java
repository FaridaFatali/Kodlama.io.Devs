package Kodlama.io.Devs.business.abstracts;

import Kodlama.io.Devs.entities.concretes.Language;

import java.util.List;

public interface LanguageService {
    List<Language> getAll();

    Language getId(int id);
    void add(Language language);
    void delete(int id);
    void update(int id, Language language);
}
