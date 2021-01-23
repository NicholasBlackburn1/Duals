package hackercraft.duals.arena;

import org.bukkit.Location;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import hackercraft.duals.Duals;
import hackercraft.duals.interfaces.ArenaInterface;


/**
 * this class handles plugin arena stuff
 */
public class Arena implements ArenaInterface {
    Duals instance;

    public Arena(Duals instance) {
        this.instance = instance;
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean isDisabled() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean setDisabled(CommandSender source, boolean disabled) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean setDisabled(boolean disabled) {
        
        return false;
    }

    @Override
    public Location getPosition(int pos) {
        
        return null;
    }

    @Override
    public boolean setPosition(Player source, int pos, Location location) {
       
        return false;
    }

    @Override
    public boolean setPosition(int pos, Location location) {
    
        return false;
    }

    @Override
    public boolean isUsed() {
        
        return false;
    }

    @Override
    public Match getMatch() {
       
        return null;
    }

    @Override
    public boolean has(Player player) {
        
        return false;
    }

    @Override
    public boolean isRemoved() {
       
        return false;
    }

    
}
