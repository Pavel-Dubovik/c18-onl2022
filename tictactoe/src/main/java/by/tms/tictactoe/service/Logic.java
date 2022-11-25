package by.tms.tictactoe.service;

import by.tms.tictactoe.model.Figure;

public class Logic {

    private final Figure[][] table;

    public Logic(Figure[][] table) {
        this.table = table;
    }

    public boolean isWinnerX() {
        for (int i = 0; i < table.length; i++) {
            if (table[i][0].hasMarkX() && table[i][1].hasMarkX() && table[i][2].hasMarkX()) {
                return true;
            } else if (table[0][i].hasMarkX() && table[1][i].hasMarkX() && table[2][i].hasMarkX()) {
                return true;
            }

        }
        if (table[0][0].hasMarkX() && table[1][1].hasMarkX() && table[2][2].hasMarkX()) {
            return true;
        } else if (table[0][2].hasMarkX() && table[1][1].hasMarkX() && table[2][0].hasMarkX()) {
            return true;
        }
        return false;
    }

    public boolean isWinnerO() {
        for (int i = 0; i < table.length; i++) {
            if (table[i][0].hasMarkO() && table[i][1].hasMarkO() && table[i][2].hasMarkO()) {
                return true;
            } else if (table[0][i].hasMarkO() && table[1][i].hasMarkO() && table[2][i].hasMarkO()) {
                return true;
            }

        }
        if (table[0][0].hasMarkO() && table[1][1].hasMarkO() && table[2][2].hasMarkO()) {
            return true;
        } else if (table[0][2].hasMarkO() && table[1][1].hasMarkO() && table[2][0].hasMarkO()) {
            return true;
        }
        return false;
    }

    /**
     * Метод проверки, есть ли пустая клетка на поле(т.е не стоит X и не стоит O)
     *
     * @return true - если есть хотя бы одна свободная клетка, иначе все поля заполнены
     */
    public boolean checkEmptyCells() {
        for (Figure[] figures : table) {
            for (Figure figure : figures) {
                if (!figure.hasMarkX() && !figure.hasMarkO()) {
                    return true;
                }
            }
        }
        return false;
    }
}
