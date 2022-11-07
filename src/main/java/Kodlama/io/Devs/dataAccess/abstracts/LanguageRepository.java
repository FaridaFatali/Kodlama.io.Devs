package Kodlama.io.Devs.dataAccess.abstracts;

import Kodlama.io.Devs.entities.concretes.Language;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface LanguageRepository extends JpaRepository<Language, Integer> {
        Language findById(int id);
        Language findByName(String name);

}
