package codewars.java.jennys.secret.message;

public class Greeter {
  public static String greet(String name) {
    name = name.replaceAll("Johnny", "my love");
    return String.format("Hello, %s!", name);

  }
}