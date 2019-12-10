package lectures;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;
import org.junit.Test;
import com.google.common.collect.ImmutableList;
import beans.Person;
import mockdata.MockData;

public class Lecture1 {

  @Test
  public void imperativeApproach() throws IOException {
    List<Person> people = MockData.getPeople();
    // 1. Find people aged less or equal 18
    // 2. Then change implementation to find first 10 people

  }

  @Test
  public void myDeclarativeApproachUsingStreams() throws Exception {
    ImmutableList<Person> people = MockData.getPeople();
    List<Person> p2 =
        people.stream().filter(p -> p.getAge() <= 18).limit(10).collect(Collectors.toList());

    p2.forEach(System.out::println);

  }


  @Test
  public void declarativeApproachUsingStreams() throws Exception {

    MockData.getPeople().stream().filter(p -> p.getAge() <= 18).limit(10)
        .collect(Collectors.toList()).forEach(System.out::println);

  }
}
