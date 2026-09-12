package codewars.java.get.planet.name._by.id;

class Planet {
  static String getPlanetName(int id) {
    String name = switch (id) {
        case 1 -> "Mercury";
        case 2 -> "Venus";
        case 3 -> "Earth";
        case 4 -> "Mars";
        case 5 -> "Jupiter";
        case 6 -> "Saturn";
        case 7 -> "Uranus";
        case 8 -> "Neptune";
        default -> throw new IllegalStateException("Unexpected value: " + id);
    };
      return name;
  }
}