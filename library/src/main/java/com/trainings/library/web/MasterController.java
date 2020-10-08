package com.trainings.library.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.trainings.library.repo.entity.MasAuthor;
import com.trainings.library.repo.entity.MasBook;
import com.trainings.library.repo.entity.MasPublisher;
import com.trainings.library.service.MasterService;
import com.trainings.library.service.UserService;
import com.trainings.library.web.model.Book;

@RestController
@RequestMapping("/master")
public class MasterController {
    @Autowired
    MasterService masterservice;
    @Autowired
    UserService userservice;


    @PostMapping("/addAuthor")
    public String addAuthor(@RequestParam String authName, @RequestHeader("Authorization") String userName) {
        masterservice.addAuthorName(authName,userName);
        return "successfully added";
    }
    
    @PostMapping("/addPublisher")
    public String addPublisher(@RequestParam String publishName, @RequestHeader("Authorization") String userName) {
        masterservice.addPublisherName(publishName,userName);
        return "successfully added";
    }
    
    @PostMapping("/addBook")
    public String addBook(@RequestBody Book book) {
    	masterservice.addBookDetails(book);
    	
    	return "successfully added";
    }
    
    @GetMapping("/getAuthor")
    public List getAuthor() {
    	
    	return masterservice.getAuthorlist();
    	
    }
    
    @GetMapping("/getAuthorById")
    public MasAuthor getAuthorById(@RequestParam Integer authorId) {
    	
    	return masterservice.getAuthorDetails(authorId);
    	
    }

    
    @GetMapping("/getPublisher")
    public List getPublisher() {
    	
    	return masterservice.getPublisherlist();
    	
    }
    
    @GetMapping("/getPublisherById")
    public MasPublisher getPublisherById(@RequestParam Integer publishId) {
    	
    	return masterservice.getPublisherDetails(publishId);
    	
    }
    
    @GetMapping("/getBookDetails")
    public List getBookDetails() {
    	
    	return masterservice.getBookDetails();
    	
    }
    
    @GetMapping("/getBookById")
    public MasBook getBookById(@RequestParam Integer bookId) {
    	
    	return masterservice.getBookById(bookId);
    	
    }

}
