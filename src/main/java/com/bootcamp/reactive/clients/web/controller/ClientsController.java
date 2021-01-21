package com.bootcamp.reactive.clients.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bootcamp.reactive.clients.domain.dto.ClientDto;
import com.bootcamp.reactive.clients.domain.services.ClientService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("clients")
public class ClientsController {

	@Autowired
	private ClientService clientService;
	
	@GetMapping("/{id}")
	public Mono<ClientDto> findById(@PathVariable("id") String id){
		return this.clientService.findById(id);
	}
	
	@GetMapping
	public Flux<ClientDto> findAll() {
		return this.clientService.findAll();
	}
	
	@PostMapping
	public Mono<ClientDto> save(@RequestBody ClientDto client){
		return this.clientService.save(client);
	}
	
	@DeleteMapping("/{id}")
	public Mono<Void> delete(@PathVariable("id") String id){
		return this.clientService.delete(id);
	}
	
	

}
