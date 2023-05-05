package com.bepresident.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bepresident.model.Candidat;

@Repository
public interface CandidatDao extends CrudRepository<Candidat,Integer>{

}
