package lectures;


import java.util.stream.Stream;
import org.junit.Test;

public class Lecture9 {

  @Test
  public void reduce() throws Exception {
    Integer[] integers = {1, 2, 3, 4, 99, 100, 121, 1302, 199};

    Integer i = Stream.of(integers).reduce(0, (a, b) -> a + b);
    System.out.println(i);
    System.out.println();
    Integer sum = Stream.of(integers).reduce(0, Integer::sum);
    System.out.println(sum);

  }


}

