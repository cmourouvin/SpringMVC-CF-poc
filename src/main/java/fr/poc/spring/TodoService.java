package fr.poc.spring;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoService {

	public List<Todo> getTodos() {
		List<Todo> todos = new ArrayList<Todo>();
		Todo todo1 = new Todo("Mettre en place la connexion avec MongoDB ou Redis");
		Todo todo2 = new Todo("Essayer RabbitMQ");
		
		todos.add(todo1);
		todos.add(todo2);
		
		return todos;
	}
}
