package com.free.bot.megabot;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BotApplicationRunner implements ApplicationRunner
 {

	public static void main(String[] args)
	{
		SpringApplication.run(BotApplicationRunner.class, args);
	}

	@Override
	public void run(ApplicationArguments arg0) throws Exception {
		System.out.println("Hello World from Application Runner");
		System.out.println("test commit");
	}



}
