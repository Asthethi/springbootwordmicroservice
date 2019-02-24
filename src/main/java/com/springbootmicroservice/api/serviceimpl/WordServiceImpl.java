package com.springbootmicroservice.api.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootmicroservice.api.dao.WordDao;
import com.springbootmicroservice.api.exceptions.WordServiceBadRequestException;
import com.springbootmicroservice.api.model.Word;
import com.springbootmicroservice.api.service.WordService;

@Service
public class WordServiceImpl implements WordService {

	@Autowired
	private WordDao wordDao;
	
	@Override
	public List<Word> getAllWords() {
		List<Word> allWords = wordDao.getAllWords();
		return allWords;
	}

	@Override
	public Word storeWord(Word word) throws WordServiceBadRequestException {
		// TODO Auto-generated method stub
		Word savedWord = wordDao.saveWordObj(word);
		return savedWord;
	}

}
