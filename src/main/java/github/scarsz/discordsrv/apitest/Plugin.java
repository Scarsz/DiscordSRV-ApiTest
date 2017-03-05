package github.scarsz.discordsrv.apitest;

import github.scarsz.discordsrv.DiscordSRV;
import org.bukkit.plugin.java.JavaPlugin;

public class Plugin extends JavaPlugin {

    private DiscordSRVListener discordsrvListener = new DiscordSRVListener();

    @Override
    public void onEnable() {
        DiscordSRV.api.subscribe(discordsrvListener);
    }

    @Override
    public void onDisable() {
        DiscordSRV.api.unsubscribe(discordsrvListener);
    }

}