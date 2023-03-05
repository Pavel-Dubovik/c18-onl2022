package by.tms.elfsquad;

import by.tms.Archer;
import by.tms.CombatSquadFactory;
import by.tms.Warrior;
import by.tms.Wizard;

public class ElfCombatSquadFactory implements CombatSquadFactory {
    @Override
    public Archer getArcher() {
        return new ElfArcher();
    }

    @Override
    public Warrior getWarrior() {
        return new ElfWarrior();
    }

    @Override
    public Wizard getWizard() {
        return new ElfWizard();
    }
}
