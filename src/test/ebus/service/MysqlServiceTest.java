package ebus.service;

import ebus.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by tao.tang on 14-7-29.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/test-applicationContext.xml")
public class MysqlServiceTest {

    @Autowired
    MysqlUserService mysqlService;

    @Test
    public void testMysqlService() {
        User user = new User();
        user.setName("user");
        user.setEmail("user@pnr.com");
        user.setPwd("user");
        mysqlService.insertUser(user);
    }
}
