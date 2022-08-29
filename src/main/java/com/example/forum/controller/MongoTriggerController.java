
package com.example.forum.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

;

@RestController
@RequestMapping(MongoTriggerController.TRIGGER_API_ENDPOINT)
public class MongoTriggerController {



	public static final String TRIGGER_API_ENDPOINT = "forum/v1";
	public static final String POST_API = "/mongoTrigger";
	

	

	@PostMapping(POST_API)
	public  String handleMongoTrigger(@RequestBody Object obj) {

		
		return "mongo trigger hit" ;

	}

	

}