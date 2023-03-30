package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Entity.Agent;



public interface AgentRepository  extends JpaRepository<Agent, Integer> {

	
	static List<Agent>  findAllRepository()
	{
		return null;
	}

}