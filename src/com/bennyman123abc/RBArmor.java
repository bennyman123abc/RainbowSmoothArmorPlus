package com.bennyman123abc;

import org.bukkit.Bukkit;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.LeatherArmorMeta;
import org.bukkit.permissions.Permission;
import org.bukkit.plugin.java.JavaPlugin;

public class RBArmor extends JavaPlugin implements Listener{
	
	Permission rbarmor = new Permission("rba.use");

	public RBArmor() {
	}
	
	public int r, g, b = 20;
	public int time = 59;
	@Override
	public void onEnable() {
		Bukkit.getPluginManager().registerEvents(this, this);
		this.makeClockAndChangingTimers();
		Bukkit.getPluginManager().addPermission(rbarmor);
	}
	public void makeClockAndChangingTimers() {
		Bukkit.getScheduler().scheduleSyncRepeatingTask(this, new Runnable() {
			public void run() {
				switch(time) {
				case 59:
					r = 255;
					g = 0;
					b = 0;
					time-=1;
					break;
				case 58:
					r = 255;
					g = 68;
					b = 0;
					time-=1;
					break;
				case 57:
					r = 255;
					g = 111;
					b = 0;
					time-=1;
					break;
				case 56:
					r = 255;
					g = 171;
					b = 0;
					time-=1;
					break;
				case 55:
					r = 255;
					g = 255;
					b = 0;
					time-=1;
					break;
				case 54:
					r = 188;
					g = 255;
					b = 0;
					time-=1;
					break;
				case 53:
					r = 128;
					g = 255;
					b = 0;
					time-=1;
					break;
				case 52:
					r = 43;
					g = 255;
					b = 0;
					time-=1;
					break;
				case 51:
					r = 0;
					g = 255;
					b = 9;
					time-=1;
					break;
				case 50:
					r = 0;
					g = 255;
					b = 51;
					time-=1;
					break;
				case 49:
					r = 0;
					g = 255;
					b = 111;
					time-=1;
					break;
				case 48:
					r = 0;
					g = 255;
					b = 162;
					time-=1;
					break;
				case 47:
					r = 0;
					g = 255;
					b = 230;
					time-=1;
					break;
				case 46:
					r = 0;
					g = 239;
					b = 255;
					time-=1;
					break;
				case 45:
					r = 0;
					g = 196;
					b = 255;
					time-=1;
					break;
				case 44:
					r = 0;
					g = 173;
					b = 255;
					time-=1;
					break;
				case 43:
					r = 0;
					g = 162;
					b = 255;
					time-=1;
					break;
				case 42:
					r = 0;
					g = 137;
					b = 255;
					time-=1;
					break;
				case 41:
					r = 0;
					g = 100;
					b = 255;
					time-=1;
					break;
				case 40:
					r = 0;
					g = 77;
					b = 255;
					time-=1;
					break;
				case 39:
					r = 0;
					g = 34;
					b = 255;
					time-=1;
					break;
				case 38:
					r = 17;
					g = 0;
					b = 255;
					time-=1;
					break;
				case 37:
					r = 37;
					g = 0;
					b = 255;
					time-=1;
					break;
				case 36:
					r = 68;
					g = 0;
					b = 255;
					time-=1;
					break;
				case 35:
					r = 89;
					g = 0;
					b = 255;
					time-=1;
					break;
				case 34:
					r = 102;
					g = 0;
					b = 255;
					time-=1;
					break;
				case 33:
					r = 124;
					g = 0;
					b = 255;
					time-=1;
					break;
				case 32:
					r = 154;
					g = 0;
					b = 255;
					time-=1;
					break;
				case 31:
					r = 222;
					g = 0;
					b = 255;
					time-=1;
					break;
				case 30:
					r = 255;
					g = 0;
					b = 247;
					time-=1;
					break;
				case 29:
					r = 255;
					g = 0;
					b = 179;
					time-=1;
					break;
				case 28:
					r = 255;
					g = 0;
					b = 128;
					time = 59;
					break;
				}	
				Color c = Color.fromRGB(r, g, b);
				for (Player p : Bukkit.getServer().getOnlinePlayers()) {
		            if (p.getInventory().getHelmet() != null && p.getInventory().getHelmet().getType() == Material.LEATHER_HELMET && p.hasPermission(rbarmor)) {
		                    p.getInventory().setHelmet(getColorArmor(Material.LEATHER_HELMET, c));

		            }
		           
		            if (p.getInventory().getChestplate() != null && p.getInventory().getChestplate().getType() == Material.LEATHER_CHESTPLATE && p.hasPermission(rbarmor)) {
		                    p.getInventory().setChestplate(getColorArmor(Material.LEATHER_CHESTPLATE, c));
		            }
		           
		            if (p.getInventory().getLeggings() != null && p.getInventory().getLeggings().getType() == Material.LEATHER_LEGGINGS && p.hasPermission(rbarmor)) {
		                    p.getInventory().setLeggings(getColorArmor(Material.LEATHER_LEGGINGS, c));
		            }
		           
		            if (p.getInventory().getBoots() != null && p.getInventory().getBoots().getType() == Material.LEATHER_BOOTS && p.hasPermission(rbarmor)) {
		                    p.getInventory().setBoots(getColorArmor(Material.LEATHER_BOOTS, c));
		            }
		    }
			
			}
		},0, 2);
	}
	public ItemStack getColorArmor(Material m, Color c) {
		ItemStack i = new ItemStack(m, 1);
		LeatherArmorMeta meta = (LeatherArmorMeta) i.getItemMeta();
		meta.setColor(c);
		i.setItemMeta(meta);
		return i;
	}
	

}

