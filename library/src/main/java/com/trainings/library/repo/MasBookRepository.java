package com.trainings.library.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.trainings.library.repo.entity.MasBook;

public interface MasBookRepository extends JpaRepository<MasBook, Integer>{

	@Query(value = "SELECT b.id,b.title,b.code,b.author_id,b.volume,b.publish_id,a.name as authorName, p.name as publisherName  \r\n" + 
			"FROM mas_book b join mas_author a on b.author_id = a.id join mas_publisher p on b.publish_id = p.id;",nativeQuery = true)
	List findAllBookDetails();

}
