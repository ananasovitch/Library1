package ananasovitch.org.library1.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "error")
public class Error {
    private int errorCode;
    private String errorMessage;
    private String errorDetails;
}