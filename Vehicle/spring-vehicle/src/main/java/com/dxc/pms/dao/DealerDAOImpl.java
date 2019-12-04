package com.dxc.pms.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import com.dxc.pms.model.Dealer;
import com.dxc.pms.model.User;
import com.dxc.pms.service.DealerService;
import com.dxc.pms.service.UserService;

@Repository
public class DealerDAOImpl implements DealerDAO {

	@Autowired
	UserService userService;
    DealerService dealerService;
	@Autowired
	MongoTemplate mongotemplate;
	DealerDAO dealerDAO;
	@Autowired
	UserDaoImpl daoImpl;
	
	//Create new dealer
	@Override
	public boolean addDealer(int userId,Dealer dealer) {
		// TODO Auto-generated method stub
		User user=userService.getUser(userId);
		System.out.println(user);
		user.setDealer(dealer);
		mongotemplate.save(user);
		mongotemplate.save(user.getDealer(),"dealer");
		return false;
	}
	
	//Get dealer by Id
	@Override
	public Dealer getDealer(int userId,int dealerId) {
		User user=userService.getUser(userId);
		System.out.println(user);
		Dealer r= user.getDealer();
		System.out.println(r);
			if(r.getDealerId()==dealerId) {
				return r;
			}
		return null;
	}
	
	//Check whether the dealer is there or not
	 @Override
	    public boolean isDealerExists(int userId, int dealerId) {
			Dealer dealer=mongotemplate.findById(dealerId, Dealer.class,"dealer");
	        System.out.println(dealer);
	            if(dealer==null) {
	                return false;
	            }
	        return true;
	    }
	 
	 //Delete dealer by Id
	@Override
	public boolean deleteDealer(int userId,int dealerId)  {
		// TODO Auto-generated method stub
		//Deleting from the user database
		List<User> list=daoImpl.getAllUsers();
		System.out.println("Inside delete dealer");
		for(int i=0;i<list.size();i++) {
			System.out.println();
			if(!(list.get(i).getDealer()==null)) {
				if(list.get(i).getDealer().getDealerId()==dealerId) {
					list.get(i).setDealer(null);
				}	
			}
			
			mongotemplate.save(list.get(i));
		}         
         //Deleting from the dealer database    
		Dealer dealer=mongotemplate.findById(dealerId, Dealer.class,"dealer");
           mongotemplate.remove(dealer, "dealer");    
              return false;
	}
	
	//Update dealer
	 @Override
	    public boolean updateDealer(int userId, Dealer dealer) {
	  System.out.println("Inside dealer daoImpl");
			User user=userService.getUser(userId);
			user.setDealer(dealer);			
			mongotemplate.save(user.getDealer(), "dealer");
			mongotemplate.save(user, "user");
			return true;
}
	 
	 //Get all dealers
	@Override
	public List<Dealer> getAllDealer(int userId) {
		List<User> list=daoImpl.getAllUsers();
		List<Dealer> dealers=new ArrayList<Dealer>();
		System.out.println(list);
		for(int i=0;i<list.size();i++) {
			Dealer dealer=list.get(i).getDealer();
			dealers.add(dealer);	
			}
			System.out.println(dealers);
		return dealers;
	}

	//Get all dealers from dealer class
	@Override
	public List<Dealer> getAllDealer() {
		return mongotemplate.findAll(Dealer.class);
		
	}

}
