package in.sp.main.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.sp.main.entities.User;
import in.sp.main.repositories.UserRepository;

@Service class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public boolean registerUser(User user) {
		
		
		try {
			userRepository.save(user);
			return true;
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}

	@Override
	public User loginUser(String email, String password) {
		User vUser= userRepository.findByEmail(email);
		if(vUser!=null && vUser.getPassword().equals(password))
		{
			return vUser;
		}
		return null;
	}
	

}
