public @interface SecurityLabel {
    Level level() default Level.LOW;
}

public enum Level {
    LOW,
    HIGH
}

public class Test3 {
  public boolean run() {

    @SecurityLabel(level=Level.HIGH) 
    boolean h = true;
    
    @SecurityLabel(level=Level.LOW)
    boolean l = false;

    boolean x = h;

    l = h;
    
    return l;
  }
}
