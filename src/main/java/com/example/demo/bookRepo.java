package com.example.demo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.model.noteApi;

@RepositoryRestResource(collectionResourceRel="notes",path="notes")
public interface bookRepo extends JpaRepository<noteApi,Integer> {

}
