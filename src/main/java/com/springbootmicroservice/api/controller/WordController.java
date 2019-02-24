package com.springbootmicroservice.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springbootmicroservice.api.exceptions.WordServiceBadRequestException;
import com.springbootmicroservice.api.model.Word;
import com.springbootmicroservice.api.service.WordService;

/**
 * @author AST
 *
 */
@RestController
@RequestMapping(value = "/word-service")
public class WordController {

	@Autowired
	private WordService wordService;

	@RequestMapping(value = "/words", method = RequestMethod.GET)
	public ResponseEntity<List<Word>> getAllWords() {
		return new ResponseEntity<List<Word>>(wordService.getAllWords(), HttpStatus.OK);
	}

	@RequestMapping(value = "/words", method = RequestMethod.POST)
	public ResponseEntity<Word> saveWord(@RequestBody Word word) throws WordServiceBadRequestException {
		Word savedWord = wordService.storeWord(word);
		return new ResponseEntity<Word>(savedWord, HttpStatus.CREATED);

	}

	@RequestMapping(value = "/word/{id}", method = RequestMethod.GET)
	public ResponseEntity<List<Word>> retrieveWord(@PathVariable final int id) {
		return new ResponseEntity<List<Word>>(wordService.getWord(id), HttpStatus.OK);

	}
}
