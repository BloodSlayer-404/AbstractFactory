package org.example;

import org.example.tools.axes.Axe;
import org.example.tools.hoes.Hoe;
import org.example.tools.pickaxes.Pickaxe;
import org.example.tools.shovels.Shovel;

public interface ToolFactory {
    Axe createAxe();
    Pickaxe createPickaxe();
    Hoe createHoe();
    Shovel createShovel();
}
