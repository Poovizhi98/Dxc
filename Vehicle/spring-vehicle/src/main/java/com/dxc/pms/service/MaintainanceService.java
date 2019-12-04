package com.dxc.pms.service;

import java.util.List;

import com.dxc.pms.model.Maintainance;

public interface MaintainanceService {

	public Maintainance addMaintainance(int uId,Maintainance maintainance);
	public List<Maintainance> getMaintainance(int uId, int mId);
	public List<Maintainance> getAllMaintainance(int uId);
	public boolean deleteMaintainance(int uId,int rId);
	public boolean updateMaintainance(Maintainance maintainance,int uId, int mId);
	public boolean isMaintainanceExists(int uId, int mId);

}
