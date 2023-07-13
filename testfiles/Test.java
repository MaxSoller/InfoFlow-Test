
public enum Level {
    LOW,
    HIGH
}

public @interface SecurityLabel {
    Level level() default Level.LOW;
}

public class Test {
  public boolean run() {

    @SecurityLabel(level=Level.HIGH)
    boolean h = true;
    
    @SecurityLabel(level=Level.LOW)
    boolean l = false;
    
    l = h;
    
    return l;
  }
}
