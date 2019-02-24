package com.springbootmicroservice.api.constants;

public final class WordMicroserviceConstants {
	
	public static final String ALL_WORDS_QUERY = "SELECT * FROM WORDS";
	public static final String INSERT_NEW_WORD = "INSERT INTO WORDS (word , meaning) VALUES (? , ?)";
}
