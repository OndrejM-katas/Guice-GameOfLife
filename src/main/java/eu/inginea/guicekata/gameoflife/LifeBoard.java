/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.inginea.guicekata.gameoflife;

import javax.inject.Inject;

/**
 *
 * @author media
 */
public class LifeBoard {

    @Inject
    private BoardSnapshot boardSnapshot;

    public int getHeight() {
        return boardSnapshot.getHeight();
    }

    public int getWidth() {
        return boardSnapshot.getWidth();
    }

    public BoardCoordinate getTopLeft() {
        return new BoardCoordinate();
    }

    public void put(BoardCoordinate where) {
        boardSnapshot.setFilledAt(where, true);
    }

    public boolean valueAt(BoardCoordinate where) {
        return boardSnapshot.isFilledAt(where);
    }

}
