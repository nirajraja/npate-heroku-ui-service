
package com.npate.heroku.service.controller;

import java.util.Random;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class APIController {

  @RequestMapping("/creditscore")
  @ResponseBody
  public String creditscore() {
    int creditScoreMin = 500;
    int creditScoreMax = 900;

    Random rand = new Random();
    int randomCreditScore = rand.nextInt(creditScoreMin, creditScoreMax);

    return String.format("{ \"credit_score\": \"%d\" }", randomCreditScore);
  }
}