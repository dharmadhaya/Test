package com.trainings.library.web.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Book {
	
			private String bookName;		
			private String bookCode;  		
			private int   bookAuthor;		
			private String volume;		
			private int publisher;
			
			private Integer id;
			private String authorName;
			private String publisherName;

}
