package Kodlama.io.Devs.dataAccess.concretes;

import Kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import Kodlama.io.Devs.entities.concretes.Language;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryLanguageRepository implements LanguageRepository {

    List<Language> languages;

    public InMemoryLanguageRepository(){
        languages = new ArrayList<Language>();
        languages.add(new Language(1, "Java"));
        languages.add(new Language(2, "Python"));
        languages.add(new Language(3, "C++"));
        languages.add(new Language(4, "C#"));
        languages.add(new Language(5, "JavaScript"));
    }


    @Override
    public List<Language> getAll() {
        return languages;
    }

    @Override
    public Language getId(int id) {
        return languages.get(id);
    }

    @Override
    public void add(Language language) {
        languages.add(language);
    }

    @Override
    public void delete(int id) {
        languages.remove(id);
    }

    @Override
    public void update(int id, Language language) {

    }
}
