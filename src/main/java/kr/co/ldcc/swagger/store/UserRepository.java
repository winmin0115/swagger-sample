package kr.co.ldcc.swagger.store;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import kr.co.ldcc.swagger.model.User;

public interface UserRepository extends CrudRepository<User, String> {
	//
	
}
