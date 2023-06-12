package com.exam.examserver.service.implementation;

import com.exam.examserver.helper.UserFoundException;
import com.exam.examserver.helper.UserNotFoundException;
import com.exam.examserver.model.User;
import com.exam.examserver.model.UserRole;
import com.exam.examserver.repository.RoleRepository;
import com.exam.examserver.repository.UserRepository;
import com.exam.examserver.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepo;

    @Autowired
    private RoleRepository roleRepo;

    //Creating user
    @Override
    public User createUser(User user, Set<UserRole> userRoles) throws Exception {

        User local = this.userRepo.findByUsername(user.getUsername());

        if(local!=null){
            System.out.println("User already exists");
            throw new UserFoundException("User already present!");
        }
        else {
            for(UserRole userRole : userRoles){
                roleRepo.save(userRole.getRole());
            }
            user.getUserRoles().addAll(userRoles);
            local = this.userRepo.save(user);

        }
        return local;
    }






    @Override
    public User saveUser(User user) {
        return userRepo.save(user);
    }

    //getting user by username
    @Override
    public User getUser(String username) {
        return this.userRepo.findByUsername(username);
    }

    @Override
    public void deleteUser(Long userId) {
         this.userRepo.deleteById(userId);}
}
