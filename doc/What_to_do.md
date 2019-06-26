# Looking into the Java type system
Here are some resources that can help you look into the Java type system.

1. The primitive data types of Java are explained in [this article](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html). Also the article named [Arrays](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html) could be of interest.
2. Java has a polymorphism mechanism called Generics, which is explained in the [Generics Lesson](https://docs.oracle.com/javase/tutorial/java/generics/index.html). The articles [Generic Types](https://docs.oracle.com/javase/tutorial/java/generics/types.html) and the section [Type Erasure](https://docs.oracle.com/javase/tutorial/java/generics/erasure.html) are particularly relevant.
3. With the [javap](https://docs.oracle.com/javase/7/docs/technotes/tools/windows/javap.html) tool (which is delivered as part of the JDK), you can disassemble and view bytecode. So, for example
   ```shell
   $ javap target/classes/com/github/blalasaadri/App.class
   ```
   will give you
   ```
   Compiled from "App.java"
   public class com.github.blalasaadri.App {
     public com.github.blalasaadri.App();
     public static void main(java.lang.String[]);
   }
   ```
   which is _"the package, protected, and public fields and methods of the classes passed to it"_.
   If you want to see more, try
   ```shell
   $ javap -s target/classes/com/github/blalasaadri/App.class
   ```
   to also get the type signatures or
   ```shell
   $ javap -Coin target/classes/com/github/blalasaadri/App.class
   ```
   to see the full, disassebled code.
   This can be especially interesting in combination with Generics and Type Erasure.
4. [Project Coin](https://openjdk.java.net/projects/coin/) brought the diamond operator (or more formally: _improved type inference_) to Java with JDK 7. With JDK 9 (and as part of [JEP 213](https://openjdk.java.net/jeps/213)) the diamond operator was [further improved](https://bugs.openjdk.java.net/browse/JDK-8062373).
5. Java 10 introduced [Local-Variable Type Inference](https://openjdk.java.net/jeps/286), also known as the `var` <span style="text-decoration: line-through">keyword</span> reserved type name. Two of the Java language architects wrote an [FAQ article](https://openjdk.java.net/projects/amber/LVTIFAQ.html) about the topic.
6. [Data Classes and Sealed Types for Java](https://cr.openjdk.java.net/~briangoetz/amber/datum.html) talks about data classes (also known as _records_) and how they will (probably) come to Java as part of [Project Amber](https://openjdk.java.net/projects/amber/).
7. [Project Valhalla](https://openjdk.java.net/projects/valhalla/) plans to add [value objects](https://openjdk.java.net/jeps/169) to Java. There is also a 2014 article called [State of the Values](http://cr.openjdk.java.net/~jrose/values/values-0.html) about this topic which is still an interesting read.