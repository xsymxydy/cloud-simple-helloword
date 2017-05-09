package cloud.simple.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class SampleController {
	
	@ResponseBody
	@RequestMapping
	String home(){
		return "hello wrold Sping Boot";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SampleController.class, args);
	}

}
