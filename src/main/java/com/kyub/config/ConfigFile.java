package com.kyub.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

@Configuration
@Data
public class ConfigFile {
	@Value("${url.server.logs}")
	private String urlLogs;
}
