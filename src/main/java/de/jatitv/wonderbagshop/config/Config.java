// This claas was created by JaTiTV


package de.jatitv.wonderbagshop.config;

import de.jatitv.wonderbagshop.main.Main;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;

public class Config {

    public static String Currency = "$";

    public static void configCreate(){

        Bukkit.getConsoleSender().sendMessage(Messages.Prefix + "§4Config load...");

        File configYML = new File(Main.thisp().getDataFolder().getPath(), "config.yml");
        YamlConfiguration yamlConfiguration_config = YamlConfiguration.loadConfiguration(configYML);




        if (yamlConfiguration_config.contains("Currency")) {
            Currency = yamlConfiguration_config.getString("Currency");
        } else {
            yamlConfiguration_config.set("Currency", "$");
            Bukkit.getConsoleSender().sendMessage(Messages.Prefix + "§4Setting §6Currency §4was added to §9config.yml§4!");
        }

        try {
            yamlConfiguration_config.save(configYML);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Bukkit.getConsoleSender().sendMessage(Messages.Prefix + "§2Config loaded successfully.");
    }

    public static void configDisable(){
        Bukkit.getConsoleSender().sendMessage(Messages.Prefix + "§4Config successfully deactivated.");
    }

    private static String replace(String Text) {
        return Text.replace("&", "§").replace("%ue%", "ü").replace("%UE%", "Ü").replace("%oe%", "ö").replace("%OE%", "Ö").replace("%ae%", "ä").replace("%AE%", "Ä");
    }
}
