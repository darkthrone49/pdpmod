package net.pdpmod.mod;



import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.pdpmod.mod.blocks.BroOre;
import net.pdpmod.mod.items.PDPItems;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
 

@Mod(modid = Pdpmod.modid, version = Pdpmod.version)
public class Pdpmod {

	public static final String modid = "Pdpmod"; 
	public static final String version = "Aplha v0.01";
	
	public static CreativeTabs PewDiePieTab; 
	
	public static Item itemBroIngot;
	
	public static Block oreBroOre; 
	
	
	@EventHandler 
	public void PreInit(FMLPreInitializationEvent preEvent){
		
		PewDiePieTab = new CreativeTabs("Pdpmod"){
			@SideOnly(Side.CLIENT)
			public Item getTabIconItem(){
				return Item.getItemFromBlock(Pdpmod.oreBroOre); 
			}
		};
		
		itemBroIngot = new PDPItems().setUnlocalizedName("BroIngot");
		GameRegistry.registerItem(itemBroIngot, "BroIngot"); 
		
		oreBroOre = new BroOre(Material.rock).setBlockName("BroOre");
		GameRegistry.registerBlock(oreBroOre, "BroOre");
	}
		
		
		
	
	@EventHandler
	public void PostInit(FMLPostInitializationEvent postEvent){
		
	}
}	
