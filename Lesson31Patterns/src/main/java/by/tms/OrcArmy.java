package by.tms;

import by.tms.orcsquad.OrcCombatSquadFactory;

public class OrcArmy {

    public static void main(String[] args) {
        CombatSquadFactory combatSquadFactory = new OrcCombatSquadFactory();
        Archer archer = combatSquadFactory.getArcher();
        Warrior warrior = combatSquadFactory.getWarrior();
        Wizard wizard = combatSquadFactory.getWizard();

        System.out.println("Creating an army of orcs...");
        archer.shoot();
        warrior.fightWithSwords();
        wizard.conjure();
    }
}
