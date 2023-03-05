package by.tms.peoplesquad;

import by.tms.Archer;
import by.tms.CombatSquadFactory;
import by.tms.Warrior;
import by.tms.Wizard;

public class HumanCombatSquadFactory implements CombatSquadFactory {
    @Override
    public Archer getArcher() {
        return new HumanArcher();
    }

    @Override
    public Warrior getWarrior() {
        return new HumanWarrior();
    }

    @Override
    public Wizard getWizard() {
        return new HumanWizard();
    }
}
