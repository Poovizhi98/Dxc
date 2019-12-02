package com.dxc.pms.dao;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;

import com.dxc.pms.model.Dealer;
import com.dxc.pms.model.Maintainance;
import com.dxc.pms.model.User;
import com.dxc.pms.service.DealerService;
import com.dxc.pms.service.UserService;
import com.mongodb.WriteResult;


@Repository
public class DealerDAOImpl implements DealerDAO {

	@Autowired
	UserService userService;
    DealerService dealerService;
	@Autowired
	MongoTemplate mongotemplate;
	DealerDAO dealerDAO;
	@Override
	public boolean addDealer(int userId,Dealer dealer) {
		// TODO Auto-generated method stub
		User user=userService.getUser(userId);
		System.out.println(user);
		user.setDealer(dealer);
		mongotemplate.save(user);
		return false;
	}
	
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
	 @Override
	    public boolean isDealerExists(int userId, int dealerId) {
		 User user=userService.getUser(userId);
	        System.out.println(user);
	        Dealer r= user.getDealer();
	            if(r==null) {
	                return false;
	            }
	        return true;
	    }
	@Override
	public boolean deleteDealer(int userId,int dealerId)  {
		// TODO Auto-generated method stub
		 User user=userService.getUser(userId);
		 Dealer r= user.getDealer();

               // mongotemplate.remove(r);
//		 r.setDealerAddress("");
//		 r.setDealerContactNumber(0);
//		 r.setDealerEmail("");
		 r=null;
                user.setDealer(r);
                mongotemplate.save(user);
                
              return false;
		
	}
	 @Override
	    public boolean updateDealer(int userId, Dealer dealer) {
	        Query query=new Query();
	        query.addCriteria(new Criteria().andOperator(Criteria.where("_id").is(userId),
					Criteria.where("dealerId").is(dealer.getDealerId())));
			User user=userService.getUser(userId);
			
			Dealer r= user.getDealer();
//			r=null;
//					r.
//					user.setDealer(r);
//					mongotemplate.save(user);
//				   return true;
	        
	        Update update=new Update();
			update.set("dealerName", r.getDealerName());
			update.set("dealerEmail", r.getDealerEmail());
			update.set("dealerContactNumber",r.getDealerContactNumber() );
			update.set("dealerPinCode", r.getDealerPinCode());
			update.set("dealerAddress", r.getDealerAddress());
			
			WriteResult result=mongotemplate.updateFirst(query, update, User.class);
			int rowsAffected=result.getN();
			if(rowsAffected==0) {
				System.out.println("Couldnt update");
				return false;
				
			}
			else {
				System.out.println("Update successfull");
			return true;
	    }
	 }
//	@Override
//	public Dealer getAllDealer(int userId)  {
//		
//		//Dealer r= user.getDealer();
//		List<Dealer> dealer;
//		dealer=user.getDealer();
//		//finalMaintainance=user.getMaintainace();
//		//return finalMaintainance;
//		 //r= user.getDealer();
//		return dealer;
//	}
//	

	@Override
	public Dealer getAllDealer(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

}
