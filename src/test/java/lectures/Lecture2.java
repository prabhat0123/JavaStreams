package lectures;

import java.util.List;
import java.util.stream.IntStream;
import org.junit.Test;
import beans.Person;
import mockdata.MockData;

public class Lecture2 {

  @Test
  public void range() throws Exception {

    IntStream.range(0, 10).forEach(System.out::println);
    System.out.println();
    IntStream.rangeClosed(0, 10).forEach(System.out::println);
  }

  @Test
  public void rangeIteratingLists() throws Exception {
    List<Person> people = MockData.getPeople();

    IntStream.range(0, people.size()).forEach(i -> {
      System.out.println(people.get(i));
    });
    // Other way to do this
    System.out.println();
    people.forEach(System.out::println);

  }

  @Test
  public void intStreamIterate() throws Exception {
    IntStream.iterate(0, operand -> operand + 1).filter(number -> number % 2 == 0).limit(20)
        .forEach(System.out::println);
  }
}
