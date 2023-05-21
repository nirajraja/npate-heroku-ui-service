package com.npate.heroku.service.repository;

import org.springframework.data.repository.CrudRepository;

import com.npate.heroku.service.model.TestTableModel;

public interface GuestRepository extends CrudRepository<TestTableModel, Long>{

}
