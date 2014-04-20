import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest {

	@Test
	public void _1を渡したら1を返すべき() {
		FizzBuzz sut = new FizzBuzz();
		assertThat(sut.convert(1), is("1"));
	}
	@Test
	public void _2を渡したら2を返すべき() {
		FizzBuzz sut = new FizzBuzz();
		assertThat(sut.convert(2), is("2"));
	}
	@Test
	public void _3を渡したらFizzを返すべき() {
		FizzBuzz sut = new FizzBuzz();
		assertThat(sut.convert(3), is("Fizz"));
	}
	@Test
	public void _6を渡したらFizzを返すべき() {
		FizzBuzz sut = new FizzBuzz();
		assertThat(sut.convert(6), is("Fizz"));
	}
	@Test
	public void _5を渡したらBuzzを返すべき() {
		FizzBuzz sut = new FizzBuzz();
		assertThat(sut.convert(5), is("Buzz"));
	}

}
