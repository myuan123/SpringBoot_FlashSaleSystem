package flashsale.flashsale.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import flashsale.flashsale.dao.UserDao;
import flashsale.flashsale.domain.User;

@Service
public class UserService {
	@Autowired
	UserDao userDao;
	
	public User getById(int id) {
		return userDao.getById(id);
	}
	
	public int insert(User user) {
		return userDao.insertUser(user);
	}

	
	@Transactional
	public Boolean transaction() {
		User u1=new User();
		u1.setId(2);
		u1.setName("Alex");
		insert(u1);
		
		User u2=new User();
		u2.setId(1);
		u2.setName("sun");
		insert(u2);
		return false;
	}
}
