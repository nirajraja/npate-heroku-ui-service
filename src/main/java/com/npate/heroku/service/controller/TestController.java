
package com.npate.heroku.service.controller;

import java.util.Random;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.npate.heroku.service.model.TestTableModel;
import com.npate.heroku.service.repository.GuestRepository;

@RestController
@RequestMapping("/api/v1")
public class TestController {
	
	@Autowired
	private GuestRepository repo;

  @RequestMapping("/creditscore")
  @ResponseBody
  public String creditscore() {
    int creditScoreMin = 500;
    int creditScoreMax = 900;

    Random rand = new Random();
    int randomCreditScore = rand.nextInt(creditScoreMin, creditScoreMax);

    return String.format("{ \"credit_score\": \"%d\" }", randomCreditScore);
  }
  
  @GetMapping(path="/all")
  public @ResponseBody Iterable<TestTableModel> getAllUsers() {
    // This returns a JSON or XML with the users
    return repo.findAll();
  }
}