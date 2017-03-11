package com.meadote.pets;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PetController {
	
	@Autowired
	private PetService petService;
	
	@RequestMapping("/pets")
	public List<Pet>  getAll() {
		return petService.getAll();
	}
	
	@RequestMapping("/pets/{id}")
	public Pet getById(@PathVariable long id) {
		return petService.getBy(id);
	}

}
