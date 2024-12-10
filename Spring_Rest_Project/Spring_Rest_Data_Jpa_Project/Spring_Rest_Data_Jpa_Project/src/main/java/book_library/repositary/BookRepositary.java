package book_library.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import book_library.entity.Book;

//@Repository is not required because JpaRepository is already managed
//since bookrepository is inherited from it it also becomes a managed component

@Repository // Marks these class as a repository and it is managed by spring
public interface BookRepositary extends JpaRepository<Book, Integer> {

}
