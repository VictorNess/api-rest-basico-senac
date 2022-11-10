package edu.senac.olamundo.Model;

import javax.persistence.Entity;

@Entity
public class OlaMundo {

    private String message;

    public OlaMundo(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

}
