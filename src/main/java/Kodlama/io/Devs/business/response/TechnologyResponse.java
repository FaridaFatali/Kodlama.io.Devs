package Kodlama.io.Devs.business.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TechnologyResponse {
    private int id;
    private String name;
    private int languageId;
    private String languageName;
}
