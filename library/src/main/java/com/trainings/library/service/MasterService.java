package com.trainings.library.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trainings.library.repo.AdminUsersRepository;
import com.trainings.library.repo.MasAuthorRepository;
import com.trainings.library.repo.MasBookRepository;
import com.trainings.library.repo.MasPublisherRepository;
import com.trainings.library.repo.entity.AdminUser;
import com.trainings.library.repo.entity.MasAuthor;
import com.trainings.library.repo.entity.MasBook;
import com.trainings.library.repo.entity.MasPublisher;
import com.trainings.library.web.model.Book;

import springfox.documentation.swagger2.mappers.ModelMapper;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class MasterService {

	@Autowired
	MasAuthorRepository masAuthorRepository;
	@Autowired
	AdminUsersRepository adminUsersRepository;
	@Autowired
	MasPublisherRepository masPublisherRepository;
	@Autowired
	MasBookRepository masBookRepository;

	public void addAuthorName(String authName,String userName) {
		MasAuthor masAuthor = new MasAuthor();
		masAuthor.setName(authName);
		masAuthor.setIsBlocked(0);
		masAuthor.setEntDate(new Date());
		AdminUser adminUser = adminUsersRepository.findByUserName(userName);
		masAuthor.setUid(adminUser.getId());
		masAuthorRepository.save(masAuthor);
	}

	public void addPublisherName(String publishName, String userName) {
		MasPublisher masPublisher = new MasPublisher();
		masPublisher.setName(publishName);
		masPublisher.setIsBlocked(0);
		masPublisher.setEntDate(new Date());
		AdminUser adminUser = adminUsersRepository.findByUserName(userName);
		masPublisher.setUid(adminUser.getId());
		masPublisherRepository.save(masPublisher);
		
	}

	public List getAuthorlist() {
		return masAuthorRepository.findAll();
	}

	public MasAuthor getAuthorDetails(Integer authorId) {

		return masAuthorRepository.getOne(authorId);
	}
	
	public List getPublisherlist() {

		return masPublisherRepository.findAll();
	}
	

	public MasPublisher getPublisherDetails(Integer publishId) {
		
		return masPublisherRepository.getOne(publishId);
	}

	public void addBookDetails(Book book) {
		MasBook masBook = new MasBook();
		masBook.setTitle(book.getBookName());
		masBook.setCode(book.getBookCode());
		masBook.setVolume(book.getVolume());
		masBook.setAuthorId(book.getBookAuthor());
		masBook.setPublishId(book.getPublisher());
		masBook.setUid(1);
		masBook.setEntDateTime(new Date());
		masBookRepository.save(masBook);
	}

	public List getBookDetails() {
		
		List<?> bookList = masBookRepository.findAllBookDetails();
		List<Book> bookLst = new ArrayList<Book>();
		for (int i = 0; i < bookList.size(); i++) {
			Object[] ob = (Object[]) bookList.get(i);
			Book book = new Book();
			book.setId(Integer.parseInt(ob[0].toString()));
			book.setBookName(ob[1].toString());
			book.setBookCode(ob[2].toString());
			book.setBookAuthor(Integer.parseInt(ob[3].toString()));
			book.setVolume(ob[4].toString());
			book.setPublisher(Integer.parseInt(ob[5].toString()));
			book.setAuthorName(ob[6].toString());
			book.setPublisherName(ob[7].toString());
			bookLst.add(book);
		};
		return bookLst; 
	}

	public MasBook getBookById(Integer bookId) {
		
		return masBookRepository.getOne(bookId);
	}

	
}
