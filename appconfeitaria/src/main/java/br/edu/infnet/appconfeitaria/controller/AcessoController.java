package br.edu.infnet.appconfeitaria.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.edu.infnet.appconfeitaria.model.domain.Usuario;
import br.edu.infnet.appconfeitaria.model.repository.AcessoRepository;

@Controller
public class AcessoController {
    @GetMapping(value = "/login")
    public String telaLogin() {
        return "login";
    }

    @PostMapping(value = "/login")
    public String login(Model model, @RequestParam String email, @RequestParam String senha) {

        Usuario usuario = new Usuario(email, senha);

        if(AcessoRepository.autenticar(usuario) != null) {
            return "redirect:/home";
        }

        model.addAttribute("mensagem", "A senha inserida está incorreta.");

        // return "redirect:/login";
        return telaLogin();
    }
}
