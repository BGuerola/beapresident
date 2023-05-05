package com.bepresident.interfaces;

import com.bepresident.model.Candidat;

public interface CandidatInterface {
	
	public Candidat getOne(int id);
	public void save(Candidat candidat);
	public void update(Candidat candidat, int id);
	public void deleteOne(int id);
	

}
