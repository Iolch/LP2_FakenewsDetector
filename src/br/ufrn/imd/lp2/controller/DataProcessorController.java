package br.ufrn.imd.lp2.controller;

public class DataProcessorController {
	private final int MIN_CHARACTERS;
	DataProcessorController(int min_char)
	{
		this.MIN_CHARACTERS = min_char;
	}
	
	/**
	 *	Fun��o respons�vel por remover as palavras que tem menos caracteres que MIN_CHARACTERS
	 * @param quote cont�m o texto
	 * @return string filtrada
	 **/
	public String removeUnqualifiedWords(String quote) 
	{
		String [] splitedQuote = quote.split(" ");
		for(String word : splitedQuote) 
		{
			if(word.length() < this.MIN_CHARACTERS) 
			{
				//remove word
			}
		}
		return quote;
	}
	
	/**
	 *	Fun��o respons�vel por remover os caracteres especiais, como (&$#@*) e tamb�m os acentos.
	 * @param quote cont�m o texto
	 * @return string sem caracteres especiais e sem acentos
	 **/
	public String removeSpecialCharacters(String quote) 
	{
		return quote;
	}
	
	/**
	 *	Fun��o respons�vel por remover palavras repitidas
	 * @param quote cont�m o texto
	 * @return string em que cada palavra aparece uma �nica vez
	 **/
	public String removeRepeatedWords(String quote) 
	{
		return quote;
	}
	
	/**
	 *	Fun��o respons�vel por estabelecer a ordem alfab�tica nas palavras dentro da string.
	 * @param quote cont�m o texto
	 * @return string ordenada
	 **/
	public String alphabeticalSort(String quote) 
	{
		return quote;
	}
	
	/**
	 *	Fun��o respons�vel por gerar um hash �nico para cada string
	 * @param quote cont�m o texto
	 * @return string hash referente ao quote
	 **/
	public String generateHash(String quote) 
	{
		return "";
	}
}
