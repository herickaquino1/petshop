package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import model.Veterinario;

@Controller
public class programa {
	@GetMapping("/cadastro/veterinario")
	public String veterinarioCadastro(Model model) {
		Veterinario veterinario = new Veterinario();
		model.addAttribute("veterinario", veterinario);
		
		return "Veterinario";
	}

	

}
