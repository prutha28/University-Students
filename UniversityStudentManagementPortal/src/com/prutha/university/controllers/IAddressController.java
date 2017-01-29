package com.prutha.university.controllers;
import java.util.List;

import com.prutha.university.resources.AddressResource;

public interface IAddressController {

	public AddressResource getAddress( String id);
		
	public List<AddressResource> listAddresses();
			
	public AddressResource updateAddress( String id);
			
	public AddressResource removeAddress( String id);
		
	public String addAddress(AddressResource address);

}
