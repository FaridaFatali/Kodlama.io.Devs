package Kodlama.io.Devs.business.abstracts;

import Kodlama.io.Devs.business.request.TechnologyRequest;
import Kodlama.io.Devs.business.response.TechnologyResponse;

import java.util.List;

public interface TechnologyService {
    void add(TechnologyRequest technologyRequest);
    void delete(int id);

    TechnologyResponse getResponseById(int id);
    void update(TechnologyRequest technologyRequest, int id);

    List<TechnologyResponse> getAll();
}
