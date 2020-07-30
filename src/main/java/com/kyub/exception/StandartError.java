package com.kyub.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class StandartError {
	private long timestamp;
	private int status;
	private String error;
	private String message;
	private String path;
}
