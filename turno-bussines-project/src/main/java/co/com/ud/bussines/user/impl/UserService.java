package co.com.ud.bussines.user.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.ud.bussines.user.IUserService;
import co.com.ud.repo.entity.UserEntity;
import co.com.ud.repo.repository.IUserRepository;

@Service
public class UserService implements IUserService {

	@Autowired
	IUserRepository userRepository;

	@Override
	public List<UserEntity> findAll() {
		return userRepository.findAll();
	}
	
	@Override
	public Optional<UserEntity> findById(Long id) {
		return userRepository.findById(id);
	}

	@Override
	public UserEntity saveUser(UserEntity user) {
		return userRepository.save(user);
	}

}
