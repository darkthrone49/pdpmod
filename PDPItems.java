package net.pdpmod.mod.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.pdpmod.mod.Pdpmod;

public class PDPItems extends Item {
	
	public PDPItems() {
		this.setCreativeTab(Pdpmod.PewDiePieTab);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister) {
		this.itemIcon = iconRegister.registerIcon(Pdpmod.modid + ":" + this.getUnlocalizedName().substring(5));
	}
}
