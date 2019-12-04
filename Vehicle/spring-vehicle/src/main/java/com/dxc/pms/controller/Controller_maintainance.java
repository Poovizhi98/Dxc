package com.dxc.pms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.pms.model.Maintainance;
import com.dxc.pms.service.MaintainanceService;

@RestController
@RequestMapping("user")
@CrossOrigin(origins= {"http://localhost:3000","https://localhost:4200"})
public class Controller_maintainance {
	@Autowired
	MaintainanceService service;
	@PostMapping("/{userId}/maintainance")
	public ResponseEntity<Maintainance> saveMaintainance(@PathVariable("userId")int uId,@RequestBody Maintainance maintainances) {
		System.out.println("Saving a maintainance record is working");
		System.out.println(maintainances);
		System.out.println(uId);
		System.out.println(maintainances.getMaintainID());
		
		if(service.isMaintainanceExists(uId, maintainances.getMaintainID()))
		{
			return new ResponseEntity<Maintainance>(HttpStatus.CONFLICT);
		}
		else{
			service.addMaintainance(uId,maintainances);
			return new ResponseEntity<Maintainance>(HttpStatus.CREATED);
		}	
}
	
	//Getting maintenance by Id
	@GetMapping("/{userId}/maintainance/{maintainId}")
	public ResponseEntity<List<Maintainance>> getMaintainance(@PathVariable("userId")int uId,@PathVariable("maintainId")int mId){
		if(service.isMaintainanceExists(uId, mId))
		{
			List<Maintainance> list=service.getMaintainance(uId, mId);
			return new ResponseEntity<List<Maintainance>>(list,HttpStatus.OK);
		}
		else {
			return new ResponseEntity<List<Maintainance>>(HttpStatus.NO_CONTENT);
		}
	}
	
	//Get all maintenances
	@GetMapping("/{userId}/maintainance")
	public ResponseEntity<List<Maintainance>> getAllMaintainance(@PathVariable("userId")int uId){
		List<Maintainance> list=service.getAllMaintainance(uId);
		return new ResponseEntity<List<Maintainance>>(list,HttpStatus.OK);
	}
	
	//Delete maintenance by Id
	@DeleteMapping("/{userId}/maintainance/{maintainId}")
	public ResponseEntity<Maintainance> deleteMaintainance(@PathVariable("userId")int uId,@PathVariable("maintainId")int mId){
		if(service.isMaintainanceExists(uId, mId))		{
			service.deleteMaintainance(uId, mId);
			return new ResponseEntity<Maintainance>(HttpStatus.OK);
		}
		else {
			return new ResponseEntity<Maintainance>(HttpStatus.NOT_FOUND);
		}	
	}
	
	//Update maintenance by Id
	@PutMapping("/{userId}/maintainance/{maintainId}")
	public ResponseEntity<Maintainance> updateMaintainance(@RequestBody Maintainance list,@PathVariable("userId")int uId,@PathVariable("maintainId")int mId){
		System.out.println("inside controler");
		System.out.println(list);
		if(service.isMaintainanceExists(uId, mId))
		{
			service.updateMaintainance(list, uId, mId);
			return new ResponseEntity<Maintainance>(HttpStatus.OK);
		}
		else {
			return new ResponseEntity<Maintainance>(HttpStatus.NOT_FOUND);
		}	
	}
	
}
