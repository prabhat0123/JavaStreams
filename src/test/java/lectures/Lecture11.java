package lectures;

import java.util.List;
import java.util.stream.Collectors;
import org.junit.Test;
import com.google.common.collect.ImmutableList;

public class Lecture11 {

  @Test
  public void joiningStrings() throws Exception {
    List<String> names = ImmutableList.of("anna", "john", "marcos", "helena", "yasmin");
    String join = "";
    for (String name : names) {
      join = join + name + ", ";

    }
    System.out.println(join.substring(0, join.length() - 2));

  }

  @Test
  public void joiningStringsWithStream() throws Exception {
    List<String> names = ImmutableList.of("anna", "john", "marcos", "helena", "yasmin");
    String join = names.stream().collect(Collectors.joining(", "));
    System.out.println(join);


  }
}
