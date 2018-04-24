package kr.co.ldcc.swagger.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.ldcc.swagger.model.User;
import kr.co.ldcc.swagger.store.UserRepository;

@Service
public class UserServiceImpl {
	//
	@Autowired 
	UserRepository userRepository;
	
	public User register(User user) {
		userRepository.save(new User(user.getUserId(), user.getUserName(), user.getCompany()));
		return user;
	}
	
	public User get(String userId) {
		return userRepository.findById(userId).get();
	}
	
	public String remove(String userId) {
		userRepository.deleteById(userId);
		return null; 
	}
	

}
