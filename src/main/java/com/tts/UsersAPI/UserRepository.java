package com.tts.UsersAPI;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

	public List<User> findAll();
	
	public Optional<User> findById( Long id);
	
	public void deleteById(Long id);

	public List<User> findByState(String state);



}
