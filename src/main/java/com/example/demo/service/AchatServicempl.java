package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.Acheter;
import com.example.demo.model.Acheter.Pk;
import com.example.demo.repos.AchatReposetory;

public class AchatServicempl implements AchatService {

	@Autowired
	AchatReposetory achatReposetory;
	
	@Override
	public Acheter saveAchat(Acheter a) {
		// TODO Auto-generated method stub
		return achatReposetory.save(a);
	}

	@Override
	public Acheter updateAchat(Acheter a) {
		// TODO Auto-generated method stub
		return  achatReposetory.save(a);
	}

	@Override
	public void deleteAchat(Acheter a) {
		// TODO Auto-generated method stub
		 achatReposetory.delete(a);
		
	}

	@Override
	public void deleteAchatById(Pk id) {
		// TODO Auto-generated method stub
		 achatReposetory.deleteById(id);
		
	}

	@Override
	public Acheter getAchat(Pk id) {
		// TODO Auto-generated method stub
		return achatReposetory.findById(id).get();
	}

	@Override
	public List<Acheter> getAllAchat() {
		// TODO Auto-generated method stub
		return achatReposetory.findAll();
	}


}
