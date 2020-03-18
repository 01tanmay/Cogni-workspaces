package com.ups.demo.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.ups.demo.mock.MockInstanceId;
import com.ups.demo.model.BuildInstance;
import com.ups.demo.model.InstanceId;
import com.ups.demo.model.Supplied;

import lombok.AllArgsConstructor;
import lombok.Builder;

@Service
@AllArgsConstructor
@Builder
public class BuildInstanceService {

	private final MockInstanceId mockInstanceId = new MockInstanceId();

	public BuildInstance buildInstance() {
		return null;

		/*
		 * InstanceId instanceId = ((Object)
		 * InstanceId.builder()).dateCode(Long.valueOf(mockInstanceId.getDateCode()))
		 * .error(null).fileHandle(Long.valueOf(mockInstanceId.getFileHandle()))
		 * .hardwareDevice(Long.valueOf(mockInstanceId.getHardwareDevice()))
		 * .hardwareLocation(mockInstanceId.getHardwareLocation())
		 * .sequence(Long.valueOf(mockInstanceId.getSequence())).order(mockInstanceId.
		 * getOrder())
		 * .type(mockInstanceId.getType()).fileName(mockInstanceId.getFileName()).build(
		 * ); String uuid = UUID.randomUUID().toString(); Supplied supplied =
		 * Supplied.builder().entityTypeName("mockEntity").instanceId(uuid).build();
		 * return
		 * BuildInstance.builder().instanceId(instanceId).supplied(supplied).build();
		 */
	}
}
