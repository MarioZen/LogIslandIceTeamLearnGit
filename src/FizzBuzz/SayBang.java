package fizzBuzz;

public class SayBang implements SayI {
  public static final String STR_BANG = "Bang";
  
  public String say(int i) {
    return i % 7 == 0 ? STR_BANG : "";
  }
}
