package fizzBuzz;

public class SayBuzz implements SayI {
  public static final String STR_BUZZ = "Buzz";
  
  public String say(int i) {
    return i % 5 == 0 ? STR_BUZZ : "";
  }
}
