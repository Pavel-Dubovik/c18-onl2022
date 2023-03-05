package by.tms.orcsquad;

import by.tms.Archer;
import by.tms.CombatSquadFactory;
import by.tms.Warrior;
import by.tms.Wizard;

public class OrcCombatSquadFactory implements CombatSquadFactory {
    @Override
    public Archer getArcher() {
        return new OrcArcher();
    }

    @Override
    public Warrior getWarrior() {
        return new OrcWarrior();
    }

    @Override
    public Wizard getWizard() {
        return new OrcWizard();
    }
}
