package com.ups.demo.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ups.demo.model.BuildInstance;
import com.ups.demo.service.BuildInstanceService;

import lombok.AllArgsConstructor;
import lombok.Data;

@RestController
@RequestMapping("/api/e2k")
@AllArgsConstructor
@Data
public class E2KController {

	private final BuildInstanceService buildInstanceService;

	@GetMapping("/instance-id")
	public BuildInstance getInstanceId() {
		return new BuildInstance();
	}

	@PostMapping("/instance-id")
	public BuildInstance buildInstance(BuildInstance buildInstance) {
		return buildInstanceService.buildInstance();
	}
}
