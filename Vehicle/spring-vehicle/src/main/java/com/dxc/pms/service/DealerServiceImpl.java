package com.dxc.pms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.pms.dao.DealerDAO;
import com.dxc.pms.model.Dealer;

@Service
public class DealerServiceImpl implements DealerService {

	@Autowired
	DealerDAO dealerDAO;
	@Override
	public boolean addDealer(int userId,Dealer dealer) {
		// TODO Auto-generated method stub
		return dealerDAO.addDealer(userId,dealer);
	}
	@Override
	public Dealer getDealer(int userId,int dealerId) {
		// TODO Auto-generated method stub
		return dealerDAO.getDealer(userId,dealerId);
	}
	@Override
	public boolean isDealerExists(int userId,int dealerId) {
		// TODO Auto-generated method stub
		return dealerDAO.isDealerExists(userId,dealerId);
	}
	@Override
	public boolean deleteDealer(int userId,int dealerId) {
		// TODO Auto-generated method stub
		return dealerDAO.deleteDealer(userId,dealerId);
	}
	@Override
	public boolean updateDealer(int userId,Dealer dealer) {
		// TODO Auto-generated method stub
		System.out.println("inside update dealer service");
		return dealerDAO.updateDealer(userId,dealer);
	}
	@Override
	public List<Dealer> getAllDealer(int userId) {
		// TODO Auto-generated method stub
		List<Dealer> list=dealerDAO.getAllDealer(userId);
		return list;
	}
	@Override
	public List<Dealer> getAllDealers() {
		
		 return dealerDAO.getAllDealer();
	}
	
	
}
