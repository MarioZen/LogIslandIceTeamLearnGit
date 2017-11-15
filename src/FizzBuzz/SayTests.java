package FizzBuzz;

import org.junit.Assert;

public class SayTests {
  private FizzBuzz fizzBuzz;
  
  @org.junit.Before
  public void initTests() {
    fizzBuzz = new FizzBuzz();
  }
  
  @org.junit.Test
  public void sayNumberReturnNumberTest() {
    Assert.assertEquals("1", fizzBuzz.say(1));
    Assert.assertEquals("2", fizzBuzz.say(2));
    Assert.assertEquals("4", fizzBuzz.say(4));
  }
  
  @org.junit.Test
  public void sayMultilpeOf3ReturnFizzTest() {
    Assert.assertEquals("Fizz", fizzBuzz.say(3));
    Assert.assertEquals("Fizz", fizzBuzz.say(9));
    Assert.assertEquals("Fizz", fizzBuzz.say(6));
  }
  
  @org.junit.Test
  public void sayMultipleOf5ReturnBuzzTest() {
    Assert.assertEquals("Buzz", fizzBuzz.say(5));
    Assert.assertEquals("Buzz", fizzBuzz.say(10));
  }
  
  @org.junit.Test
  public void sayMultipleOf3And5ReturnFizzBuzzTest() {
    Assert.assertEquals("FizzBuzz", fizzBuzz.say(15));
  }
  
  @org.junit.Test
  public void sayMultilpeOf7ReturnBangTest() {
    Assert.assertEquals("Bang", fizzBuzz.say(14));
  }
  
  @org.junit.Test
  public void sayMultilpeOf3And5And7ReturnFizzBuzzBangTest() {
    Assert.assertEquals("FizzBuzzBang", fizzBuzz.say(105));
  }
  
  @org.junit.Test
  public void sayMultilpeOf3And5And7And13ReturnFizzBuzzBangGulpTest() {
    Assert.assertEquals("FizzBuzzBangGulp", fizzBuzz.say(1365));
  }
}
