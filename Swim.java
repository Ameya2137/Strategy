// Defining a class that represents duck's swimming behaviors
public class Swim implements SwimBehavior {
  
    // Defining all possible swimming behaviors
    public enum SwimType { SWIM, FLOAT, DROWN }

    // Declares a private final variable to store the swimming behavior of the duck
    private final SwimType swimType;
