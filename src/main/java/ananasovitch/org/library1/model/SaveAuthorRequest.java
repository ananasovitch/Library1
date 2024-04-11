package ananasovitch.org.library1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SaveAuthorRequest {
    private String firstName;
    private String familyName;
    private String secondName;
}