package by.tms;

public interface CombatSquadFactory {

    Archer getArcher();

    Warrior getWarrior();

    Wizard getWizard();
}