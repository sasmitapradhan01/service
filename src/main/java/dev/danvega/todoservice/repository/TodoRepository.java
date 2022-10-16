package dev.danvega.todoservice.repository;

import dev.danvega.todoservice.model.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo,Integer> {
}
