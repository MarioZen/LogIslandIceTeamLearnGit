package FizzBuzz;

public class SayFizz implements SayI {
  public static final String STR_FIZZ = "Fizz";
  
  public String say(int i) {
    return i % 3 == 0 ? STR_FIZZ : "";
  }
}
