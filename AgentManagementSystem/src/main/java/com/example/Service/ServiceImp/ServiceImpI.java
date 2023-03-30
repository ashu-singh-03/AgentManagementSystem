package com.example.Service.ServiceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.Entity.Agent;
import com.example.Service.AgentService;
import com.example.repository.AgentRepository;

@Repository
public class ServiceImpI implements AgentService {
	@Autowired
	
	
	AgentRepository agentRepository;
	@Override
	public Agent addAgent(Agent agent) {
		// TODO Auto-generated method stub
		return agentRepository.save(agent);
	}

	@Override
	public List<Agent> getAllAgent() {
		// TODO Auto-generated method stub
		return agentRepository.findAll();
	}

	@Override
	public void deleteAgent(int id) {
		// TODO Auto-generated method stub
		agentRepository.deleteById(id);
	}

	@Override
	public Agent UpdateAgent(Agent agent) {
		// TODO Auto-generated method stub
		Agent _agent = agentRepository.findById(agent.getAid()).get();
		_agent.setAname(agent.getAname());
		_agent.setAcommission(agent.getAcommission());
		agentRepository.save(_agent);
		return  _agent;
	}

}
