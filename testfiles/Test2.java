import testfiles.SecurityLabel;
import testfiles.Level;

public class Test2 {
  public boolean run(@SecurityLabel(level=Level.HIGH) boolean h) {
    
    @SecurityLabel(level=Level.LOW)
    boolean l = false;

    l = h;
    
    return l;
  }
}
