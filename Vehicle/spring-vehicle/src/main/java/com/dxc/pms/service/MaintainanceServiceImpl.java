package com.dxc.pms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.pms.dao.MaintainanceDaoImpl;

import com.dxc.pms.model.Maintainance;

@Service
public class MaintainanceServiceImpl implements MaintainanceService {
	@Autowired
	MaintainanceDaoImpl dao;
	
	@Override
	public Maintainance addMaintainance( int uId,Maintainance maintainance) {
		// TODO Auto-generated method stub
		System.out.println("Coming inside Maintainance service");
		dao.addMaintainance(uId,maintainance);
		
		return null;
	}


	@Override
	public List<Maintainance> getMaintainance(int uId, int mId) {
		// TODO Auto-generated method stub
		return dao.getMaintainance(uId, mId);
		
	}

	@Override
	public List<Maintainance> getAllMaintainance(int uId){
		
		return dao.getAllMaintainance(uId);
	}
	
	public boolean deleteMaintainance(int uId,int mId){
		dao.deleteMaintainance(uId, mId);
		return true;
		
	}


	@Override
	public boolean updateMaintainance(Maintainance maintainance,int uId, int mId) {
		// TODO Auto-generated method stub
		dao.updateMaintainance(maintainance, uId, mId);
		return false;
	}


	@Override
	public boolean isMaintainanceExists(int uId, int mId) {
		// TODO Auto-generated method stub
		boolean res=dao.isMaintainanceExists(uId, mId);
		return res;
	}

}
