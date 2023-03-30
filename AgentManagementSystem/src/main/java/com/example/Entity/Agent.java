package com.example.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name="AgentsDetail")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Agent {
	@Id
 int Aid;
 String Aname;
 String Acommission;
 
}