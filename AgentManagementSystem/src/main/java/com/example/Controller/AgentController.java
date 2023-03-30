package com.example.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Entity.Agent;
import com.example.Service.AgentService;

@RestController

public class AgentController {                   
	@Autowired
	AgentService agentService;
	
	@GetMapping(value = "/agnet")
	public List<Agent> getAllAgent()
	{
		return agentService.getAllAgent();
	}

	@PostMapping(value = "/agent")
	public Agent addNewBook(@RequestBody Agent agent)
	{
		return agentService.addAgent(agent);
	}

	@DeleteMapping(value = "/agent/{id}")
	public String deleteAgent(@PathVariable int id)
	{
		return "Agent is deleted";
	}

	//With the help of put you can change the data that you have entered previous
	@PutMapping(value = "/agent")
	public Agent updateAgent(@RequestBody Agent agent)
	{
		return agentService.UpdateAgent(agent);  
	}
}
