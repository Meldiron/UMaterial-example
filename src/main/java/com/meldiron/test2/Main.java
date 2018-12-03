package com.meldiron.test2;

import com.meldiron.test2.commands.TestCmd;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin implements Listener {
    @Override
    public void onEnable() {
        this.getCommand("test").setExecutor(new TestCmd());
    }

    @Override
    public void onDisable() {

    }
}
