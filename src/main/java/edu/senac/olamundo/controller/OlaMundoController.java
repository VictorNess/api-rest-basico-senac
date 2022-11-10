package edu.senac.olamundo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.senac.olamundo.Model.OlaMundo;

@RestController
@RequestMapping("/ola-mundo")
public class OlaMundoController {

    @GetMapping
    public ResponseEntity<OlaMundo> getOlaMundo() {
        return ResponseEntity.ok(new OlaMundo("Olá Mundo."));
    }

    @PostMapping
    public ResponseEntity<OlaMundo> postOlaMundo() {
        return ResponseEntity.ok(new OlaMundo("Olá Mundo."));
    }

    @PutMapping
    public ResponseEntity<OlaMundo> putOlaMundo() {
        return ResponseEntity.ok(new OlaMundo("Olá Mundo."));
    }

    @DeleteMapping
    public ResponseEntity<OlaMundo> deleteOlaMundo() {
        return ResponseEntity.ok(new OlaMundo("Olá Mundo."));
    }

}
