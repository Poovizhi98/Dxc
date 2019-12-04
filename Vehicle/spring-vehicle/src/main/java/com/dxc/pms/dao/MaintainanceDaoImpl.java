package com.dxc.pms.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import com.dxc.pms.model.Maintainance;
import com.dxc.pms.model.User;

@Repository
public class MaintainanceDaoImpl implements MaintainanceDao {
	@Autowired
	MongoTemplate mongotemplate;
	@Autowired
	UserDaoImpl daoImpl;

	// Create new maintenance
	@Override
	public Maintainance addMaintainance(int uId, Maintainance maintainance) {
		System.out.println(maintainance);
		User user = daoImpl.getUser(uId);
		List<Maintainance> finalMaintainance = user.getMaintainace();
		finalMaintainance.add(maintainance);
		user.setMaintainace(finalMaintainance);
		mongotemplate.save(user);
		return null;
	}

	// Get maintenance by Id
	public List<Maintainance> getMaintainance(int uId, int mId) {
		// TODO Auto-generated method stub
		User user = daoImpl.getUser(uId);
		List<Maintainance> finalMaintainance = user.getMaintainace();
		List<Maintainance> list = new ArrayList<Maintainance>();
		for (int i = 0; i < finalMaintainance.size(); i++) {
			if (finalMaintainance.get(i).getMaintainID() == mId) {
				list.add(finalMaintainance.get(i));
			}
		}
		return list;
	}

	// Get all maintenances
	public List<Maintainance> getAllMaintainance(int uId) {
		User user = daoImpl.getUser(uId);
		List<Maintainance> finalMaintainance;
		finalMaintainance = user.getMaintainace();
		return finalMaintainance;
	}

	// Delete maintenance by Id
	public boolean deleteMaintainance(int uId, int mId) {
		// TODO Auto-generated method stub
		User user = daoImpl.getUser(uId);
		List<Maintainance> finalMaintainance;
		finalMaintainance = user.getMaintainace();
		for (int i = 0; i < finalMaintainance.size(); i++) {
			if (finalMaintainance.get(i).getMaintainID() == mId) {
				finalMaintainance.remove(i);
			}
			System.out.println(finalMaintainance);
			user.setMaintainace(finalMaintainance);
			mongotemplate.save(user);
		}
		return true;
	}

	// Check whether maintenance exists or not
	@Override
	public boolean isMaintainanceExists(int uId, int mId) {
		System.out.println("Inside is maintainance exists");
		User user = daoImpl.getUser(uId);
		System.out.println(mId);
		List<Maintainance> list = user.getMaintainace();
		boolean res =false;
		if (list.size() == 0) {
			System.out.println("No maintain record");
			return false;
		} else {
			System.out.println("inside list");
			for (int i = 0; i < list.size(); i++) 
			{
				System.out.println(list.get(i).getMaintainID());
				System.out.println(mId);
				if (list.get(i).getMaintainID() == mId) 
				{
					System.out.println("true");
					res = true;
					break;
				} 
				
			}
		}
		System.out.println("Before returning :"+res);
		return res;

	}

	// Update existing maintenance
	public boolean updateMaintainance(Maintainance maintainances, int uId, int mId) {
		User user = daoImpl.getUser(uId);
		System.out.println("Inside update DAO");
		System.out.println(maintainances);
		List<Maintainance> finalMaintainance;
		finalMaintainance = user.getMaintainace();
		for (int i = 0; i < finalMaintainance.size(); i++) {
			if (finalMaintainance.get(i).getMaintainID() == mId) {
				finalMaintainance.remove(i);
				finalMaintainance.add(i, maintainances);
			}
			System.out.println(finalMaintainance);
			user.setMaintainace(finalMaintainance);
			mongotemplate.save(user);
		}
		return false;
	}
}
