package edu.greenriver.sdev.projectUnderVcs;

import edu.greenriver.sdev.projectUnderVcs.model.Book;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class ProjectUnderVcsApplication {
	public static void main(String[] args) {
		SpringApplication.run(ProjectUnderVcsApplication.class, args);

		Book book = new Book("Andrzej Sapkowski",
				"The Sword of Destiny" ,
				384);

		Book defaultBook = new Book();

		Book builtBook = Book.builder()
				.author("Randal Garret")
				.title("Lord d'Arcy Investigates")
				.pages(229)
				.build();

	}

}
