package ru.job4j.chess;

import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import java.util.Optional;

/**
  * @author Petr Arsentev (parsentev@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
public class Logic {
    private final Figure[] figures = new Figure[32];
    private int index = 0;

    public void add(Figure figure) {
        this.figures[this.index++] = figure;
    }

    public boolean move(Cell source, Cell dest) throws OccupiedWayException, FiguraNotFoundException, ImpossibleMoveException {
        boolean rst = false;
        int index = this.findBy(source);
        if (index != -1) {
            Cell[] steps = this.figures[index].way(source, dest);
            if (waycheck(source, dest)) {
                throw new OccupiedWayException("Невозможный ход, на пути фигуры есть другая фигура");

            }
            if (steps.length > 0 && steps[steps.length - 1].equals(dest)) {
                rst = true;
                this.figures[index] = this.figures[index].copy(dest);
            }

        }



        return rst;

    }


    public boolean waycheck(Cell source, Cell dest) {
        boolean rst = false;
        int index = this.findBy(source);
        Cell[] steps = this.figures[index].way(source, dest);
        for (Cell cell : steps) {
            if (findBy(cell) != -1) {
               rst = true;
                break;
            }
        }
        return rst;


    }

    public void clean() {
        for (int position = 0; position != this.figures.length; position++) {
            this.figures[position] = null;
        }
        this.index = 0;
    }

    private int findBy(Cell cell) {
        int rst = -1;
        for (int index = 0; index != this.figures.length; index++) {
            if (this.figures[index] != null && this.figures[index].position().equals(cell)) {
                rst = index;
                break;
            }
        }
        if (rst == -1) {
            throw new FiguraNotFoundException("Фигура отсутствует");
        }

        return rst;
    }
}
