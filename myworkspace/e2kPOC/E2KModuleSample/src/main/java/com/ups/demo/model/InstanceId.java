
package com.ups.demo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class InstanceId {

	private String hardwareLocation;
	private long hardwareDevice;
	private long dateCode;
	private long sequence;
	private final String type = "";
	private String order;
	private String fileName;
	private long fileHandle;
	private String error;

	public static Object builder() {
		// TODO Auto-generated method stub
		return null;
	}

}
