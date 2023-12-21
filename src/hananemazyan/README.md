# Travaux Dirigés - Java Constructors

This repository contains exercises and examples related to Java constructors. Understanding constructors is crucial for creating well-structured and maintainable Java code.

## Overview

In Java, constructors play a vital role in object initialization. This project explores various constructor types, the **`toString`** method, and provides practical exercises to reinforce your understanding.

### Default Constructor

The default constructor is provided by Java if no constructor is explicitly defined in a class. It initializes the object with default values.


### Parameterized Constructor
A parameterized constructor is a constructor that takes parameters, allowing you to initialize an object with specific values at the time of creation. This provides flexibility and customization to the object initialization process.


### Copy Constructor
A copy constructor is used to create a new object by copying the values of an existing object. It helps in creating a duplicate of an object with the same or slightly modified values.



### toString Method
The toString method is a built-in method in Java that returns a string representation of an object. This method is often overridden in custom classes to provide a meaningful and human-readable string representation of the object's state.

![Alt text](images/tostring.png)
[Link Text](https://www.educative.io/answers/how-to-use-the-tostring-in-java)

By overriding the toString method, you can control how your object is represented as a string when it is printed or concatenated with other strings.

### @Override Annotation
The @Override annotation is used to indicate that a method in a subclass is intended to override a method in its superclass. It helps catch errors at compile-time if the annotated method doesn't actually override a method in the superclass.


- Adding @Override is a good practice when you intend to override a method, as it improves code readability and helps prevent accidental mistakes.

[Link text](https://www.javatpoint.com/method-overriding-in-java)