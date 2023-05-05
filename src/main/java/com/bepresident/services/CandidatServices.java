package com.bepresident.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bepresident.interfaces.CandidatInterface;
import com.bepresident.model.Candidat;
import com.bepresident.repo.CandidatDao;


@Service
@Transactional
public class CandidatServices implements CandidatInterface{
	
	@Autowired
	CandidatDao dao;

	@Override
	public Candidat getOne(int id) {
		return dao.findById(id).get();
	}

	@Override
	public void save(Candidat candidat) {
		dao.save(candidat);		
	}

	@Override
	public void update(Candidat candidat, int id) {
		dao.findById(id).ifPresent((x)->{
			dao.save(candidat);
		});		
	}

	@Override
	public void deleteOne(int id) {
		dao.deleteById(id);
		
	}

}
