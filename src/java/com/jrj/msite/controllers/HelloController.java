package com.jrj.msite.controllers;

import java.util.Date;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import net.paoding.rose.web.Invocation;
public class HelloController {

	private  Log log=LogFactory.getLog(this.getClass());
	public String world(Invocation inv) {
		log.info("piao guo .....");
		inv.addModel("now", new Date());
		return "@"+"{test:123}";
	}
}
