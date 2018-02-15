package com.enwl.stubclient;

import static org.springframework.http.HttpStatus.OK;

import java.util.logging.Logger;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/schneider", consumes = {"application/json", "application/xml"})
public class StubController {

	static final Logger LOG = Logger.getLogger(StubController.class.getName());

	@PostMapping("/assets")
	@ResponseStatus(OK)
	public void assetsReceived(@RequestBody String payload) {
		
		LOG.info("Payload received : " + payload);
	}

}
