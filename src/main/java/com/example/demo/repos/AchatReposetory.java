package com.example.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Acheter;
import com.example.demo.model.Acheter.Pk;

@Repository
public interface AchatReposetory extends JpaRepository<Acheter, Pk> {

}
