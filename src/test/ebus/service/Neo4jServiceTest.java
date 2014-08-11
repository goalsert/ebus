package ebus.service;

import ebus.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.neo4j.rest.support.RestTestBase;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by tao.tang on 14-7-29.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/test-applicationContext.xml")
public class Neo4jServiceTest extends RestTestBase {

    @Autowired
    Neo4jUserService neo4jUserService;
    @Test
    public void testNeo4jService() {
        User user = new User();
        user.setName("user");
        user.setEmail("user@pnr.com");
        user.setPwd("user");
        neo4jUserService.insertUser(user);
    }
}
