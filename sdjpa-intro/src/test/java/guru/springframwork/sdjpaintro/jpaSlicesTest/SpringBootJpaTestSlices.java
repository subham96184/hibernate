package guru.springframwork.sdjpaintro.jpaSlicesTest;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.annotation.Commit;

import guru.springframwork.sdjpaintro.domain.Book;
import guru.springframwork.sdjpaintro.repositories.BookRepository;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@DataJpaTest
@ComponentScan(basePackages = {"guru.springframwork.sdjpaintro.bootstrap"} )
public class SpringBootJpaTestSlices {

	@Autowired
	BookRepository bookRepository;

	@Commit
	@Order(1)
	@Test
	public void countTest() {
		long Beforecount = bookRepository.count();
		assertThat(Beforecount).isEqualTo(2);

		bookRepository.save(new Book("jan", "wwrg1234", "subham"));

		long AfterCount = bookRepository.count();
		assertThat(Beforecount).isLessThan(AfterCount);

	}

	@Order(2)
	@Test
	public void countTestJpaSliceOrder() {

		long AfterCount = bookRepository.count();
		assertThat(AfterCount).isEqualTo(1);

	}
	
}
