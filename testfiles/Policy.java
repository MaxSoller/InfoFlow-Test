// package testfiles;

// public class Policy {
//     private User owner;
//     private User[] readers;

//     public Policy(User owner, User[] readers) {
//         this.owner = owner;
//         this.readers = readers;
//     }
// }
// public class User {
//     private String name;
//     public User(String name) {
//         this.name = name;
//     }
// }


// @Retention(RetentionPolicy.RUNTIME)
// public @interface Label {
//    Class<Policy>[] policy();
// }

// package testfiles;

// import java.lang.reflect.Field;
// import java.text.Annotation;

// public class TestLabel {
    
//     private User user = new User("Max");
//     private Policy policy = new Policy(user, new User[]{user});

//     @Label(policy={Policy.class, Policy.class}) 
//     String s = "Hello";


//     public static void testAnnotation() throws Exception{
        
//         Field field = TestLabel.class.getDeclaredField("s");
//         Label label = field.getAnnotation(Label.class);

        
//         System.out.println(label.policy().length);
//     }
    
//     public static void main(String[] args) {
//         try {
            
//             testAnnotation();
//         } catch (Exception e) {
//             // TODO: handle exception
//         }
//     }


// }
