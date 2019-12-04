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

import com.dxc.pms.model.Dealer;
import com.dxc.pms.service.DealerService;
import com.dxc.pms.service.UserService;

@RestController
@RequestMapping("user")
@CrossOrigin(origins= {"http://localhost:3000","http://localhost:4200"})
public class Controller_Dealer {
	
	@Autowired
	UserService userService;

	@Autowired
	DealerService dealerService;
	
	@GetMapping("/{userId}/dealer/{dealerId}")
	public ResponseEntity<Dealer> getDealer(@PathVariable("userId")int userId,@PathVariable("dealerId")int dealerId) {
		System.out.println("Get Dealer called "+dealerId);
		Dealer dealer=new Dealer();
		if(dealerService.isDealerExists(userId, dealerId))
		{
		dealer=dealerService.getDealer(userId, dealerId);
		return new ResponseEntity<Dealer>(dealer,HttpStatus.OK);
		}
		else {
			return new ResponseEntity<Dealer>(dealer,HttpStatus.NO_CONTENT);
		}
	}
 
	@GetMapping("/{userId}/dealer")
	public List<Dealer>  getAllDealer(@PathVariable("userId")int userId) {
		System.out.println("Get All Dealers called");
		List<Dealer> alldealer= dealerService.getAllDealer(userId);
		return alldealer;
	}
	
	@GetMapping("/dealer")
	public List<Dealer>  getAllDealer() {
		System.out.println("Get All Dealers called");
		List<Dealer> alldealer= dealerService.getAllDealers();
		return alldealer;
	}
	
	@PostMapping("/{userId}/dealer")
	public ResponseEntity<Dealer> saveDealer(@PathVariable("userId")int userId,@RequestBody Dealer dealer) {
		System.out.println("Saving Dealer called");
		if(dealerService.isDealerExists(userId, dealer.getDealerId()))
		{
			return new ResponseEntity<Dealer>(HttpStatus.CONFLICT);
		}
		else{
			dealerService.addDealer(userId, dealer);
			return new ResponseEntity<Dealer>(HttpStatus.CREATED);
		 
		}
	}
	
	//Deleting reviews
	@DeleteMapping("{userId}/dealer/{dealerId}")
	public ResponseEntity<Dealer> deleteDealer(@PathVariable("userId")int userId,@PathVariable("dealerId")int dealerId) {
		if(dealerService.isDealerExists(userId, dealerId))
		{
			dealerService.deleteDealer(userId, dealerId);
		return new ResponseEntity<Dealer>(HttpStatus.OK);
		}
		else {
			return new ResponseEntity<Dealer>(HttpStatus.NOT_FOUND);
		}
	}
	
	//updating reviews
	@PutMapping("/{userId}/dealer")
	public ResponseEntity<Dealer> updateDealer(@PathVariable("userId")int userId,@RequestBody Dealer dealer) {
		System.out.println("Updating dealers called");
		if(dealerService.isDealerExists( userId,dealer.getDealerId()))
		{System.out.println("passed the test");
			dealerService.updateDealer(userId,dealer );
			return new ResponseEntity<Dealer>(HttpStatus.OK);
		}
		else {
			return new ResponseEntity<Dealer>(HttpStatus.NOT_FOUND);
		}
	}
	
}
