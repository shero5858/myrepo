package com.myssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.myssm.service.DeviceService;
@Controller
@RequestMapping(value = "/")  
public class DeviceController {

	@Autowired
	private DeviceService deviceService;
	
	@RequestMapping(value="/list",produces="text/html;charset=UTF-8")
	@ResponseBody
	public String getAllDevice(){
		return deviceService.selectAllDevices();
	}
}
