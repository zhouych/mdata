package com.zyc.mdata.web;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;

import com.zyc.baselibs.web.BaseController;
import com.zyc.mdata.ApplicationProperties;

public abstract class BaseMdataController extends BaseController {

	@Autowired
	protected ApplicationProperties applicationProperties;

	@Autowired
	protected DiscoveryClient client;
	
	protected void log4jServer(Logger logger, Level level) {
		logger.log(level, "server.port=" + applicationProperties.getServerPort() + "; server.servlet.context-path=" + applicationProperties.getServerServletContextPath());
	}
}
