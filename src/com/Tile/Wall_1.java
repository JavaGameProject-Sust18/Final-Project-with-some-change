package com.Tile;

import com.Graphics.Assets;

public class Wall_1 extends Tile {
    public Wall_1(int id) {
        super(Assets.wall_1, id);
    }
    @Override
    public boolean isSolid(){
        return true;
    }
}
