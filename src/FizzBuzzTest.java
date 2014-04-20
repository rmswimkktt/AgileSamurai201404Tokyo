import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest {

	@Test
	public void _1を渡したら1を返すべき() {
		String actual = new FizzBuzz().convert(1);
		assertThat(actual, is("1"));
	}
	@Test
	public void _2を渡したら2を返すべき() {
		String actual = new FizzBuzz().convert(2);
		assertThat(actual, is("2"));
	}
	@Test
	public void _3を渡したらFizzを返すべき() {
		String actual = new FizzBuzz().convert(3);
		assertThat(actual, is("Fizz"));
	}
	@Test
	public void _6を渡したらFizzを返すべき() {
		String actual = new FizzBuzz().convert(6);
		assertThat(actual, is("Fizz"));
	}
	@Test
	public void _5を渡したらBuzzを返すべき() {
		String actual = new FizzBuzz().convert(5);
		assertThat(actual, is("Buzz"));
	}
	@Test
	public void _15を渡したらFizzBuzzを返すべき(){
		String actual = new FizzBuzz().convert(15);
		assertThat(actual, is("FizzBuzz"));
		
	}

}
