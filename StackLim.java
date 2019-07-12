import java.util.*;

public class StackLim {
  private static final int dimStack = 50;
  private ArrayList<Object> stack;
  private int dim;
  private int numElem;
  
  public StackLim () {
    stack = new ArrayList<Object> ();
    dim = dimStack;
    numElem = 0;
  }
  
  public StackLim (int dim) {
    stack = new ArrayList<Object> ();
    this.dim = dim;
    numElem = 0;
  }  
  
  public int dim () {   return dim;   }
  
  public int size () {    return numElem;   }
  
  public boolean empty () {   return (numElem == 0);    }
  
  public void push(Object elem) throws StackCheiaException {
    if(numElem == dim) 
      throw new StackCheiaException("Stack cheia !");
    else {
      stack.add(elem);
      numElem++ ;
    }
  }
  
  public void pop ()  throws StackVaziaException {
    if(numElem == 0)
      throw new  StackVaziaException("Stack vazia @pop!");
    else
      numElem-- ;
  }
  
  public Object top () throws  StackVaziaException  {
    if(this.empty())
      throw new  StackVaziaException("Stack vazia @top!");
    else
      return stack.get(numElem - 1);
  }
  
  public String output () {
    StringBuilder s = new StringBuilder();
    for(int i=numElem - 1; i >= 0; i--)
      s.append(stack.get(i).toString());
    return s.toString();
  }
}
    
    
