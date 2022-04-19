package com.wildcodschool.myProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class MyProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyProjectApplication.class, args);

		}
		
		@RequestMapping("/")
		@ResponseBody
		public String index(){
			
			return 
			
			"A list of person who played the character of the Doctor <br>" +
			"<ul>" +
			index2() + index3() + index4() + index5() + "</ul>";

	}


	@RequestMapping("/Doctor/1")
	@ResponseBody
		public String index2(){
			return 
			 "Doctor 1 <a href='https://en.wikipedia.org/wiki/William_Hartnell'>William Hartnell</a><br>";
		
			
			
	}

	@RequestMapping("/Doctor/2")
	@ResponseBody
		public String index3(){
			return 			
			 "Doctor 2 <a href='https://en.wikipedia.org/wiki/Patrick_Troughton'>Patrick Troughton</a><br>";
						
	}

	@RequestMapping("/Doctor/3")
	@ResponseBody
		public String index4(){
			return 
			 "Doctor 3 <a href='https://en.wikipedia.org/wiki/Jon_Pertwee'>Jon Pertwee</a><br>";

			
	}

	@RequestMapping("/Doctor/4")
	@ResponseBody
		public String index5(){
			return 
			 "Doctor 4 <a href='https://en.wikipedia.org/wiki/Tom_Baker'>Tom Baker</a><br>";
			
	}
	
}

