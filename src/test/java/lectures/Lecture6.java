package lectures;


import java.util.function.Predicate;
import java.util.stream.Stream;
import org.junit.Test;

public class Lecture6 {

  final Predicate<Integer> numbersLessThan10 = n -> n > 5 && n < 10;

  @Test
  public void findAny() throws Exception {
    Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    int i = Stream.of(numbers).filter(numbersLessThan10).findAny().orElse(0);
    System.out.println(i);

  }

  @Test
  public void findFirst() throws Exception {
    Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int i = Stream.of(numbers).filter(numbersLessThan10).findFirst().orElse(0);
    System.out.println(i);
  }
}

