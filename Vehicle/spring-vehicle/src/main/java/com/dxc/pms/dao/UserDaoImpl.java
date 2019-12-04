package com.dxc.pms.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.dxc.pms.model.User;
import com.mongodb.WriteResult;
@Repository
public class UserDaoImpl implements UserDao {
	@Autowired
	MongoTemplate mongotemplate;
	UserDao dao;


	//Create User
	@Override
	public boolean addUser(User user) {
		System.out.println("Inside product Dao and the details are"+user);
		mongotemplate.save(user);
		if(!(user.getDealer()==null)) {
			mongotemplate.save(user.getDealer(),"dealer");	
		}
		return false;
	}

    //Get user by Id
	@Override
	public User getUser(int userId) {
		return mongotemplate.findById(userId, User.class,"user");
	}

    //Delete user by Id
	@Override
	public boolean deleteUser(int userId) {
		User object=new User();
		object.setUserId(userId);
		WriteResult result=mongotemplate.remove(object);
		System.out.println(result);
		int  rowsAffected=result.getN();
		if(rowsAffected==0)
		return false;
		else
			return true;
	}

    //Update existing user
	@Override
	public boolean updateUser(User user) {
		System.out.println("Inside product Dao and the details are"+user);
		if(isUserExists(user.getUserId())) {
			mongotemplate.save(user);
			System.out.println("Update successfull");
			return true;
		}
		else {
			System.out.println("Update unsuccessfull because user does not exist");
			return false;
		}
}

    //Check whether the user is there or not
	@Override
	public boolean isUserExists(int userId) {
		User user=mongotemplate.findById(userId, User.class, "user");
		if(user==null) {
			return false;
		}
		else
		return true;
	}

    //Get all users
	@Override
	public List<User> getAllUsers() {
		return mongotemplate.findAll(User.class);
		
	}

    //Get users by name
	@Override
	public List<User> searchUserbyName(String userName) {
		Query query=new Query();
		query.addCriteria(Criteria.where("userName").is(userName));
		List<User> list=mongotemplate.find(query, User.class);
		System.out.println(list);
		return list;
		
	}
	
	//Get userId by email
	public int login(String email) {
		int ID=0;
		List<User> list=new ArrayList<User>();
		list=mongotemplate.findAll(User.class);
		System.out.println(list);
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getEmail());
			System.out.println(email);
			if(list.get(i).getEmail().equals(email)) {
				System.out.println("true");
				 ID=list.get(i).getUserId();
			}
		}
		return ID;
	}

	@Override
	public boolean isEmailExists(String email) {
		boolean res=false;
		List<User> list=new ArrayList<User>();
		list=mongotemplate.findAll(User.class);
		System.out.println(list);
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getEmail());
			System.out.println(email);
			if(list.get(i).getEmail().equals(email)) {
				return res=true;	 
			}
		}
		return res;
	}
	
}
