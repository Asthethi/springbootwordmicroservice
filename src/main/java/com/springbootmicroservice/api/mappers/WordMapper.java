package com.springbootmicroservice.api.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.springbootmicroservice.api.model.Word;

public class WordMapper implements RowMapper<Word> {

	@Override
	public Word mapRow(ResultSet rs, int rowNum) throws SQLException {
		Word word = new Word();
		word.setWord(rs.getString("word"));
		word.setMeaning(rs.getString("meaning"));
		word.setId(rs.getInt("id"));
		return word;
	}
	
	

}
