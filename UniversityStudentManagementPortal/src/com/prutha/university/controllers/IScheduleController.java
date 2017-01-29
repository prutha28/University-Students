package com.prutha.university.controllers;

import java.util.List;

import com.prutha.university.resources.ScheduleResource;

public interface IScheduleController {

	public ScheduleResource getSchedule( String scheduleId);
	
	public List<ScheduleResource> listSchedules();
		
	public ScheduleResource updateSchedule( String scheduleId);
		
	public ScheduleResource removeSchedule( String scheduleId);
	
	public String addSchedule(ScheduleResource schedule);
}
