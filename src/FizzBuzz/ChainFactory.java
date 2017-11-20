package FizzBuzz;

import java.util.List;

public class ChainFactory {
  
  public static List<SayI> createChain() {
    List<SayI> chain = new java.util.ArrayList();
    chain.add(new SayFizz());
    chain.add(new SayBuzz());
    chain.add(new SayBang());
    chain.add(new SayGulp());
    return chain;
    //Commit
  }
}
