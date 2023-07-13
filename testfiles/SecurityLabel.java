/* 
    @Retention: RetentionPolicy.CLASS - The marked annotation is retained by the compiler at compile time, but is ignored by the Java Virtual Machine (JVM).
    @Target: Marks another annotation to restrict what kind of elements the annotation can be used to.
    @Inherited: Indicates that the annotation can be inherited from super class.
*/

package testfiles;

public @interface SecurityLabel {
    Level level() default Level.LOW;
}

public enum Level {
    LOW,
    HIGH
}