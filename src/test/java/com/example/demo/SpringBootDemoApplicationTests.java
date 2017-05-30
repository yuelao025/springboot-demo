package com.example.demo;

import com.example.demo.controller.TestController;
import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootDemoApplicationTests {

	@Test
	public void contextLoads() {

//		Assert.assertEquals("demo!",new TestController().demo());
	}

	@Test
	public void testDemo(){
		Assert.assertEquals("demo!",new TestController().demo());
	}

}