package com.demo.spring.jenkins;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
@Slf4j
class SpringJenkinsProjectApplicationTests
{

	Calculator c = new Calculator();


	@Test
	void contextLoads()
	{
		log.info("Test case executing.........");
		log.info("Test case executing second logger statement.........");
		assertEquals(true,true);
	}



	@Test
	void testSum()
	{
		// expected
		int expectedResult = 17;


		// actual
		int actualResult = c.doSum(12, 3, 2);


		assertThat(actualResult).isEqualTo(expectedResult);
	}



	@Test
	void testCompareNums()
	{
		// actual result
		Boolean actualResult = c.compareTwoMuns(3,3);

		assertThat(actualResult).isTrue();


	}


}
