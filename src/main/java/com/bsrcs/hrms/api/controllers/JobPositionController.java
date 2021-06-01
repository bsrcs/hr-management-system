package com.bsrcs.hrms.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bsrcs.hrms.business.abstracts.JobPositionService;
import com.bsrcs.hrms.core.utilities.results.DataResult;
import com.bsrcs.hrms.entities.concretes.JobPosition;

@RestController
@RequestMapping(name = "jobtitle/")
public class JobPositionController {
	
	private final JobPositionService jobPositionService;
	
	public JobPositionController(JobPositionService jobPositionService) {
		this.jobPositionService = jobPositionService;
	}
	
	@GetMapping(name = "getAllJobTitles")
	DataResult<List<JobPosition>> getAllJobPositons() {
		return jobPositionService.getAllJobPositons();
	}
	
}