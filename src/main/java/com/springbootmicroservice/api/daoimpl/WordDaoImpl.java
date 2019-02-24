package com.springbootmicroservice.api.daoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.springbootmicroservice.api.constants.WordMicroserviceConstants;
import com.springbootmicroservice.api.dao.WordDao;
import com.springbootmicroservice.api.exceptions.WordServiceBadRequestException;
import com.springbootmicroservice.api.mappers.WordMapper;
import com.springbootmicroservice.api.model.Word;

/**
 * @author AST
 * Class Interacts with Database
 */
@Repository
public class WordDaoImpl implements WordDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Word> getAllWords() {

		List<Word> allWords = jdbcTemplate.query(WordMicroserviceConstants.ALL_WORDS_QUERY, new WordMapper());
		return allWords;
	}//adfds

	@Override
	public Word saveWordObj(Word word) throws WordServiceBadRequestException {

		if(word.getWord()==null || word.getMeaning()==null)
			throw new WordServiceBadRequestException("Word or Meaning cannot be null");
		else {
			try {
				jdbcTemplate.update(WordMicroserviceConstants.INSERT_NEW_WORD,
						new Object[] { word.getWord(), word.getMeaning()});
			} catch (DataAccessException dae) {
				throw new WordServiceBadRequestException(dae.getMessage());
			}
		}

		return word;
	}

	@Override
	public List<Word> getWordById(int id) {
		
		List<Word> wordById = jdbcTemplate.query("SELECT * FROM WORDS WHERE ID = "+id, new WordMapper());
		return wordById;
	}

}
