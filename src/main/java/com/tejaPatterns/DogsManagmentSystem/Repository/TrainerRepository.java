package com.tejaPatterns.DogsManagmentSystem.Repository;

import org.springframework.data.repository.CrudRepository;

import com.tejaPatterns.DogsManagmentSystem.Model.Trainer;

public interface TrainerRepository extends CrudRepository<Trainer, Integer> {

}
