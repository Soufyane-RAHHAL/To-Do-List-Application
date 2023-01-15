package soufyane.me.toDoListApplication;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import soufyane.me.toDoListApplication.model.Item;
import soufyane.me.toDoListApplication.model.Priority;
import soufyane.me.toDoListApplication.repo.ItemRepository;

@SpringBootApplication
public class ToDoListApplication {

	public static void main(String[] args) {
		SpringApplication.run(ToDoListApplication.class, args);
	}
	@Bean
	CommandLineRunner runner(ItemRepository repository){
		return args -> {
			Item item = new Item(
					"first Task",
					"this is the description of the first task",
					"20/01/2022",
					Priority.LOW
			);
			repository.insert(item);
		};
	}

}
