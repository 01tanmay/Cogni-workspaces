package com.luv2code.springdemo.rest;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CustomerErrorResponse {

	private int status;
	private String message;
	private long timeStamp;

}
