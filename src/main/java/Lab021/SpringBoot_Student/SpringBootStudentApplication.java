package Lab021.SpringBoot_Student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

@SpringBootApplication
@RequestMapping("/")
@RestController
public class SpringBootStudentApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringBootStudentApplication.class, args);
	}

	@GetMapping
	RedirectView home() {
		return new RedirectView("student/msg");
	}
}
