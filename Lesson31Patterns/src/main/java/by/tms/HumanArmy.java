package by.tms;

import by.tms.peoplesquad.HumanCombatSquadFactory;

public class HumanArmy {

    public static void main(String[] args) {
        CombatSquadFactory combatSquadFactory = new HumanCombatSquadFactory();
        Archer archer = combatSquadFactory.getArcher();
        Warrior warrior = combatSquadFactory.getWarrior();
        Wizard wizard = combatSquadFactory.getWizard();

        System.out.println("Creating an army of people...");
        archer.shoot();
        warrior.fightWithSwords();
        wizard.conjure();
    }
}