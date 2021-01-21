package com.bootcamp.reactive.clients.domain.services;

import com.bootcamp.reactive.clients.domain.dto.ClientDto;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ClientService {
	Flux<ClientDto> findAll();
	Mono<ClientDto> save(ClientDto client);
	Mono<Void> delete(String id);
	Mono<ClientDto> findById(String id);
}
