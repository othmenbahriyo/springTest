package com.example.demo.service;


import java.util.List;

import com.example.demo.model.Acheter;
import com.example.demo.model.Acheter.Pk;

public interface AchatService {
	
	
	Acheter saveAchat(Acheter p);
	Acheter updateAchat(Acheter p);
	void deleteAchat(Acheter p);
	void deleteAchatById(Pk id);
	Acheter getAchat(Pk id);
	List<Acheter> getAllAchat();

}
