package dev.projeto.spring.CadastroNinja;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/boasvindas")
    public String apresentacao(){
        return "Ola Mundo!";
    }

}
