package com.example.demo.cdi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SomeCdiBusiness {
	
	@Autowired
	SomeCdiDao SomeCdiDao;

	public SomeCdiDao getSomeCdiDao() {
		return SomeCdiDao;
	}

	public void setSomeCdiDao(SomeCdiDao SomeCdiDao) {
		this.SomeCdiDao = SomeCdiDao;
	}
	

}
