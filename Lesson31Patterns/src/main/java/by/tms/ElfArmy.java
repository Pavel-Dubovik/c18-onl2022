package by.tms;

import by.tms.elfsquad.ElfCombatSquadFactory;

public class ElfArmy {

    public static void main(String[] args) {
        CombatSquadFactory combatSquadFactory = new ElfCombatSquadFactory();
        Archer archer = combatSquadFactory.getArcher();
        Warrior warrior = combatSquadFactory.getWarrior();
        Wizard wizard = combatSquadFactory.getWizard();

        System.out.println("Creating an army of elves...");
        archer.shoot();
        warrior.fightWithSwords();
        wizard.conjure();
    }
}