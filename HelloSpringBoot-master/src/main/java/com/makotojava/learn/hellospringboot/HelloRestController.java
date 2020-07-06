package com.makotojava.learn.hellospringboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {

	@RequestMapping("/hola")
          public String hello() {
            return "Hello. All your base are belong to us.";
          }
        }
