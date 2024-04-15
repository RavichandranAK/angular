package com.Angle;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AngleController {
	@Autowired
	AngleRepository angleRepository;
	
	static Logger log=Logger.getLogger(AngleController.class);
	
	
	@PostMapping("/insert")
	public String insert(@RequestBody AngleEntity a) throws Exception {
		if(a.getAge()>18) {
		angleRepository.save(a);
		log.info("Object inserted");
		return "Inserted";
		}
		else {
			log.warn("Exception Occured");
			throw new AgeException("Age less then 18");
		}
	}
	@GetMapping("/findAll")
	public List<AngleEntity> findAll() {
		log.info("Object Retrived");
		return angleRepository.findAll();
	}

}
