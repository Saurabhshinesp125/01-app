package in.saurabh;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.saurabh.entity.UserEntity;
import in.saurabh.repository.UserRepository;

@SpringBootApplication
@RestController
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(Application.class, args);
		
		UserRepository repository =(UserRepository) ctx.getBean(UserRepository.class);
		

                int a=10;
                int b=20;


//		UserEntity findUserByEmail = repository.findUserByEmail("sayali97@gmail.com");
//        System.out.println(findUserByEmail);
        
		Object[] data = repository.findUserByAge(26);
		
		
		for(Object obj: data) {
		Object[] data1=(Object[])obj;
		System.out.print(data1[0] + " ");
		System.out.print(data1[1] + " ") ;
		
		}
        
	}

}
