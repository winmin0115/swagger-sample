package kr.co.ldcc.swagger.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import kr.co.ldcc.swagger.model.User;
import kr.co.ldcc.swagger.service.UserServiceImpl;


@RestController
@Api(value = "User", tags = { "User"})
public class UserController {
	//
	@Autowired
	UserServiceImpl userService;
	
	@ApiOperation(value = "사용자 생성", tags = {"User"})
	@PostMapping("/users")
	@ResponseStatus(HttpStatus.CREATED)
	public User createUser(@RequestBody User user) throws Exception {
		return userService.register(user);
	}
	@ApiOperation(value = "사용자 조회")
	@GetMapping("/users/{userId}")
	@ResponseStatus(HttpStatus.OK)
	public User retrieveUser(@PathVariable String userId) {
		return userService.get(userId);
	}
	@ApiOperation(value = "사용자 삭제")
	@DeleteMapping("/users/{userId}")
	@ResponseStatus(HttpStatus.OK)
	public String deleteUser(@PathVariable String userId) {
		return userService.remove(userId);
	}
		
}
