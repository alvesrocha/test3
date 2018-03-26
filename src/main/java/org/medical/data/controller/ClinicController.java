package org.medical.data.controller;

import java.util.ArrayList;
import java.util.List;

import org.medical.data.domain.source.Clinic;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class ClinicController {

	
	@RequestMapping(value = "/clinic", method = RequestMethod.POST)
	@ResponseBody
	public Clinic register(@RequestBody Clinic clinic) {
		return clinic;
	}
	
	@RequestMapping(value = "/clinics", method = RequestMethod.GET)
	@ResponseBody
	public List<Clinic> getClinicByFilter(@RequestParam("filter") String filter) {
		return new ArrayList<>();
	}
}
