package com.exam.examserver;

import com.exam.examserver.helper.UserFoundException;
import com.exam.examserver.model.Role;
import com.exam.examserver.model.User;
import com.exam.examserver.model.UserRole;
import com.exam.examserver.service.UserService;
import com.exam.examserver.service.implementation.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class ExamServerApplication /*implements CommandLineRunner*/{

	@Autowired
	private UserService userService;

	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	public static void main(String[] args) {
		SpringApplication.run(ExamServerApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//		System.out.println("Starting code ....");
//		try {
//			User user = new User();
//			user.setFirstName("Jahangir");
//			user.setLastName("Kalwar");
//			user.setUsername("jahangir06");
//			user.setPassword(this.bCryptPasswordEncoder.encode("jk123"));
//			user.setEmail("kalwar06@gmail.com");
//			user.setProfile("default.png");
//
//
//			Role role1 = new Role();
//			role1.setRoleId(44L);
//			role1.setRoleName("ADMIN");
//
//			Set<UserRole> userRoleSet = new HashSet<>();
//			UserRole userRole = new UserRole();
//
//			userRole.setRole(role1);
//			userRole.setUser(user);
//
//			userRoleSet.add(userRole);
//
//			User user1 = this.userService.createUser(user, userRoleSet);
//			System.out.println(user1.getUsername());
//		}
//		catch (UserFoundException ex){
//			ex.printStackTrace();
//		}

		}

