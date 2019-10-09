package com.veiculos.atividadeVeiculos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.veiculos.atividadeVeiculos.model.Veiculo;
import com.veiculos.atividadeVeiculos.repository.VeiculosRepository;

@Controller
public class VeiculosController {
      
	@Autowired
	private VeiculosRepository veiculosRepo;
	
	@GetMapping("/veiculos") //Quando usuário digitar /veiculos irá para lista_veiculos.html
	public ModelAndView mostrarVeiculos() {
		
	ModelAndView mv = new ModelAndView("lista_veiculos");
	
	List<Veiculo> veiculos = veiculosRepo.findAll();
		
	mv.addObject("veiculos",veiculos);
	
	return mv;
		
		
	}
	
}
