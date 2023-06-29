// Modified from https://github.com/paulnguyen/gitpod/blob/main/spring-mysql/src/main/java/com/example/springmysql/UserRepository.java

package com.example.springcashier;

import org.springframework.data.repository.CrudRepository;

public interface DrinkRepository extends CrudRepository<Drink, Integer> {

}