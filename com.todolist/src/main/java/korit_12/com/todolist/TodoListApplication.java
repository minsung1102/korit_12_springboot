package korit_12.com.todolist;

import korit_12.com.todolist.domain.*;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;

import java.util.Arrays;

@SpringBootApplication
public class TodoListApplication implements CommandLineRunner {
	private static final Logger logger = LoggerFactory.getLogger(TodoListApplication.class);

    public static void main(String[] args) {
		SpringApplication.run(TodoListApplication.class, args);
		logger.info("애플리케이션이 실행됩니다.");
	}

	private final UserRepository userRepository;
	private final TodoRepository todoRepository;

	public TodoListApplication(UserRepository userRepository, TodoRepository todoRepository) {
		this.userRepository = userRepository;
		this.todoRepository = todoRepository;
	}

	@Override
	public void run(String... args) throws Exception {
		User user1 = new User("user","1234");
		userRepository.save(user1);

		todoRepository.save(new Todo("SQL", false, user1));
	}
}
