import java.util.*;

public class SpellStreamApp {
  public static void main(String[] args) {
    ArrayList<Spell> spells = new ArrayList<>();

    spells.add(new Spell("Aparecium", Spell.SpellType.SPELL, "Makes invisible ink appear."));
    spells.add(new Spell("Avis", Spell.SpellType.SPELL, "Launches birds from your wand."));
    spells.add(new Spell("Engorgio", Spell.SpellType.CHARM, "Englarges something."));
    spells.add(new Spell("Fidelius", Spell.SpellType.CHARM, "Hides a secret with someone."));
    spells.add(new Spell("Finite Incatatum", Spell.SpellType.SPELL, "Stops all current spells."));
    spells.add(new Spell("Locomotor Mortis", Spell.SpellType.CURSE, "Locks an opponent's legs."));


    // print spell names with foreach loop
    System.out.println("Print spells with foreach loop:");
    for (Spell spell: spells)
      System.out.println(spell.name);

    // print spell names using streams
    System.out.println("\nPrint spells with stream:");
    spells.stream().forEach(s -> System.out.println(s));


    // print spell names with foreach loop
    System.out.println("\nPrint only spells of type SPELL with foreach loop:");
    for (Spell spell: spells) {
      if (spell.type == Spell.SpellType.SPELL)
        System.out.println(spell.name);
    }

    // print spell names using streams
    System.out.println("\nPrint spells of type SPELL with stream:");
    spells.stream()
      .filter(s -> s.type == Spell.SpellType.SPELL)
      .forEach(s -> System.out.println(s));

    // print spell names using streams
    System.out.println("\nChain filter to get only SPELLs that start with 'A':");
    spells.stream()
      .filter(s -> s.type == Spell.SpellType.SPELL)
      .filter(s -> s.name.toLowerCase().startsWith("a"))
      .forEach(s -> System.out.println(s));

    // print all spells with parallel streams
    System.out.println("\nPrint all spells with parallel streams");

    System.out.println("\nFirst stream:");
    spells.parallelStream()
      .forEach(s -> System.out.println(s));

    System.out.println("\nSecond stream:");
    spells.parallelStream()
      .forEach(s -> System.out.println(s));
  }
}