package cn.acheng1314.dao;

import cn.acheng1314.domain.Company;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

import static org.junit.Assert.*;

/**
 * Created by luozhiyun on 16/10/29.
 */
public class CompanyDaoTest extends BaseTest {
	@Autowired
	private CompanyDao companyDao;

	@Test
	public void add() throws Exception {
		Company c = new Company();
		c.setAddress("湖南");
		c.setName("麦片");
		c.setDate(new Date());
		c.setNumber(1132);
		c.setTel(123123);
		companyDao.add(c);
	}

}