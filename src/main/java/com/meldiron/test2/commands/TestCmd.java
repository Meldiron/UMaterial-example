package com.meldiron.test2.commands;

import com.meldiron.test2.libs.U.UMaterial;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;

public class TestCmd implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        Player pl = (Player) sender;

        pl.getInventory().addItem(UMaterial.BOOKSHELF.getItemStack());

        return true;
    }
}
