package com.dxc.pms.controller;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.dxc.pms.dao.UserDaoImpl;
import com.dxc.pms.model.Dealer;
import com.dxc.pms.model.Maintainance;
import com.dxc.pms.model.User;

public class Controller_UserTest {
UserDaoImpl daoImpl;
	@Before
	public void setUp() throws Exception {
		daoImpl=new UserDaoImpl();
	}
//
//	@After
//	public void tearDown() throws Exception {
//	}

	@Test
	public void testGetUser() {		
	    Maintainance maintainance1=new Maintainance(100,"Car","BrakeFailure","20/11/19",200);
	    List<Maintainance> allmaintainance=new ArrayList<Maintainance>();
	    allmaintainance.add(maintainance1);
	    Dealer dealer=new Dealer(200,"Sam","sam@gmail.com",678901295,456789,"Bangalore");
	    User user1=new User(300,"Ranjitha","ranjitha@gmail.com",456789045,636906,"qwertyui",allmaintainance,dealer);
	    daoImpl.addUser(user1);
	    User user2=daoImpl.getUser(300);
	    assertNotNull(user2);
	    daoImpl.deleteUser(300);
	    
	}

	@Test
	public void testDeleteUser() {
		Maintainance maintainance1=new Maintainance(100,"Car","BrakeFailure","20/11/19",200);
	    List<Maintainance> allmaintainance=new ArrayList<Maintainance>();
	    allmaintainance.add(maintainance1);
	    Dealer dealer=new Dealer(200,"Sam","sam@gmail.com",678901295,456789,"Bangalore");
	    User user1=new User(300,"Ranjitha","ranjitha@gmail.com",456789045,636906,"qwertyui",allmaintainance,dealer);
	    daoImpl.addUser(user1);
	    int size1=daoImpl.getAllUsers().size();
	    daoImpl.deleteUser(300);
	    int size2=daoImpl.getAllUsers().size();
	    assertEquals(size2+1, size1);
	}

	@Test
	public void testGetAllUsers() {
		int size1=daoImpl.getAllUsers().size();
		Maintainance maintainance1=new Maintainance(100,"Car","BrakeFailure","20/11/19",200);
	    List<Maintainance> allmaintainance=new ArrayList<Maintainance>();
	    allmaintainance.add(maintainance1);
	    Dealer dealer=new Dealer(200,"Sam","sam@gmail.com",678901295,456789,"Bangalore");
	    User user1=new User(300,"Ranjitha","ranjitha@gmail.com",456789045,636906,"qwertyui",allmaintainance,dealer);
	    daoImpl.addUser(user1);
	    int size2=daoImpl.getAllUsers().size();
	    assertNotSame(size2, size1);
	    daoImpl.deleteUser(300);
	}

	@Test
	public void testSaveUser() {
		int size1=daoImpl.getAllUsers().size();
		Maintainance maintainance1=new Maintainance(100,"Car","BrakeFailure","20/11/19",200);
	    List<Maintainance> allmaintainance=new ArrayList<Maintainance>();
	    allmaintainance.add(maintainance1);
	    Dealer dealer=new Dealer(200,"Sam","sam@gmail.com",678901295,456789,"Bangalore");
	    User user1=new User(300,"Ranjitha","ranjitha@gmail.com",456789045,636906,"qwertyui",allmaintainance,dealer);
	    daoImpl.addUser(user1);
	    int size2=daoImpl.getAllUsers().size();
	    assertNotSame(size2, size1);
	    daoImpl.deleteUser(300);
		
	}

	@Test
	public void testUpdateUser() {
		Maintainance maintainance1=new Maintainance(100,"Car","BrakeFailure","20/11/19",200);
	    List<Maintainance> allmaintainance=new ArrayList<Maintainance>();
	    allmaintainance.add(maintainance1);
	    Dealer dealer=new Dealer(200,"Sam","sam@gmail.com",678901295,456789,"Bangalore");
	    User user1=new User(300,"Ranjitha","ranjitha@gmail.com",456789045,636906,"qwertyui",allmaintainance,dealer);
	    daoImpl.addUser(user1);
	    List<User> list=daoImpl.getAllUsers();
	    
	    Maintainance maintainance2=new Maintainance(100,"Car","Required maintainance","20/11/19",200);
	    List<Maintainance> allmaintainance2=new ArrayList<Maintainance>();
	    allmaintainance2.add(maintainance2);
	    Dealer dealer2=new Dealer(200,"Sam","sam@gmail.com",987654122,456789,"Bangalore");
	    User user2=new User(300,"Ranjitha","ranjitha@gmail.com",456789045,636906,"qwertyui",allmaintainance2,dealer2);
	    daoImpl.updateUser(user2);
	    
	    List<User> list2=daoImpl.getAllUsers();
	    assertNotSame(list, list2);
	    
	}

	@Test
	public void testLogin() {
		fail("Not yet implemented");
	}

}
