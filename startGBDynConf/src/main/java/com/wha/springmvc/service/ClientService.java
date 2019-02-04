package com.wha.springmvc.service;

import java.util.List;

import com.wha.springmvc.model.Client;


public interface ClientService {
	
Client findById(long id);
	
	
	void saveClient(Client client);
	
	void updateClient(Client client);
	
	void deleteClientById(long id);

	List<Client> findAllClients(); 
	
	void deleteAllClients();

}
