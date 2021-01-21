package com.bootcamp.reactive.clients.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bootcamp.reactive.clients.persistence.entities.Client;
import com.bootcamp.reactive.clients.persistence.repositories.ClientsRepository;

import reactor.core.publisher.Flux;

@RestController
@RequestMapping("clients")
public class ClientsController {

	@Autowired
	private ClientsRepository clientRepository;
	
	@GetMapping
	public Flux<Client> findAll() {
		return this.clientRepository.findAll();
	}

}
