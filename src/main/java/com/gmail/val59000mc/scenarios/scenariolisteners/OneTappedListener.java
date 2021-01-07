package com.gmail.val59000mc.scenarios.scenariolisteners;

import com.gmail.val59000mc.events.UhcPreTeleportEvent;
import com.gmail.val59000mc.events.UhcStartedEvent;
import com.gmail.val59000mc.game.GameManager;
import com.gmail.val59000mc.players.UhcTeam;
import com.gmail.val59000mc.scenarios.Scenario;
import com.gmail.val59000mc.scenarios.ScenarioListener;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.event.EventHandler;

public class OneTappedListener extends ScenarioListener{

    @Override
    public void onEnable(){
        if (!getConfiguration().getEnableNether()){
            Bukkit.broadcastMessage(ChatColor.RED + "[UhcCore] For NetherStart the nether needs to be enabled first!");
            getScenarioManager().removeScenario(Scenario.ONETAPPED);
        }
    }

    @EventHandler
    public void onPlayerSpawn(UhcStartedEvent e){


        for(UhcTeam team : getPlayersManager().listUhcTeams()){
            Location newLoc = getPlayersManager().findRandomSafeLocation(, );
            team.setStartingLocation(newLoc);
        }
    }

}