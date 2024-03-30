package guru.springframwork.sdjpaintro.jpaSlicesTest;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ActiveProfiles;

import guru.springframwork.sdjpaintro.domain.Book;
import guru.springframwork.sdjpaintro.repositories.BookRepository;

@ActiveProfiles("local")
@DataJpaTest
@ComponentScan(basePackages = { "guru.springframwork.sdjpaintro.bootstrap" })
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class MySqlIntegrationTest {

	@Autowired
	BookRepository bookRepository;

	@Test
	public void countTest() {
		long Beforecount = bookRepository.count();
		assertThat(Beforecount).isEqualTo(2);

		bookRepository.save(new Book("jan", "wwrg1234", "subham"));

	}
}
