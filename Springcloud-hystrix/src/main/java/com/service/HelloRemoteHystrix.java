package com.service;

import org.springframework.stereotype.Component;

//创建回调类

@Component
public class HelloRemoteHystrix implements HelloRemote {

	@Override
	public String hello(String name) {
		return "hello" + name + ", this messge send failed ";
	}

}
