package cn.acheng1314.service;

import cn.acheng1314.dao.CompanyDao;
import cn.acheng1314.domain.Company;
import com.sun.xml.internal.rngom.parse.host.Base;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

import static org.junit.Assert.*;

/**
 * Created by luozhiyun on 16/10/29.
 */
public class BaseServiceTest {
	@Autowired
	private CompanyDao companyDao;
	@Autowired
	private BaseService baseService;

	@Test
	public void addCompany() throws Exception {
		Company c = new Company();
		c.setAddress("湖南");
		c.setName("麦片");
		c.setDate(new Date());
		c.setNumber(1132);
		c.setTel(123123);
		baseService.addCompany(c);
		System.out.println("hhhhh");
	}

}