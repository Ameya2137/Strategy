# Strategy
This Java application models the behavior of different types of ducks using interfaces for swimming and flying behaviors, implementing various strategies such as floating, swimming, drowning, flying, and not flying.

## Features
- Implements Strategy Pattern for dynamic duck behaviors.
- Supports multiple duck types: **Mallard Duck, Redhead Duck, Rubber Duck, and Decoy Duck**.
- Implements **FlyBehavior, QuackBehavior, and SwimBehavior**.
- Uses modern Java syntax (e.g., enhanced switch statements).
- Runs in **IntelliJ IDEA** for an easy development experience.

## Project Structure
- **Main.java**: Contains the main method to run the duck simulation, allowing users to select different duck types and observe their behaviors.
- **Duck.java**: An abstract class defining common properties and methods for all duck types, utilizing behavior interfaces for flying, quacking, and swimming.
- **FlyBehavior.java**: An interface declaring the fly() method, representing the flying behavior strategy for ducks.
- **FlyWithWings.java**: Implements FlyBehavior; models ducks that fly using wings.
- **NoFly.java**: Implements FlyBehavior; models ducks that cannot fly.
- **QuackBehavior.java**: An interface declaring the quack() method, representing the quacking behavior strategy for ducks.
- **Quack.java**: Implements QuackBehavior; models ducks that quack normally.
- **Squeak.java**: Implements QuackBehavior; models ducks that squeak.
- **MuteQuack.java**: Implements QuackBehavior; models ducks that are silent.
- **SwimBehavior.java**: An interface declaring the swim() method, representing the swimming behavior strategy for ducks.
- **Swim.java**: Implements SwimBehavior; models ducks that swim actively.
- **Float.java**: Implements SwimBehavior; models ducks that float on water.
- **Drown.java**: Implements SwimBehavior; models ducks that drown.
- **MallardDuck.java**: Extends Duck; represents a mallard duck with specific behaviors.
- **RedheadDuck.java**: Extends Duck; represents a redhead duck with specific behaviors.
- **RubberDuck.java**: Extends Duck; represents a rubber duck with specific behaviors.
- **DecoyDuck.java**: Extends Duck; represents a decoy duck with specific behaviors.

## Technologies Used
- **Java** (Object-Oriented Programming, Interfaces, and Polymorphism)
- **IntelliJ IDEA** (Recommended for development)
