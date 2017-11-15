package fizzBuzz;

public class SayGulp implements SayI {
  public static final String STR_GULP = "Gulp";
  
  public String say(int i) {
    return i % 13 == 0 ? STR_GULP : "";
  }
}
