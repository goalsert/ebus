package ebus.service;

import ebus.model.User;
import ebus.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by tao.tang on 14-7-30.
 */
@Service
public class Neo4jUserService implements UserServiceI{

    @Autowired
    private UserRepo userRepo;
    @Override
    public void insertUser(User user) {
        userRepo.save(user);
    }
}
