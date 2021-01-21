package com.bootcamp.reactive.clients.domain.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bootcamp.reactive.clients.domain.dto.ClientDto;
import com.bootcamp.reactive.clients.domain.services.ClientService;
import com.bootcamp.reactive.clients.persistence.entities.Client;
import com.bootcamp.reactive.clients.persistence.repositories.ClientsRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ClientServiceImpl implements ClientService {

	@Autowired
	private ClientsRepository clientRepository;

	@Override
	public Flux<ClientDto> findAll() {
		
		return this.clientRepository.findAll()
				.map(p -> new ClientDto(p.getId(), p.getDni(), p.getName(), p.getOld(), p.getSex(), p.getAddress()));

	}

	@Override
	public Mono<ClientDto> save(ClientDto client) {
		
	 	Client clientEntity= new Client(client.getId(), client.getDni(), client.getName(), client.getOld(), client.getSex());
	 	
		return this.clientRepository.save(clientEntity)
				.map(p -> new ClientDto(p.getId(), p.getDni(), p.getName(), p.getOld(), p.getSex(), p.getAddress()));
	}

	@Override
	public Mono<Void> delete(String id) {
		
		return this.clientRepository.deleteById(id);

	}

	@Override
	public Mono<ClientDto> findById(String id) {
		return this.clientRepository.findById(id)
				.map(p -> new ClientDto(p.getId(), p.getDni(), p.getName(), p.getOld(), p.getSex(), p.getAddress()));
	}

}
