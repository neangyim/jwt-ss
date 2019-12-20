package co.simplon;

import co.simplon.dao.TaskRepository;
import co.simplon.entites.AppRole;
import co.simplon.entites.AppUser;
import co.simplon.entites.Task;
import co.simplon.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class JwtApplication implements CommandLineRunner {
	@Autowired
	private TaskRepository taskRepository;
	@Autowired
	private AccountService accountService;
	public static void main(String[] args) {
		SpringApplication.run(JwtApplication.class, args);

	}
	@Bean
	public BCryptPasswordEncoder getBCPE() {
		return new BCryptPasswordEncoder();
	}

	@Override
	public void run(String... args) throws Exception {
		accountService.saveUser(new AppUser(null,"admin","12345",null));
		accountService.saveUser(new AppUser(null,"user","12345",null));
		accountService.saveRole(new AppRole(null,"ADMIN"));
		accountService.saveRole(new AppRole(null,"USER"));
		accountService.addRoleToUse("admin","ADMIN");
		accountService.addRoleToUse("admin","USER");
		accountService.addRoleToUse("user","USER");



			taskRepository.save(new Task(null, "T1"));
			taskRepository.save(new Task(null, "T2"));
			taskRepository.save(new Task(null, "T3"));
			taskRepository.save(new Task(null, "T4"));
			taskRepository.save(new Task(null, "T5"));

	}
}
