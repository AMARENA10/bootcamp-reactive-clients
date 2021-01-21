package com.bootcamp.reactive.clients.persistence.repositories;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.bootcamp.reactive.clients.persistence.entities.Client;

public interface ClientsRepository extends ReactiveMongoRepository <Client, String> {

}
