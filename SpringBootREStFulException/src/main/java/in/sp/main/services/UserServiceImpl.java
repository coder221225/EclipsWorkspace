package in.sp.main.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.WebRequest;

import in.sp.main.entities.User;
import in.sp.main.exception.UserAlreadyExistException;
import in.sp.main.exception.UserNotFoundException;
import in.sp.main.repositories.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public User createUser(User user) {
		
		Optional<User> optionalUser= userRepository.findByEmail(user.getEmail());
		if(optionalUser.isPresent()) {
		throw new UserAlreadyExistException("User already exist for this email.");
		}
		return userRepository.save(user);
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@Override
	public Optional<User> getUserDetails(int id) {
		// TODO Auto-generated method stub
		if(userRepository.findById(id).isPresent()) {
		return userRepository.findById(id);}
		else {
			throw new UserNotFoundException("User Does not exist.");
		}
	}

	@Override
	public User updateUserDetails(int id, User newUser) {
		User userData = userRepository.findById(id).orElse(null);
		if (userData != null) {
			return userRepository.save(newUser);
		} else {
			throw new RuntimeException("User not found with id:" + id);
		}
	}

	@Override
	public boolean deleteUser(int id) {
		User userData1 = userRepository.findById(id).orElse(null);
		userRepository.deleteById(id);
		User userData2 = userRepository.findById(id).orElse(null);
		if (userData1 != null && userData2 == null) {
			return true;
		} else {
			return false;
		}
	}
}
