
import testfiles.SecurityLabel;
import testfiles.Level;

public class Test3 {
  public boolean run() {

    @SecurityLabel(level=Level.HIGH) 
    boolean h = true;
    
    @SecurityLabel(level=Level.LOW)
    boolean l = false;

    boolean x = h;

    l = x;
    
    return l;
  }
}
