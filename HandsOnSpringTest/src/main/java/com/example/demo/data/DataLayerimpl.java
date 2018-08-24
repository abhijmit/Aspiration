package com.example.demo.data;

import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Date;

@Qualifier("Format")
@Service
public class DataLayerimpl implements DataLayer {

	@Override
	public String formatDate(String strFormat, String strtmZn) {
		System.out.println("Inside the format Date method");
		TimeZone.setDefault(TimeZone.getTimeZone(strtmZn));
		Calendar clDnr = Calendar.getInstance();
		Date dt = clDnr.getTime();
		SimpleDateFormat smplDtfrmt = new SimpleDateFormat(strFormat);
		return smplDtfrmt.format(dt);

	}

	
}
