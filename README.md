# Java Learning Repository

This repository contains a comprehensive journey through the core concepts of Java programming. It covers Object-Oriented Programming (OOP) principles, abstraction, interfaces, error handling, and file handling. Each concept is explained with detailed code examples and explanations to facilitate thorough understanding.

## Table of Contents

- [Introduction](#introduction)
- [Prerequisites](#prerequisites)
- [Installation](#installation)
- [Usage](#usage)
- [Core Java Concepts](#core-java-concepts)
  - [1. Object-Oriented Programming (OOP)](#1-object-oriented-programming-oop)
    - [Classes and Objects](#classes-and-objects)
    - [Inheritance](#inheritance)
    - [Polymorphism](#polymorphism)
    - [Encapsulation](#encapsulation)
  - [2. Abstraction](#2-abstraction)
  - [3. Interfaces](#3-interfaces)
  - [4. Error Handling](#4-error-handling)
  - [5. File Handling](#5-file-handling)
- [Examples](#examples)
- [Contributing](#contributing)
- [License](#license)

## Introduction

This repository serves as a complete guide for learning core Java concepts. It is designed for beginners and intermediate learners who want to solidify their understanding of Java programming. Each section includes practical examples to demonstrate how the concepts are applied in real-world scenarios.

## Prerequisites

Before using this repository, you should have:

- Basic knowledge of programming.
- Java Development Kit (JDK) installed on your system.
- An Integrated Development Environment (IDE) like IntelliJ IDEA, Eclipse, or NetBeans.

## Installation

To get started, clone this repository to your local machine:

```bash
git clone https://github.com/your-username/java-learning-repo.git
cd java-learning-repo
```

## Usage

Each folder in the repository corresponds to a specific Java concept. Navigate to the relevant folder to explore code examples and detailed explanations. You can open the project in your preferred IDE to run and modify the code.

## Core Java Concepts

### 1. Object-Oriented Programming (OOP)

#### Classes and Objects

- **Definition**: A class is a blueprint for objects. An object is an instance of a class.
- **Example**: [ClassesAndObjects.java](src/oop/ClassesAndObjects.java)

```java
public class Car {
    String color;
    String model;

    public void displayInfo() {
        System.out.println("Model: " + model + ", Color: " + color);
    }
}

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.model = "Tesla Model S";
        car1.color = "Red";
        car1.displayInfo();
    }
}
```

#### Inheritance

- **Definition**: Inheritance allows a new class to inherit properties and methods from an existing class.
- **Example**: [Inheritance.java](src/oop/Inheritance.java)

```java
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.bark();
    }
}
```

#### Polymorphism

- **Definition**: Polymorphism allows methods to do different things based on the object it is acting upon.
- **Example**: [Polymorphism.java](src/oop/Polymorphism.java)

```java
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Cat();
        myAnimal.sound();
    }
}
```

#### Encapsulation

- **Definition**: Encapsulation restricts direct access to some of an object's components and can prevent the accidental modification of data.
- **Example**: [Encapsulation.java](src/oop/Encapsulation.java)

```java
public class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }
}

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("John");
        System.out.println(person.getName());
    }
}
```

### 2. Abstraction

- **Definition**: Abstraction is the concept of hiding the complex implementation details and showing only the essential features of the object.
- **Example**: [Abstraction.java](src/abstraction/Abstraction.java)

```java
abstract class Animal {
    abstract void sound();
}

class Lion extends Animal {
    void sound() {
        System.out.println("Roar");
    }
}

public class Main {
    public static void main(String[] args) {
        Lion lion = new Lion();
        lion.sound();
    }
}
```

### 3. Interfaces

- **Definition**: An interface is a reference type in Java. It is similar to class, and it is a collection of abstract methods.
- **Example**: [Interface.java](src/interfaces/Interface.java)

```java
interface Animal {
    void sound();
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Bark");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
    }
}
```

### 4. Error Handling

- **Definition**: Error handling is the process of responding to the occurrence of exceptions during program execution.
- **Example**: [ErrorHandling.java](src/errorhandling/ErrorHandling.java)

```java
public class Main {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds!");
        }
    }
}
```

### 5. File Handling

- **Definition**: File handling in Java implies reading from and writing data to a file.
- **Example**: [FileHandling.java](src/filehandling/FileHandling.java)

```java
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args) {
        // Writing to a file
        try {
            FileWriter writer = new FileWriter("example.txt");
            writer.write("Hello, World!");
            writer.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        // Reading from a file
        try {
            File file = new File("example.txt");
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                System.out.println(data);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
```

## Examples

Each concept includes multiple examples in the respective folders. Navigate to these folders to explore more detailed and advanced examples.

## Contributing

Contributions are welcome! If you have any examples, improvements, or bug fixes, please fork the repository and submit a pull request.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

---

Happy Coding!
