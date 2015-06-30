public class Spell {
  public String name;
  public SpellType type;
  public String description;

  public enum SpellType {SPELL, CHARM, CURSE}

  public Spell(String spellName, SpellType spellType, String spellDescription) {
    this.name = spellName;
    this.type = spellType;
    this.description = spellDescription;
  }

  public String toString() {
    return this.name;
  }
}