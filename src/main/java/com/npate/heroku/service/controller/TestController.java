
package com.npate.heroku.service.controller;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Random;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.npate.heroku.service.model.GuestRsvpModel;
import com.npate.heroku.service.model.GuestShortRsvpModel;
import com.npate.heroku.service.model.TestTableModel;
import com.npate.heroku.service.repository.GuestRepository;
import com.npate.heroku.service.repository.RsvpRepository;

@CrossOrigin(origins = "https://krimasbabyshower-724b3835c709.herokuapp.com", allowedHeaders = "*")
@RestController
@RequestMapping("/api/v1")
public class TestController {

	@Autowired
	private GuestRepository repo;

	@Autowired
	private RsvpRepository rsvpRepo;

	@Value("${valid.username}")
	private String username;

	@Value("${valid.pwd}")
	private String pwd;

	@RequestMapping("/creditscore")
	@ResponseBody
	public String creditscore() {
		int creditScoreMin = 500;
		int creditScoreMax = 900;

		Random rand = new Random();
		int randomCreditScore = rand.nextInt(creditScoreMin, creditScoreMax);

		return String.format("{ \"credit_score\": \"%d\" }", randomCreditScore);
	}

	@GetMapping(path = "/all")
	public @ResponseBody Iterable<TestTableModel> getAllUsers() {
		// This returns a JSON or XML with the users
		return repo.findAll();
	}

	@PostMapping(path = "/add") // Map ONLY POST Requests
	public @ResponseBody String addNewUser(@RequestParam String name, @RequestParam Integer count) {
		// @ResponseBody means the returned String is the response, not a view name
		// @RequestParam means it is a parameter from the GET or POST request

		TestTableModel ttm = new TestTableModel();
		ttm.setTt_guest_count(count);
		ttm.setTt_name(name);
		repo.save(ttm);
		return "Saved";
	}

	@GetMapping(path = "/allrsvp")
	public @ResponseBody Iterable<GuestShortRsvpModel> getAllRsvp() {
		// This returns a JSON or XML with the users
		return rsvpRepo.findAll();
	}

	@PostMapping(path = "/addrsvp") // Map ONLY POST Requests
	public @ResponseBody String addNewRsvp(@RequestBody GuestShortRsvpModel rsvp) {
		// @ResponseBody means the returned String is the response, not a view name

		// @RequestParam means it is a parameter from the GET or POST request

		try {
			System.out.print(rsvp);
			rsvpRepo.save(rsvp);
			return "{\"status\":\"Saved\"}";
		} catch (Exception e) {

			System.out.print(e);
			return "Failed to save rsvp";
		}

	}

	@PostMapping(path = "qw/{codedUn}/{codedPw}/asd") // Map ONLY POST Requests
	public @ResponseBody String validate(@PathVariable String codedUn, @PathVariable String codedPw) {
		try {

			return "{\"valid\":" + validateInfo(codedUn, codedPw) +"}";
		} catch (Exception e) {

			System.out.print(e);
			return "Failed to save rsvp";
		}

	}

	private boolean validateInfo(String receivedUn, String receivedPw) {
		boolean validInfo = false;
		try {
			byte[] bytesReceivedUn = receivedUn.getBytes("ASCII");
			byte[] bytesReceivedPw = receivedPw.getBytes("ASCII");
			byte[] bytesUserName = username.getBytes("ASCII");
			byte[] bytesUserPw = pwd.getBytes("ASCII");

			byte[] decodedReceivedUn = Base64.getDecoder().decode(bytesReceivedUn);
			byte[] decodedReceivedPw = Base64.getDecoder().decode(bytesReceivedPw);
			byte[] decodedValidUn = Base64.getDecoder().decode(bytesUserName);
			byte[] decodedValidPw = Base64.getDecoder().decode(bytesUserPw);

			String checkUn = new String(decodedReceivedUn, StandardCharsets.US_ASCII);
			String checkPw = new String(decodedReceivedPw, StandardCharsets.US_ASCII);
			String validUn = new String(decodedValidUn, StandardCharsets.US_ASCII);
			String validPw = new String(decodedValidPw, StandardCharsets.US_ASCII);

			if (validUn.equalsIgnoreCase(checkUn) && validPw.equalsIgnoreCase(checkPw)) {
				validInfo = true;
			}
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return validInfo;
	}
}
