package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.InputEntity;
import com.example.demo.entity.PostReturnEntity;
import com.example.demo.entity.ReturnEntity;

@RestController
@RequestMapping("/bfhl")
public class AppController {

	@GetMapping
	public ResponseEntity<ReturnEntity> getData() {
		return new ResponseEntity<ReturnEntity>(getResponse(), HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<PostReturnEntity> postData(@RequestBody InputEntity input) {
		return new ResponseEntity<PostReturnEntity>(postRequest(input), HttpStatus.OK);
	}

	private PostReturnEntity postRequest(InputEntity input) {
		List<Integer> numbers = new ArrayList<Integer>();
		List<String> alphabets = new ArrayList<String>();
		String highest = "";
		PostReturnEntity pRE = new PostReturnEntity();
		String[] data = input.getData();
		pRE.setIs_Success(true);
		pRE.setUser_id("john_doe_17091999");
		pRE.setEmail("john@xyz.com");
		pRE.setRollNumber("ABCD123");
		for (String inp : data) {
			if (inp.matches("\\d+")) {
				numbers.add(Integer.valueOf(inp));
			}
		}
		for (String inp : data) {
			if (inp.matches("[A-Za-z]")) {
				alphabets.add(inp);
			}
		}
		for (String inp : data) {
			if (inp.matches("[A-Za-z]")) {
				if (highest.isEmpty() || inp.compareTo(highest) > 0) {
					highest = inp;
				}
			}
		}
		pRE.setAlphabets(alphabets.toArray(new String[0]));
		pRE.setNumbers(numbers.toArray(new Integer[0]));
		pRE.setHighest_alphabets(highest);
		return pRE;
	}

	private ReturnEntity getResponse() {
		ReturnEntity r = new ReturnEntity();
		r.setOpertionCode("1");
		return r;
	}
}
