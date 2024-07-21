package com.ivoronline.springboot_database_loadscript_ddlauto.repository;

import com.ivoronline.springboot_database_loadscript_ddlauto.entity.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Integer> { }
