package io.springbootstarter.hello;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	public String sayHi() {
		return"hi";
	}

}
