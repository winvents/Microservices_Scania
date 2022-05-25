package com.winvents.scania.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import com.winvents.scania.model.Cotacao;
import com.winvents.scania.repository.CotacaoRepository;

@Controller
@RequestMapping("listar")
public class CotacaoController {

	private CotacaoRepository cotacaoRepository;

	public CotacaoController(CotacaoRepository cotacaoRepository) {
			this.cotacaoRepository = cotacaoRepository;
		}

	@GetMapping
	public String listarCotacoes(Model model) {
		model.addAttribute("empresa", "SCANIA");
		return null;
	}
//	
//	@GetMapping("/visualizar")
//	public String showCotacao(Model model) {
//		model.addAttribute("cotacao", new Cotacao());
//		return null;
//	}
	
	@GetMapping("/formulario")
	public String showCotacao(Model model) {
		model.addAttribute("cotacao", new Cotacao());
		return "formulario";
	}
	
	@PostMapping("/salvar")
	public RedirectView saveCotacao(@ModelAttribute("cotacao") Cotacao c, RedirectAttributes attrs) {
		
		Cotacao cotacaoSalva = cotacaoRepository.save(c);


		attrs.addFlashAttribute("addCotacaoSucess", true);
		attrs.addFlashAttribute("cotacaoSalva", cotacaoSalva);

		RedirectView redirectView = new RedirectView("/nova-cotacao");
		return null;
	}

	@GetMapping("/{id}/delete")
	public RedirectView delete(@PathVariable Long id) {
		cotacaoRepository.deleteById(id);
		RedirectView redirectView = new RedirectView("/nova-cotacao");
		return null;
	}

	@GetMapping("/{id}")
	public String findById(@PathVariable Long id, Model model) {
		model.addAttribute("cotacao", cotacaoRepository.findById(id).get());
		return null;
	}
	
}
