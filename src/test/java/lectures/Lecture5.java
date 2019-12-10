package lectures;


import java.util.List;
import java.util.stream.Collectors;
import org.junit.Test;
import com.google.common.collect.ImmutableList;
import beans.Car;
import beans.Person;
import beans.PersonDTO;
import mockdata.MockData;

public class Lecture5 {

  @Test
  public void understandingFilter() throws Exception {
    ImmutableList<Car> cars = MockData.getCars();

    cars.stream().filter(car -> car.getPrice() < 20000).collect(Collectors.toList())
        .forEach(System.out::println);

  }

  @Test
  public void ourFirstMapping() throws Exception {
    // transform from one data type to another
    List<Person> people = MockData.getPeople();


    /*
     * List<PersonDTO> personDtoList = people.stream() .map(person -> new PersonDTO(person.getId(),
     * person.getFirstName(), person.getAge())) .collect(Collectors.toList());
     * personDtoList.forEach(System.out::println);
     */

    List<PersonDTO> personDtoList =
        people.stream().map(PersonDTO::map).collect(Collectors.toList());
    personDtoList.forEach(System.out::println);


  }

  @Test
  public void averageCarPrice() throws Exception {
    // calculate average of car prices
    ImmutableList<Car> cars = MockData.getCars();
    Double avg = cars.stream().mapToDouble(Car::getPrice).average().getAsDouble();
    System.out.println(avg);
  }

  @Test
  public void test() throws Exception {

  }
}


