package lectures;


import java.math.BigDecimal;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import org.junit.Test;
import beans.Car;
import mockdata.MockData;

public class Lecture7 {

  @Test
  public void count() throws Exception {
    Long l = MockData.getPeople().stream()
        .filter(person -> person.getGender().equalsIgnoreCase("female")).count();
    System.out.println("Count : " + l);

  }

  @Test
  public void min() throws Exception {
    // min price of car of color yellow

    List<Car> cars = MockData.getCars();
    /*
     * Car c = cars.stream().filter(car -> car.getColor().equalsIgnoreCase("Yellow")) .min((car1,
     * car2) -> car1.getPrice().compareTo(car2.getPrice())).get(); System.out.println(c);
     */

    Double min_price = cars.stream().filter(car -> car.getColor().equalsIgnoreCase("Yellow"))
        .mapToDouble(Car::getPrice).min().getAsDouble();

    System.out.println("min: " + min_price);



  }

  @Test
  public void max() throws Exception {
    Double max_price =
        MockData.getCars().stream().filter(car -> car.getColor().equalsIgnoreCase("Yellow"))
            .mapToDouble(Car::getPrice).max().getAsDouble();
    System.out.println("max: " + max_price);
  }


  @Test
  public void average() throws Exception {
    List<Car> cars = MockData.getCars();

    Double average = cars.stream().mapToDouble(Car::getPrice).average().orElse(0);
    System.out.println("average: " + average);

  }

  @Test
  public void sum() throws Exception {
    List<Car> cars = MockData.getCars();
    Double sum_d = cars.stream().mapToDouble(Car::getPrice).sum();

    BigDecimal sum = BigDecimal.valueOf(sum_d);

    System.out.println("Sum: " + sum);


  }

  @Test
  public void statistics() throws Exception {
    List<Car> cars = MockData.getCars();
    DoubleSummaryStatistics stats =
        cars.parallelStream().mapToDouble(Car::getPrice).summaryStatistics();

    System.out.println("Avarage : " + stats.getAverage());
    System.out.println("Min : " + stats.getMin());
    System.out.println("Max : " + stats.getMax());
    System.out.println("Count : " + stats.getCount());
    System.out.println("Sum : " + BigDecimal.valueOf(stats.getSum()));



  }

}
