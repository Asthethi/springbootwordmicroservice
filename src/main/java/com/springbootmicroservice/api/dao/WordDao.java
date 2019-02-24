package com.springbootmicroservice.api.dao;

import java.util.List;

import com.springbootmicroservice.api.exceptions.WordServiceBadRequestException;
import com.springbootmicroservice.api.model.Word;

public interface WordDao {

	List<Word> getAllWords();

	Word saveWordObj(Word word) throws WordServiceBadRequestException;

}
