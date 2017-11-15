package FizzBuzz;

import java.util.List;

public class FizzBuzz {
  private List<SayI> chain;
  
  public FizzBuzz() {
    chain = ChainFactory.createChain();
  }
  
  public String say(int i) {
    String result = "";
    
    for (SayI sayI : chain) {
      result = result + sayI.say(i);
    }
    
    return result.isEmpty() ? String.valueOf(i) : result;
  }
}
