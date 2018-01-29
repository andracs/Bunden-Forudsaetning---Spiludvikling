package com.erikogniels.labyrintspil;

import javax.swing.*;

public class Tile extends JPanel {
    int x, y;
    boolean isWall = true;

    public Tile(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void setWall(boolean isWall){
        this.isWall = isWall;
    }
}
