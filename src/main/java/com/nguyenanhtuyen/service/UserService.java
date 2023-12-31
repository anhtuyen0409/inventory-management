package com.nguyenanhtuyen.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nguyenanhtuyen.dao.UserDAO;
import com.nguyenanhtuyen.model.Users;

@Service
public class UserService {
	final static Logger log = Logger.getLogger(UserService.class);
	@Autowired
	private UserDAO<Users> userDAO;
	public List<Users> findByProperty(String property , Object value) {
		log.info("Find user by property start ");
		return userDAO.findByProperty(property, value);
		
	}
}
