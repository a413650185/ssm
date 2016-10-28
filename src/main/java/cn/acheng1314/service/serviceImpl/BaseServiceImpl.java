package cn.acheng1314.service.serviceImpl;


import cn.acheng1314.dao.CompanyDao;
import cn.acheng1314.dao.UserDao;
import cn.acheng1314.domain.Company;
import cn.acheng1314.domain.User;
import cn.acheng1314.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by luozhiyun on 16/10/28.
 */
@Service("baseService")
@Transactional(readOnly=false,rollbackFor=Exception.class)
public class BaseServiceImpl implements BaseService{
	@Autowired
	private UserDao userDao;
	@Autowired
	private CompanyDao companyDao;

	@Override
	public int addUser(User user){
		try {
			return userDao.add(user);
		}catch (Exception ex){
			throw new RuntimeException();
		}
	}

	@Override
	public void addUser(String username, String password, int sex) {
		try {
			User u = new User();
			u.setSex(sex);
			u.setPassword(password);
			u.setUsername(username);
			userDao.add(u);
		}catch (Exception ex){
			throw new RuntimeException();
		}
	}

	@Override
	public void addCompany(Company company) {
		try {
			companyDao.add(company);
		}catch (Exception ex){
			throw new RuntimeException();
		}
	}
}
