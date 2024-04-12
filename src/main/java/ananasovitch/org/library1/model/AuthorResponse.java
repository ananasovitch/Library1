package ananasovitch.org.library1.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class AuthorResponse {
    private Long authorId;
    private Integer errorCode;
    private String errorMessage;
    private String errorDetails;
}