package teambranch.teambranch;

import org.bukkit.plugin.java.JavaPlugin;

public final class TeamBranch extends JavaPlugin {
    public static TeamBranch plugin;
    public static TeamBranch instance;
    public TeamBranch(){instance = this;}
    public static TeamBranch getInstance(){return instance;}
    @Override
    public void onEnable() {
        // Plugin startup logic
        plugin = this;
        getServer().getPluginManager().registerEvents(new EventListener(),this);
        getCommand("azgame").setExecutor(new CommandAz());
        //itemManager.init();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
    public static TeamBranch getPlugin(){
        return plugin;
    }
}
