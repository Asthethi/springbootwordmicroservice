package com.springbootmicroservice.api.service;

import java.util.List;

import com.springbootmicroservice.api.exceptions.WordServiceBadRequestException;
import com.springbootmicroservice.api.model.Word;

public interface WordService {

	List<Word> getAllWords();

	Word storeWord(Word word) throws WordServiceBadRequestException;

	List<Word> getWord(int id);

}
