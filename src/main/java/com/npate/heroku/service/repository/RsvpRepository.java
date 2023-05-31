package com.npate.heroku.service.repository;

import org.springframework.data.repository.CrudRepository;

import com.npate.heroku.service.model.GuestShortRsvpModel;

public interface RsvpRepository extends CrudRepository<GuestShortRsvpModel, Long>{

}
