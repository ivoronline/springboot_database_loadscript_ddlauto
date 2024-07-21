package com.ivoronline.springboot_database_loadscript_ddlauto.runner;

import com.ivoronline.springboot_database_loadscript_ddlauto.entity.Person;
import com.ivoronline.springboot_database_loadscript_ddlauto.repository.PersonRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class InsertRecords implements CommandLineRunner {

  //PROPERTIES
  @Autowired
  PersonRepository authorRepository;

  //=========================================================================================================
  // INSERT RECORDS
  //=========================================================================================================
  @Override
  @Transactional
  public void run(String... args) {
    authorRepository.save(new Person(0, "CommandLineRunner 1" , 10));
    authorRepository.save(new Person(0, "CommandLineRunner 2" , 20));
  }

}

