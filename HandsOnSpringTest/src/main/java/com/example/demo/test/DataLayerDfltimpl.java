package com.example.demo.test;


import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.demo.data.DataLayer;

import java.util.Date;


@Service
//@Qualifier("DefaultFormat")
@Primary
public class DataLayerDfltimpl implements DataLayer {

	@Override
	public String formatDate(String strFormat, String strtmZn) {
		System.out.println("Inside the format Date method1");
		TimeZone.setDefault(TimeZone.getTimeZone("GMT"));
		Calendar clDnr = Calendar.getInstance();
		Date dt = clDnr.getTime();
		SimpleDateFormat smplDtfrmt = new SimpleDateFormat(strFormat);
		return smplDtfrmt.format(dt);

	}
}
