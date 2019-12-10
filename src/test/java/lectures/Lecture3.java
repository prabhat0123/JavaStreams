package lectures;

import java.util.List;
import org.junit.Test;
import com.google.common.collect.ImmutableList;

public class Lecture3 {

  @Test
  public void min() throws Exception {
    final List<Integer> numbers = ImmutableList.of(1, 2, 3, 100, 23, 93, 99);

    Integer minNum = numbers.stream().min((i1, i2) -> i1.compareTo(i2)).get();
    System.out.println("min number " + minNum);
  }

  @Test
  public void max() throws Exception {
    final List<Integer> numbers = ImmutableList.of(1, 2, 3, 100, 23, 93, 99);
    Integer maxNum = numbers.stream().max((i1, i2) -> i1.compareTo(i2)).get();
    System.out.println("max number " + maxNum);
  }
}
