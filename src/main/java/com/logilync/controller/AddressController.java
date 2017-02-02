package com.logilync.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.logilync.domain.Address;
import com.logilync.repository.AddressRepo;

@Controller
public class AddressController {
	@Autowired
	AddressRepo addressRepo;
	
	@RequestMapping(value="/createAddress", method=RequestMethod.GET)
	public String showCreateAddress(){
		return "createAddress";
	}
	
	@RequestMapping(value="/saveAddress", method=RequestMethod.POST)
	public String saveCreateAddress(Address address, Model model){
		address=addressRepo.save(address);
		model.addAttribute("address",address);
		return "address";
	}
	
}
