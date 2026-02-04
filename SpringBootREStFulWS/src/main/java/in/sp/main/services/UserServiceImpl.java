package in.sp.main.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.sp.main.entities.User;
import in.sp.main.repositories.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public User createUser(User user) {

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
		return userRepository.findById(id);
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
