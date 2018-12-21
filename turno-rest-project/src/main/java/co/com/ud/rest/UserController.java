package co.com.ud.rest;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import co.com.ud.bussines.dto.UserDto;
import co.com.ud.bussines.user.IUserService;
import co.com.ud.repo.entity.UserEntity;

@Controller
@RequestMapping("/v.1/user")
public class UserController {
	
	@Autowired
	IUserService userService;
	
	@Autowired
	ModelMapper modelMapper;
	
	@Secured(value= {"ROLE_ADMIN", "ROLE_USER"})
	@GetMapping("/")
	public ResponseEntity<UserDto[]> getUser(){
		return new ResponseEntity<UserDto[]>(modelMapper.map(userService.findAll(), UserDto[].class), HttpStatus.OK);
	}
	
	@Secured("ROLE_ADMIN")
	@GetMapping("/{id}")
	public ResponseEntity<UserDto> getUserById(@PathVariable(required=true,value="id")Long id){
		return new ResponseEntity<UserDto>(modelMapper.map(userService.findById(id).get(), UserDto.class), HttpStatus.OK);
	}
	@Secured("ROLE_ADMIN")
	@PostMapping("/")
	public ResponseEntity<UserDto> save(@RequestBody(required=true)UserDto user){
		return new ResponseEntity<UserDto>(modelMapper.map(userService.saveUser(modelMapper.map(user, UserEntity.class)), UserDto.class ), HttpStatus.OK);
	}
	
}
