package com.ups.demo.mock;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@ConfigurationProperties(prefix = "instance-id")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class MockInstanceId {
	
	private String hardwareLocation;
	private String hardwareDevice;
	private String dateCode;
	private String sequence;
	private String type;
	private String order;
	private String fileName;
	private String fileHandle;
}
