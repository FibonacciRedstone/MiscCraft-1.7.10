package com.fibonacci.MiscCraft.common;


import com.fibonacci.MiscCraft.block.*;
import com.fibonacci.MiscCraft.block.gui.container.MiscCraftGUIHandler;
import com.fibonacci.MiscCraft.block.tileentity.TileEntityBeerStill;
import com.fibonacci.MiscCraft.block.tileentity.TileEntityBullSummonBlock;
import com.fibonacci.MiscCraft.block.tileentity.TileEntityPipe;
import com.fibonacci.MiscCraft.block.tileentity.TileEntitySapphireFurnace2;
import com.fibonacci.MiscCraft.block.tileentity.TileEntitySolarPanel;
import com.fibonacci.MiscCraft.block.tileentity.TileEntityWindmill;
import com.fibonacci.MiscCraft.block.tileentity.TileEntityWire;
import com.fibonacci.MiscCraft.block.worldgeneration.AntiOreWG;
import com.fibonacci.MiscCraft.block.worldgeneration.NewBlockTestWG;
import com.fibonacci.MiscCraft.block.worldgeneration.PlatinumOreWG;
import com.fibonacci.MiscCraft.block.worldgeneration.SapphireOreWG;
import com.fibonacci.MiscCraft.common.config.MiscCraftConfig;
import com.fibonacci.MiscCraft.common.events.OnCraftEvent;
import com.fibonacci.MiscCraft.common.events.OnSmeltEvent;
import com.fibonacci.MiscCraft.common.events.WindmillHighlightEvent;
import com.fibonacci.MiscCraft.common.world.biome.BiomePlatinumOre;
import com.fibonacci.MiscCraft.common.world.biome.dimension.WorldProviderPlatinum;
import com.fibonacci.MiscCraft.creativetab.MiscCraftTab;
import com.fibonacci.MiscCraft.creativetab.WIPTab;
import com.fibonacci.MiscCraft.creativetab.placeholder.MiscCraftTabIcon;
import com.fibonacci.MiscCraft.creativetab.placeholder.WIPTabIcon;
import com.fibonacci.MiscCraft.item.*;
import com.fibonacci.MiscCraft.item.armor.AntiMetalArmor;
import com.fibonacci.MiscCraft.item.armor.EmeraldArmor;
import com.fibonacci.MiscCraft.mob.entity.*;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.IFuelHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityList.EntityEggInfo;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Achievement;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.GenLayerBiome;
import net.minecraftforge.common.*;
import net.minecraftforge.common.BiomeManager.BiomeEntry;
import net.minecraftforge.common.util.EnumHelper;

import com.fibonacci.MiscCraft.item.armor.PineconeArmor;

@Mod(modid = "MiscCraft", name = "MiscCraft", version = "1.2")


public class MiscCraft {






@SidedProxy(clientSide = "com.fibonacci.MiscCraft.common.ClientProxy", serverSide = "com.fibonacci.MiscCraft.common.CommonProxy")
public static CommonProxy proxy;

@Instance("MiscCraft")
public static MiscCraft instance;


//entity ids
private static int startEntityId = 300;


//ruby armour ids
private static int SapphireH;
private static int SapphireC;
private static int SapphireL;
private static int SapphireB;
public static final int guiIDWindmill = 0;
public static final int guiIDSolarPanel = 1;
public static final int guiIDCraftingChest = 2;

private static int RubyH;
private static int RubyC;
private static int RubyL;
private static int RubyB;

private static int EmeraldH;
private static int EmeraldC;
private static int EmeraldL;
private static int EmeraldB;

private static int AntiH;
private static int AntiC;
private static int AntiL;
private static int AntiB;

private static int GodH;
private static int GodC;
private static int GodL;
private static int GodB;

private static int PineH;
private static int PineC;
private static int PineL;
private static int PineB;



//Materials
public static ToolMaterial Emerald = EnumHelper.addToolMaterial("Emerald", 4, 2500, 6.0F, 10, 10);
public static ToolMaterial RubyMaterial = EnumHelper.addToolMaterial("Ruby", 6, 5000, 20.0F, 20, 30);
public static ToolMaterial SapphireMaterial = EnumHelper.addToolMaterial("Sapphire", 8, 7500, 30.0F, 30, 50);
public static ToolMaterial AntiMetalMaterial = EnumHelper.addToolMaterial("AntiMetalIngot", 10, 10000, 40.0F, 40, 70);
public static ArmorMaterial SapphireArmor = EnumHelper.addArmorMaterial("SAPPHIREARMOR",99,new int[]{9, 24, 18, 9},30);
public static ArmorMaterial RubyArmor = EnumHelper.addArmorMaterial("RUBYARMOR", 66,new int[]{6, 16, 12, 6}, 20);
public static ToolMaterial DusterMaterial = EnumHelper.addToolMaterial("Duster", 10, 700, 100.0F, 5, 10);
public static ArmorMaterial AntiArmor = EnumHelper.addArmorMaterial("ANTIARMOR", 132,new int[]{12, 36, 24, 12}, 40);
public static ToolMaterial OPMaterial = EnumHelper.addToolMaterial("OpMaterial", 100000, 999999, 9999999, 99999999, 99999999);
public static ToolMaterial DisablerMaterial = EnumHelper.addToolMaterial("DisablerMaterial", 1, 100, 1 , 1, 1);
public static ArmorMaterial EmeraldArmor = EnumHelper.addArmorMaterial("EMERALDARMOR", 44,new int[]{4, 14, 10, 4}, 36);
public static ArmorMaterial GodArmor = EnumHelper.addArmorMaterial("GODARMOR", 200,new int[]{20, 50, 40, 20}, 60);
public static ArmorMaterial PineconeArmor = EnumHelper.addArmorMaterial("PINEARMOR",5, new int[]{1, 3, 2, 1}, 15);
public static ToolMaterial God = EnumHelper.addToolMaterial("God", 20, 20000, 80, 80, 140);

//terrain generation 
public static NewBlockTestWG worldgen1 = new NewBlockTestWG();
public static SapphireOreWG worldgen2 = new SapphireOreWG();
public static AntiOreWG worldgen3 = new AntiOreWG();
public static PlatinumOreWG worldgen4 = new PlatinumOreWG();





//Creative Tabs
public static CreativeTabs MiscCraftTab = new MiscCraftTab(CreativeTabs.getNextID(), "MiscCraft");
public static CreativeTabs WIPTab = new WIPTab(CreativeTabs.getNextID(), "WIP");
public static Item MiscCraftTabIcon = new MiscCraftTabIcon(5008).setUnlocalizedName("MiscCraftTabIcon").setTextureName("MiscCraft:AntiMetalIngotPNG");
public static Item WIPTabIcon = new WIPTabIcon(5047).setUnlocalizedName("WIPTabIcon").setTextureName("MiscCraft:wipPNG");
//adding new Items/Blocks
public static Block NewBlockTest = new NewBlockTest(5000).setBlockName("NewBlockTest").setBlockTextureName("MiscCraft:NewBlockTestPNG");
public static Block SapphireOre = new com.fibonacci.MiscCraft.block.SapphireOre(5012).setBlockName("SapphireOre").setBlockTextureName("MiscCraft:SapphireOrePNG");
public static Item EmeraldPickaxe = new EmeraldPickaxe(5001, Emerald).setUnlocalizedName("EmeraldPickaxe").setTextureName("MiscCraft:EmeraldPickaxePNG");
public static Item EmeraldSword = new EmeraldSword(5002, Emerald).setUnlocalizedName("EmeraldSword").setTextureName("MiscCraft:EmeraldSwordPNG");
public static Item EmeraldAxe = new EmeraldAxe(5003, Emerald).setUnlocalizedName("EmeraldAxe").setTextureName("MiscCraft:EmeraldAxePNG");
public static Item EmeraldShovel = new EmeraldShovel(5004, Emerald).setUnlocalizedName("EmeraldShovel").setTextureName("MiscCraft:EmeraldShovelPNG");
public static Item EmeraldHoe = new EmeraldHoe(5005, Emerald).setUnlocalizedName("EmeraldHoe").setTextureName("MiscCraft:EmeraldHoePNG");
public static Item RubyShard = new RubyShard(5006).setUnlocalizedName("RubyShard").setTextureName("MiscCraft:RubyShardPNG");
public static Item Ruby = new Ruby(5007).setUnlocalizedName("Ruby").setTextureName("MiscCraft:RubyPNG");
public static Item RubyPickaxe = new com.fibonacci.MiscCraft.item.RubyPickaxe(5009, RubyMaterial).setUnlocalizedName("RubyPickaxe").setTextureName("MiscCraft:RubyPickaxePNG");
public static Item UltraStick = new com.fibonacci.MiscCraft.item.UltraStick(5010).setUnlocalizedName("UltraStick").setTextureName("MiscCraft:UltaStickPNG");
public static Item RubySword = new com.fibonacci.MiscCraft.item.RubySword(5011, RubyMaterial).setUnlocalizedName("RubySword").setTextureName("MiscCraft:RubySwordPNG");
public static Item RubyHoe = new com.fibonacci.MiscCraft.item.RubyHoe(5012, RubyMaterial).setUnlocalizedName("RubyHoe").setTextureName("MiscCraft:RubyHoePNG");
public static Item RubyAxe = new com.fibonacci.MiscCraft.item.RubyAxe(5013, RubyMaterial).setUnlocalizedName("RubyAxe").setTextureName("MiscCraft:RubyAxePNG");
public static Item RubyShovel = new com.fibonacci.MiscCraft.item.RubyShovel(5014, RubyMaterial).setUnlocalizedName("RubyShovel").setTextureName("MiscCraft:RubyShovelPNG");
public static Item Sapphire = new com.fibonacci.MiscCraft.item.Sapphire(5015).setUnlocalizedName("Sapphire").setTextureName("MiscCraft:SapphirePNG");
public static Item SapphirePickaxe = new com.fibonacci.MiscCraft.item.SapphirePickaxe(5016, SapphireMaterial).setUnlocalizedName("SapphirePickaxe").setTextureName("MiscCraft:SapphirePickaxePNG");
public static Item SapphireShovel = new com.fibonacci.MiscCraft.item.SapphireShovel(5017, SapphireMaterial).setUnlocalizedName("SapphireShovel").setTextureName("MiscCraft:SapphireShovelPNG");
public static Item SapphireSword = new com.fibonacci.MiscCraft.item.SapphireSword(5018, SapphireMaterial).setUnlocalizedName("SapphireSword").setTextureName("MiscCraft:SapphireSwordPNG");
public static Item SapphireHelmet = new com.fibonacci.MiscCraft.item.armor.SapphireArmor(SapphireArmor, SapphireH, 0).setUnlocalizedName("SapphireHelmet").setTextureName("MiscCraft:SapphireHelmetPNG");
public static Item SapphireChestplate = new com.fibonacci.MiscCraft.item.armor.SapphireArmor(SapphireArmor, SapphireC, 1).setUnlocalizedName("SapphireChestplate").setTextureName("MiscCraft:SapphireChestplatePNG");
public static Item SapphireLeggings = new com.fibonacci.MiscCraft.item.armor.SapphireArmor(SapphireArmor, SapphireL, 2).setUnlocalizedName("SapphireLeggings").setTextureName("MiscCraft:SapphireLeggingsPNG");
public static Item SapphireBoots = new com.fibonacci.MiscCraft.item.armor.SapphireArmor(SapphireArmor, SapphireB, 3).setUnlocalizedName("SapphireBoots").setTextureName("MiscCraft:SapphireBootsPNG");
public static Item AntiMetalIngot = new com.fibonacci.MiscCraft.item.AntiMetalIngot(5020).setUnlocalizedName("AntiMetalIngot").setTextureName("MiscCraft:AntiMetalIngotPNG");
public static Item GodHoe = new com.fibonacci.MiscCraft.item.GodHoe(5042, God).setUnlocalizedName("GodHoe").setTextureName("MiscCraft:GodHoePNG");
public static Item GodPickaxe = new com.fibonacci.MiscCraft.item.GodPickaxe(5043, God).setUnlocalizedName("GodPickaxe").setTextureName("MiscCraft:GodPickaxePNG");
public static Item GodShovel = new com.fibonacci.MiscCraft.item.GodShovel(5044, God).setUnlocalizedName("GodShovel").setTextureName("MiscCraft:GodShovelPNG");
public static Item GodSword = new com.fibonacci.MiscCraft.item.GodSword(5045, God).setUnlocalizedName("GodSword").setTextureName("MiscCraft:GodSwordPNG");
public static Item GodHelmet = new com.fibonacci.MiscCraft.item.armor.GodArmor(GodArmor, GodH, 0).setUnlocalizedName("GodHelmet").setTextureName("MiscCraft:GodHelmetPNG");
public static Item GodChestplate = new com.fibonacci.MiscCraft.item.armor.GodArmor(GodArmor, GodC, 1).setUnlocalizedName("GodChestplate").setTextureName("MiscCraft:GodChestplatePNG");
public static Item GodLeggings = new com.fibonacci.MiscCraft.item.armor.GodArmor(GodArmor, GodL, 2).setUnlocalizedName("GodLeggings").setTextureName("MiscCraft:GodLeggingsPNG");
public static Item GodBoots = new com.fibonacci.MiscCraft.item.armor.GodArmor(GodArmor, GodB, 3).setUnlocalizedName("GodBoots").setTextureName("MiscCraft:GodBootsPNG");
public static Item GodAxe = new com.fibonacci.MiscCraft.item.GodAxe(5046, God).setUnlocalizedName("GodAxe").setTextureName("MiscCraft:GodAxePNG");
public static Item PlatinumIngot = new PlatinumIngot(5041).setUnlocalizedName("PlatinumIngot").setTextureName("MiscCraft:PlatinumIngotPNG");
public static Item RubyHelmet = new com.fibonacci.MiscCraft.item.armor.RubyArmor(RubyArmor, RubyH, 0).setUnlocalizedName("RubyHelmet").setTextureName("MiscCraft:RubyHelmetPNG");
public static Item RubyChestplate = new com.fibonacci.MiscCraft.item.armor.RubyArmor(RubyArmor, RubyC, 1).setUnlocalizedName("RubyChestplate").setTextureName("MiscCraft:RubyChestplatePNG");
public static Item RubyLeggings = new com.fibonacci.MiscCraft.item.armor.RubyArmor(RubyArmor, RubyL, 2).setUnlocalizedName("RubyLeggings").setTextureName("MiscCraft:RubyLeggingsPNG");
public static Item RubyBoots = new com.fibonacci.MiscCraft.item.armor.RubyArmor(RubyArmor, RubyB, 3).setUnlocalizedName("RubyBoots").setTextureName("MiscCraft:RubyBootsPNG");
public static Item SapphireHoe = new com.fibonacci.MiscCraft.item.SapphireHoe(5021, SapphireMaterial).setUnlocalizedName("SapphireHoe").setTextureName("MiscCraft:SapphireHoePNG");
public static Item SapphireAxe = new com.fibonacci.MiscCraft.item.SapphireAxe(5022, SapphireMaterial).setUnlocalizedName("SapphireAxe").setTextureName("MiscCraft:SapphireAxePNG");
public static Item AntiMetalPickaxe = new com.fibonacci.MiscCraft.item.AntiMetalPickaxe(5023, AntiMetalMaterial).setUnlocalizedName("AntiMetalPickaxe").setTextureName("MiscCraft:AntiMetalPickaxePNG");
public static Item AntiMetalSword = new com.fibonacci.MiscCraft.item.AntiMetalSword(5024, AntiMetalMaterial).setUnlocalizedName("AntiMetalSword").setTextureName("MiscCraft:AntiMetalSwordPNG");
public static Item AntiMetalAxe = new com.fibonacci.MiscCraft.item.AntiMetalAxe(5025, AntiMetalMaterial).setUnlocalizedName("AntiMetalAxe").setTextureName("MiscCraft:AntiMetalAxePNG");
public static Item FeatherDuster = new com.fibonacci.MiscCraft.item.FeatherDuster(5027, DusterMaterial).setUnlocalizedName("FeatherDuster").setTextureName("MiscCraft:FeatherDusterPNG");
public static Item Chain = new com.fibonacci.MiscCraft.item.Chain(5028).setUnlocalizedName("Chain").setTextureName("MiscCraft:ChainPNG");
public static Block AntiOre = new com.fibonacci.MiscCraft.block.AntiOre(5029).setBlockName("AntiOre").setBlockTextureName("MiscCraft:AntiOrePNG");
public static Item RawAntiMetal = new com.fibonacci.MiscCraft.item.RawAntiMetal(5030).setUnlocalizedName("RawAntiMetal").setTextureName("MiscCraft:RawAntiMetalPNG");
public static Item PlatinumChunk = new PlatinumChunk(5040).setUnlocalizedName("PlatinumChunk").setTextureName("MiscCraft:PlatinumChunkPNG");
public static Item EnderDust = new com.fibonacci.MiscCraft.item.EnderDust(5031).setUnlocalizedName("EnderDust").setTextureName("MiscCraft:EnderDustPNG");
public static Item StarDust = new com.fibonacci.MiscCraft.item.StarDust(5032).setUnlocalizedName("StarDust").setTextureName("MiscCraft:StarDustPNG");
public static Block NetherStarBlock = new NetherStarBlock(Material.iron).setBlockName("NetherStarBlock").setBlockTextureName("MiscCraft:NetherStarBlockPNG");
public static Item AntiMetalHelmet = new AntiMetalArmor(AntiArmor, AntiH, 0).setUnlocalizedName("AntiMetalHelmet").setTextureName("MiscCraft:AntiMetalHelmetPNG");
public static Item AntiMetalChestplate = new com.fibonacci.MiscCraft.item.armor.AntiMetalArmor(AntiArmor, AntiC, 1).setUnlocalizedName("AntiMetalChestplate").setTextureName("MiscCraft:AntiMetalChestplatePNG");
public static Item AntiMetalLeggings = new com.fibonacci.MiscCraft.item.armor.AntiMetalArmor(AntiArmor, AntiL, 2).setUnlocalizedName("AntiMetalLeggings").setTextureName("MiscCraft:AntiMetalLeggingsPNG");
public static Item AntiMetalBoots = new com.fibonacci.MiscCraft.item.armor.AntiMetalArmor(AntiArmor, AntiB, 3).setUnlocalizedName("AntiMetalBoots").setTextureName("MiscCraft:AntiMetalBootsPNG");
public static Item EnderDragonSpawnEgg = new com.fibonacci.MiscCraft.item.EnderDragonSpawnEgg(5033).setUnlocalizedName("EnderDragonSpawnEgg").setTextureName("MiscCraft:EnderDragonSpawnEggPNG");
public static Item SpawnTamableBull = new com.fibonacci.MiscCraft.item.SpawnTamableBull(5034).setUnlocalizedName("SpawnTamableBull").setTextureName("MiscCraft:SpawnTamableBullPNG");
public static Block ClanCastleTest = new com.fibonacci.MiscCraft.block.ClanCastleTest(Material.rock).setBlockName("ClanCastleTest").setBlockTextureName("MiscCraft:wipPNG").setCreativeTab(MiscCraft.MiscCraftTab);
public static Item OP_Sword = new com.fibonacci.MiscCraft.item.OP_Sword(5035, OPMaterial).setUnlocalizedName("OPSword").setTextureName("MiscCraft:OPSwordPNG");
public static Item SapphireShard = new com.fibonacci.MiscCraft.item.SapphireShard(5036).setUnlocalizedName("SapphireShard").setTextureName("MiscCraft:SapphireShardPNG");
public static Item TestFood = new com.fibonacci.MiscCraft.item.TestFood(5037, .5F, true).setUnlocalizedName("TestFood").setTextureName("MiscCraft:TestFoodPNG");
public static Item AntiMetalNugget = new AntiMetalNugget(5038).setUnlocalizedName("AntiMetalNugget").setTextureName("MiscCraft:AntiMetalNuggetPNG");
public static Block LandMine = new LandMine(Material.rock).setBlockName("LandMine").setBlockTextureName("MiscCraft:LandMinePNG");
public static Block Alarm = new Alarm(Material.rock).setBlockName("Alarm").setBlockTextureName("MiscCraft:AlarmPNG");
public static Block CompressedObsidian = new CompressedObsidian(Material.iron).setBlockName("CompressedObsidian").setBlockTextureName("obsidian");
public static Block IndoTorch = new IndoTorch(Material.circuits).setBlockName("IndoTorch").setBlockTextureName("MiscCraft:IndoTorchPNG");
public static Block Spikes = new Spikes(Material.iron).setBlockName("Spikes").setBlockTextureName("MiscCraft:SpikesPNG");
public static Item Disabler = new Disabler(5040, DisablerMaterial).setUnlocalizedName("Disabler").setTextureName("MiscCraft:DisablerPNG");
public static Block LandMineGrass = new LandMineGrass(Material.rock).setBlockName("LandMineGrass").setBlockTextureName("grass_top");
public static Block LandMineStone = new LandMineStone(Material.rock).setBlockName("LandMineStone").setBlockTextureName("stone");
public static Block LandMineCobblestone = new LandMineCobblestone(Material.rock).setBlockName("LandMineCobblestone").setBlockTextureName("cobblestone");
public static Block LandMineDiamondBlock = new LandMineDiamondBlock(Material.rock).setBlockName("LandMineDiamondBlock").setBlockTextureName("diamond_block");
public static Block LandMineGoldBlock = new LandMineGoldBlock(Material.rock).setBlockName("LandMineGoldBlock").setBlockTextureName("gold_block");
public static Block LandMineIronBlock = new LandMineIronBlock(Material.rock).setBlockName("LandMineIronBlock").setBlockTextureName("iron_block");
public static Block LandMineRedstoneBlock = new LandMineRedstoneBlock(Material.rock).setBlockName("LandMineRedstoneBlock").setBlockTextureName("redstone_block");
public static Block LandMineLapisLazuilBlock = new LandMineLapisLazuilBlock(Material.rock).setBlockName("LandMineLapisLazuilBlock").setBlockTextureName("lapis_block");
public static Block LandMineEmeraldBlock = new LandMineEmeraldBlock(Material.rock).setBlockName("LandMineEmeraldBlock").setBlockTextureName("emerald_block");
public static Block LandMineCoalBlock = new LandMineCoalBlock(Material.rock).setBlockName("LandMineCoalBlock").setBlockTextureName("coal_block");
public static Block AlarmGrass = new AlarmGrass(Material.rock).setBlockName("AlarmGrass").setBlockTextureName("grass_top");
public static Block AlarmStone = new AlarmStone(Material.rock).setBlockName("AlarmStone").setBlockTextureName("stone");
public static Block AlarmCobblestone = new AlarmCobblestone(Material.rock).setBlockName("AlarmCobblestone").setBlockTextureName("cobblestone");
public static Block AlarmDiamondBlock = new AlarmDiamondBlock(Material.rock).setBlockName("AlarmDiamondBlock").setBlockTextureName("diamond_block");
public static Block AlarmGoldBlock = new AlarmGoldBlock(Material.rock).setBlockName("AlarmGoldBlock").setBlockTextureName("gold_block");
public static Block AlarmIronBlock = new AlarmIronBlock(Material.rock).setBlockName("AlarmIronBlock").setBlockTextureName("iron_block");
public static Block AlarmRedstoneBlock = new AlarmRedstoneBlock(Material.rock).setBlockName("AlarmRedstoneBlock").setBlockTextureName("redstone_block");
public static Block AlarmLapisLazuliBlock = new AlarmLapisLazuliBlock(Material.rock).setBlockName("AlarmLapisLazuilBlock").setBlockTextureName("lapis_block");
public static Block AlarmEmeraldBlock = new AlarmEmeraldBlock(Material.rock).setBlockName("AlarmEmeraldBlock").setBlockTextureName("emerald_block");
public static Block AlarmCoalBlock = new AlarmCoalBlock(Material.rock).setBlockName("AlarmCoalBlock").setBlockTextureName("coal_block");
public static Item Spike = new Spike(5041).setUnlocalizedName("Spike").setTextureName("SpikePNG");
public static Block RedDragonEgg = new RedDragonEgg().setBlockName("RedDragonEgg").setBlockTextureName("MiscCraft:RedDragonEggPNG");
public static Block PhantomBlock = new PhantomBlock().setBlockName("PhantomBlock").setBlockTextureName("stone");
public static Block BigBoom = new BigBoom().setBlockName("BigBoom").setBlockTextureName("MiscCraft:wipPNG");
public static Item EmeraldHelmet = new EmeraldArmor(EmeraldArmor, EmeraldH, 0).setUnlocalizedName("EmeraldHelmet").setTextureName("MiscCraft:EmeraldHelmetPNG");
public static Item EmeraldChestplate = new EmeraldArmor(EmeraldArmor, EmeraldC, 1).setUnlocalizedName("EmeraldChestplate").setTextureName("MiscCraft:EmeraldChestplatePNG");
public static Item EmeraldLeggings = new EmeraldArmor(EmeraldArmor, EmeraldL, 2).setUnlocalizedName("EmeraldLeggings").setTextureName("MiscCraft:EmeraldLeggingsPNG");
public static Item EmeraldBoots = new EmeraldArmor(EmeraldArmor, EmeraldB, 3).setUnlocalizedName("EmeraldBoots").setTextureName("MiscCraft:EmeraldBootsPNG");
public static Item PlatinumNugget = new PlatinumNugget(5038).setUnlocalizedName("PlatinumNugget").setTextureName("MiscCraft:PlatinumNuggetPNG");
public static Block PlatinumOre = new PlatinumOre(5039).setBlockName("PlatinumOre").setBlockTextureName("MiscCraft:PlatinumOrePNG");
public static Block RubyBlock = new RubyBlock(Material.rock).setBlockName("RubyBlock").setBlockTextureName("MiscCraft:RubyBlockPNG");
public static Block SapphireBlock = new SapphireBlock(Material.rock).setBlockName("SapphireBlock").setBlockTextureName("MiscCraft:SapphireBlockPNG");
public static Block AntiMetalBlock = new AntiMetalBlock(Material.rock).setBlockName("AntiMetalBlock").setBlockTextureName("MiscCraft:AntiMetalBlockPNG");
public static Block PlatinumBlock = new PlatinumBlock(Material.rock).setBlockName("PlatinumBlock").setBlockTextureName("MiscCraft:PlatinumBlockPNG");
public static Item DiamondFeather = new DiamondFeather(5048).setUnlocalizedName("DiamondFeather").setTextureName("MiscCraft:DiamondFeatherPNG");
public static Item FlightGiver = new FlightGiver(5049).setUnlocalizedName("FlightGiver").setTextureName("MiscCraft:FlightGiverPNG");
public static Item GodBow = new GodBow(5050).setUnlocalizedName("GodBow");
public static Achievement RubyAchievement = new Achievement("achievement.ruby", "ruby", -3 , -4, MiscCraft.Ruby, (Achievement)null).registerStat();
public static Achievement SapphireAchievement = new Achievement("achievement.sapphire", "sapphire", -5 , -5, MiscCraft.Sapphire, RubyAchievement).registerStat();
public static Achievement PlatinumIngotAchievement = new Achievement("achievement.platinumIngot", "platinumIngot", 0 , 0, MiscCraft.PlatinumIngot, SapphireAchievement).registerStat().setSpecial();
public static Achievement GodSwordAchievement = new Achievement("achievement.godsword", "godsword", 2 , 2, MiscCraft.GodSword, PlatinumIngotAchievement).registerStat().setSpecial();
public static Achievement GodPickaxeAchievement = new Achievement("achievement.godpickaxe", "godpickaxe", -2 , 2, MiscCraft.GodPickaxe, PlatinumIngotAchievement).registerStat().setSpecial();
public static Achievement GodAxeAchievement = new Achievement("achievement.godaxe", "godaxe", 2 , -2, MiscCraft.GodAxe, PlatinumIngotAchievement).registerStat().setSpecial();
public static Achievement GodShovelAchievement = new Achievement("achievement.godshovel", "godshovel", -2 , -2, MiscCraft.GodShovel, PlatinumIngotAchievement).registerStat().setSpecial();
public static Achievement GodHoeAchievement = new Achievement("achievement.godhoe", "godhoe", 2 , 0, MiscCraft.GodHoe, PlatinumIngotAchievement).registerStat().setSpecial();
public static Achievement FlightAchievement = new Achievement("achievement.flight", "flight", 6 , -1, MiscCraft.FlightGiver, PlatinumIngotAchievement).registerStat().setSpecial();
public static Achievement GodChestplateAchievement = new Achievement("achievement.godchestplate", "godchestplate", 3 , 4, MiscCraft.GodChestplate, PlatinumIngotAchievement).registerStat().setSpecial();
public static Achievement GodHelmetAchievement = new Achievement("achievement.godhelmet", "godhelmet", -1 , 5, MiscCraft.GodHelmet, PlatinumIngotAchievement).registerStat().setSpecial();
public static Achievement GodLeggingsAchievement = new Achievement("achievement.godleggings", "godleggings", 1 , -5, MiscCraft.GodLeggings, PlatinumIngotAchievement).registerStat().setSpecial();
public static Achievement GodBootsAchievement = new Achievement("achievement.godboots", "godboots", -5 , 1, MiscCraft.GodBoots, PlatinumIngotAchievement).registerStat().setSpecial();
public static Achievement GodBowAchievement = new Achievement("achievement.godbow", "godbow", -1 , -1, MiscCraft.GodBow, PlatinumIngotAchievement).registerStat().setSpecial();
    public static Achievement AntiMetalIngotAchievement = new Achievement("achievement.antimetalingot", "antimetalingot", -5 , -3, MiscCraft.AntiMetalIngot, SapphireAchievement).registerStat();
public static Item EnderPouch = new EnderPouch(5051).setUnlocalizedName("EnderPouch").setTextureName("MiscCraft:EnderPouchPNG");
public static Item GoHome = new GoHome(5052).setUnlocalizedName("GoHome").setTextureName("MiscCraft:GoHomePNG");
public static Item ExpStorage = new ExpStorage(5053).setUnlocalizedName("ExpStorage").setTextureName("MiscCraft:ExpStoragePNG");
public static Block Wire = new Wire().setBlockName("Wire").setCreativeTab(WIPTab);
public static Block SolarPanel = new SolarPanel(Material.rock).setBlockName("SolarPanel").setBlockTextureName("MiscCraft:SolarPanelPNG");
public static Block Sprinkler = new Sprinkler(Material.iron).setBlockName("Sprinkler").setBlockTextureName("MiscCraft:SprinklerPNG");
public static Item QQQQ = new QQQQ(5054).setUnlocalizedName("QQQQ").setTextureName("MiscCraft:QQQQ");
public static Block Pipe = new Pipe().setBlockName("Pipe").setCreativeTab(MiscCraft.WIPTab);
public static IFuelHandler RubyFuel = new RubyFuel();
public static Block StillBase = new StillBase().setBlockName("StillBase").setCreativeTab(null).setBlockTextureName("MiscCraft:still_icon");
public static Item Beer = new Beer(10, false).setUnlocalizedName("Beer").setTextureName("MiscCraft:beer");
public static Block WineStill = new WineStill().setBlockName("WineStill").setBlockTextureName("MiscCraft:winestill_icon").setCreativeTab(WIPTab);
public static Block BeerStill = new BeerStill().setBlockName("BeerStill").setBlockTextureName("MiscCraft:beerstill_icon");
public static Item PineconeHelmet = new PineconeArmor(PineconeArmor, PineH, 0).setUnlocalizedName("PineconeHelmet").setTextureName("MiscCraft:PineconeHelmetPNG");
public static Item PineconeChestplate = new PineconeArmor(PineconeArmor, PineC, 1).setUnlocalizedName("PineconeChestplate").setTextureName("MiscCraft:PineconeChestplatePNG");
public static Item PineconeLeggings = new PineconeArmor(PineconeArmor, PineL, 2).setUnlocalizedName("PineconeLeggings").setTextureName("MiscCraft:PineconeLeggingsPNG");
public static Item PineconeBoots = new PineconeArmor(PineconeArmor, PineB, 3).setUnlocalizedName("PineconeBoots").setTextureName("MiscCraft:PineconeBootsPNG");
public static BiomeGenBase platinumorebiome = (new BiomePlatinumOre(100)).setBiomeName("PlatinumOreBiome");
public static Block Fertilizer = new Fertilizer().setBlockName("Fertilizer").setBlockTextureName("MiscCraft:Fertilizer");
public static Block WindmillBlock = new WindmillBlock(Material.ground).setBlockName("WindmillBlock").setBlockTextureName("MiscCraft:WindmillBlock");
public static Item WindmillItem = new WindmillItem().setUnlocalizedName("WindmillItem").setTextureName("MiscCraft:WindmillItem");
public static Block WindmillFloor = new WindmillFloor(Material.ground).setBlockName("WindmillFloor").setBlockTextureName("MiscCraft:WindmillFloor");
public static Block WindmillFloorPlaceHolder = new WindmillFloorPlaceholder(Material.ground).setBlockName("WindmillFloorPlaceholder").setBlockTextureName("dirt");
public static Block DirectionalBlock = new DirectionalBlock(Material.ground).setBlockName("DirectionalBlock").setBlockTextureName("MiscCraft:DirectionalBlock");
public static Block BullSummonBlock = new BullSummonBlock().setBlockName("BullSummonBlock");
public static Block RandomBlock = new DiamondRadar().setBlockName("RandomBlock");
public static Block SystemLights = new SystemLights().setBlockName("SystemLights");
public static Block FireHydrant = new FireHydrant().setBlockName("FireHydrant");
public static Block CraftingChest = new CraftingChest().setBlockName("CraftingChest");






public MiscCraft(){
		
		//Creative Tabs
		GameRegistry.registerItem(MiscCraftTabIcon, "MiscCraftTabIcon");
        GameRegistry.registerItem(WIPTabIcon, "WIPTabIcon");
		//blocks and Items
		GameRegistry.registerBlock(NewBlockTest, "NewBlockTest");
		GameRegistry.registerItem(EmeraldPickaxe, "EmeraldPickaxe");
		GameRegistry.registerItem(EmeraldSword, "EmeraldSword");
		GameRegistry.registerItem(EmeraldAxe, "EmeraldAxe");
		GameRegistry.registerItem(EmeraldShovel, "EmeraldShovel");
		GameRegistry.registerItem(EmeraldHoe, "EmeraldHoe");
        GameRegistry.registerItem(GodPickaxe, "GodPickaxe");
        GameRegistry.registerItem(GodSword, "GodSword");
        GameRegistry.registerItem(GodAxe, "GodAxe");
        GameRegistry.registerItem(GodShovel, "GodShovel");
        GameRegistry.registerItem(GodHoe, "GodHoe");
        GameRegistry.registerItem(RubyShard, "RubyShard");
		GameRegistry.registerItem(Ruby, "Ruby");
		GameRegistry.registerItem(RubyPickaxe, "RubyPickaxe");
		GameRegistry.registerItem(UltraStick, "UltraStick");
		GameRegistry.registerItem(RubySword, "RubySword");
		GameRegistry.registerItem(RubyHoe, "RubyHoe");
		GameRegistry.registerBlock(SapphireOre, "SapphireOre");
        GameRegistry.registerBlock(PlatinumOre, "PlatinumOre");
		GameRegistry.registerItem(RubyAxe, "RubyAxe");
		GameRegistry.registerItem(RubyShovel, "RubyShovel");
		GameRegistry.registerItem(Sapphire, "Sapphire");
		GameRegistry.registerItem(SapphirePickaxe, "SapphirePickaxe");
		GameRegistry.registerItem(SapphireShovel, "SapphireShovel");
		GameRegistry.registerItem(SapphireSword, "SapphireSword");
		GameRegistry.registerItem(SapphireHelmet, "SapphireHelmet");
		GameRegistry.registerItem(SapphireChestplate, "SapphireChestplate");
		GameRegistry.registerItem(SapphireLeggings, "SapphireLeggings");
		GameRegistry.registerItem(SapphireBoots, "SapphireBoots");
		GameRegistry.registerItem(AntiMetalIngot, "AntiMetalIngot");
		GameRegistry.registerItem(RubyHelmet, "RubyHelmet");
		GameRegistry.registerItem(RubyChestplate, "RubyChestplate");
		GameRegistry.registerItem(RubyLeggings, "RubyLeggings");
		GameRegistry.registerItem(RubyBoots, "RubyBoots");
        GameRegistry.registerItem(GodHelmet, "GodHelmet");
        GameRegistry.registerItem(GodChestplate, "GodChestplate");
        GameRegistry.registerItem(GodLeggings, "GodLeggings");
        GameRegistry.registerItem(GodBoots, "GodBoots");
        GameRegistry.registerItem(SapphireHoe, "SapphireHoe");
		GameRegistry.registerItem(SapphireAxe, "SapphireAxe");
		GameRegistry.registerItem(AntiMetalPickaxe, "AntiMetalPickaxe");
		GameRegistry.registerItem(AntiMetalSword, "AntiMetalSword");
		GameRegistry.registerItem(AntiMetalAxe, "AntiMetalAxe");
		GameRegistry.registerItem(FeatherDuster, "FeatherDuster");
		GameRegistry.registerItem(Chain, "Chain");
		GameRegistry.registerBlock(AntiOre, "AntiOre");
		GameRegistry.registerItem(RawAntiMetal, "RawAntiMetal");
		GameRegistry.registerItem(EnderDust, "EnderDust");
		GameRegistry.registerItem(StarDust, "StarDust");
		GameRegistry.registerBlock(NetherStarBlock, "NetherStarBlock");
		GameRegistry.registerItem(AntiMetalHelmet, "AntiMetalHelmet");
		GameRegistry.registerItem(AntiMetalChestplate, "AntiMetalChestplate");
		GameRegistry.registerItem(AntiMetalLeggings, "AntiMetalLeggings");
		GameRegistry.registerItem(AntiMetalBoots, "AntiMetalBoots");
		GameRegistry.registerItem(EnderDragonSpawnEgg,"EnderDragonSpawnEgg");
		GameRegistry.registerItem(OP_Sword, "OPSword");
		GameRegistry.registerItem(SapphireShard, "SapphireShard");
		GameRegistry.registerItem(TestFood, "TestFood");
		GameRegistry.registerItem(AntiMetalNugget, "AntiMetalNugget");
        GameRegistry.registerItem(PlatinumNugget, "PlatinumNugget");
		GameRegistry.registerTileEntity(TileEntitySapphireFurnace2.class, "SapphireFurnace");
        GameRegistry.registerTileEntity(TileEntitySolarPanel.class, "SolarPanel");
		GameRegistry.registerBlock(LandMine, "LandMine");
		GameRegistry.registerBlock(Alarm, "Alarm");
		GameRegistry.registerBlock(CompressedObsidian, "CompressedObsidian");
		GameRegistry.registerBlock(IndoTorch, "IndoTorch");
		GameRegistry.registerBlock(Spikes, "Spikes");
        GameRegistry.registerItem(Disabler, "Disabler");
        GameRegistry.registerBlock(LandMineGrass, "LandMineGrass");
        GameRegistry.registerBlock(LandMineStone, "LandMineStone");
        GameRegistry.registerBlock(LandMineCobblestone, "LandMineCobblestone");
        GameRegistry.registerBlock(LandMineDiamondBlock, "LandMineDiamondBlock");
        GameRegistry.registerBlock(LandMineGoldBlock, "LandMineGoldBlock");
        GameRegistry.registerBlock(LandMineIronBlock, "LandMineIronBlock");
        GameRegistry.registerBlock(LandMineRedstoneBlock, "LandMineRedstoneBlock");
        GameRegistry.registerBlock(LandMineLapisLazuilBlock, "LandMineLapisLazuilBlock");
        GameRegistry.registerBlock(LandMineEmeraldBlock, "LandMineEmeraldBlock");
        GameRegistry.registerBlock(LandMineCoalBlock, "LandMineCoalBlock");
        GameRegistry.registerBlock(AlarmGrass, "AlarmGrass");
        GameRegistry.registerBlock(AlarmStone, "AlarmStone");
        GameRegistry.registerBlock(AlarmCobblestone, "AlarmCobblestone");
        GameRegistry.registerBlock(AlarmDiamondBlock, "AlarmDiamondBlock");
        GameRegistry.registerBlock(AlarmGoldBlock, "AlarmGoldBlock");
        GameRegistry.registerBlock(AlarmIronBlock, "AlarmIronBlock");
        GameRegistry.registerBlock(AlarmRedstoneBlock, "AlarmRedstoneBlock");
        GameRegistry.registerBlock(AlarmLapisLazuliBlock, "AlarmLapisLazuilBlock");
        GameRegistry.registerBlock(AlarmEmeraldBlock, "AlarmEmeraldBlock");
        GameRegistry.registerBlock(AlarmCoalBlock, "AlarmCoalBlock");
        GameRegistry.registerBlock(RedDragonEgg, "RedDragonEgg");
        GameRegistry.registerBlock(BigBoom, "BigBoom");
        GameRegistry.registerBlock(PhantomBlock, "PhantomBlock");
        GameRegistry.registerItem(EmeraldHelmet, "EmeraldHelmet");
        GameRegistry.registerItem(EmeraldChestplate, "EmeraldChestplate");
        GameRegistry.registerItem(EmeraldLeggings, "EmeraldLeggings");
        GameRegistry.registerItem(EmeraldBoots, "EmeraldBoots");
        GameRegistry.registerItem(PlatinumIngot, "PlatinumIngot");
        GameRegistry.registerItem(PlatinumChunk, "PlatinumChunk");
        GameRegistry.registerBlock(RubyBlock, "RubyBlock");
        GameRegistry.registerBlock(SapphireBlock, "SapphireBlock");
        GameRegistry.registerBlock(AntiMetalBlock, "AntiMetalBlock");
        GameRegistry.registerBlock(PlatinumBlock, "PlatinumBlock");
        GameRegistry.registerItem(DiamondFeather, "DiamondFeather");
        GameRegistry.registerItem(FlightGiver, "FlightGiver");
        GameRegistry.registerItem(GodBow, "GodBow");
        GameRegistry.registerItem(EnderPouch, "EnderPouch");
        GameRegistry.registerItem(GoHome, "GoHome");
        GameRegistry.registerItem(ExpStorage, "ExpStorage");
        GameRegistry.registerBlock(Wire, "Wire");
        GameRegistry.registerBlock(SolarPanel, "SolarPanel");
        GameRegistry.registerBlock(Sprinkler, "Sprinkler");
        GameRegistry.registerItem(QQQQ, "QQQQ");
        GameRegistry.registerBlock(Pipe ,"Pipe");
        GameRegistry.registerTileEntity(TileEntityPipe.class, "Pipe");
        GameRegistry.registerFuelHandler(RubyFuel);
        GameRegistry.registerTileEntity(TileEntityWire.class, "Wire");
        GameRegistry.registerBlock(StillBase, "StillBase");
        GameRegistry.registerItem(Beer, "Beer");
       GameRegistry.registerTileEntity(TileEntityBeerStill.class, "BeerStill");
        GameRegistry.registerBlock(BeerStill, "BeerStill");
        GameRegistry.registerItem(PineconeHelmet, "PineconeHelmet");
        GameRegistry.registerItem(PineconeChestplate, "PineconeChestplate");
        GameRegistry.registerItem(PineconeLeggings, "PineconeLeggings");
        GameRegistry.registerItem(PineconeBoots, "PineconeBoots");
        GameRegistry.registerBlock(DirectionalBlock, "DirectionalBlock");
        GameRegistry.registerBlock(RandomBlock, "RandomBlock");
        GameRegistry.registerBlock(CraftingChest, "CraftingChest");
    
        
        /*
         * GameRegistry.registerBlock(Fertilizer, "Fertilizer");
         * TODO Make it Work!!!!
         */
        
        
        GameRegistry.registerBlock(WindmillBlock, "WindmillBlock");
        GameRegistry.registerItem(WindmillItem, "WindmillItem");
        GameRegistry.registerTileEntity(TileEntityWindmill.class, "Windmill");
        GameRegistry.registerBlock(WindmillFloor, "WindmillFloor");
        GameRegistry.registerBlock(WindmillFloorPlaceHolder, "WindmillFloorPlaceholder");
        GameRegistry.registerTileEntity(TileEntityBullSummonBlock.class, "BullSummonBlock");
        GameRegistry.registerBlock(BullSummonBlock, "BullSummonBlock");
        GameRegistry.registerBlock(SystemLights, "Lights");
        GameRegistry.registerBlock(FireHydrant, "FireHydrant");
        
        

    EntityRegistry.findGlobalUniqueEntityId();
    EntityRegistry.registerGlobalEntityID(EntityEnderMoaner.class, "Ender Moaner", EntityRegistry.findGlobalUniqueEntityId());
    EntityRegistry.addSpawn(EntityEnderMoaner.class, 20, 5, 15, EnumCreatureType.creature, BiomeGenBase.sky);
    EntityRegistry.findGlobalUniqueEntityId();
    registerEntityEgg(EntityEnderMoaner.class, 0x9900FF, 0xFFFFFF);

   

    EntityRegistry.findGlobalUniqueEntityId();
    EntityRegistry.registerGlobalEntityID(EntityBigBoomPrimed.class, "Big Boom Primed", EntityRegistry.findGlobalUniqueEntityId());
    EntityRegistry.findGlobalUniqueEntityId();


    EntityRegistry.findGlobalUniqueEntityId();
    EntityRegistry.registerGlobalEntityID(EntityCosmicBunny.class, "Cosmic Bunny", EntityRegistry.findGlobalUniqueEntityId());
    EntityRegistry.addSpawn(EntityCosmicBunny.class, 20, 5, 15, EnumCreatureType.monster, BiomeGenBase.extremeHills);

    registerEntityEgg(EntityCosmicBunny.class, 0xFFEE00, 0x0022FF);

    EntityRegistry.findGlobalUniqueEntityId();
    EntityRegistry.registerGlobalEntityID(EntityBoss.class, "Boss", EntityRegistry.findGlobalUniqueEntityId());


    registerEntityEgg(EntityBoss.class, 0x0040FF, 0x00FF59);

    EntityRegistry.findGlobalUniqueEntityId();
    EntityRegistry.registerGlobalEntityID(EntityBullBoss.class, "BullBoss", EntityRegistry.findGlobalUniqueEntityId());


    registerEntityEgg(EntityBullBoss.class, 0xFAFA00, 0xF50F0F);

    EntityRegistry.findGlobalUniqueEntityId();
    EntityRegistry.registerGlobalEntityID(EntityTamableBull.class, "TamableBull", EntityRegistry.findGlobalUniqueEntityId());


    registerEntityEgg(EntityTamableBull.class, 0xF50F0F, 0xEE25F5);

    EntityRegistry.findGlobalUniqueEntityId();
    EntityRegistry.registerGlobalEntityID(Entitydeadmau5.class, "deadmau5", EntityRegistry.findGlobalUniqueEntityId());

    EntityRegistry.addSpawn(Entitydeadmau5.class, 10, 5, 20, EnumCreatureType.creature, BiomeGenBase.hell );
    EntityRegistry.addSpawn(Entitydeadmau5.class, 10, 5, 20, EnumCreatureType.creature, BiomeGenBase.forest );
    EntityRegistry.addSpawn(Entitydeadmau5.class, 10, 5, 20, EnumCreatureType.creature, BiomeGenBase.desert );
    registerEntityEgg(Entitydeadmau5.class, 0xF50F0F, 0xEE25F5);
		

		

		
		
		//worldgen
		GameRegistry.registerWorldGenerator(worldgen1, 1);
		GameRegistry.registerWorldGenerator(worldgen2, 1);
		GameRegistry.registerWorldGenerator(worldgen3, 1);
        GameRegistry.registerWorldGenerator(worldgen4, 1);
		

		//recipes
		GameRegistry.addShapedRecipe(new ItemStack(EmeraldPickaxe, 1), new Object[] {
			"XXX", " Y ", " Y ", 'X', Items.emerald, 'Y', Items.stick
		});
		GameRegistry.addShapedRecipe(new ItemStack(EmeraldAxe, 1), new Object[] {
			"XX ", "XY ", " Y ", 'X', Items.emerald, 'Y', Items.stick
		});
		GameRegistry.addShapedRecipe(new ItemStack(EmeraldSword, 1), new Object[] {
			" X ", " X ", " Y ", 'X', Items.emerald, 'Y', Items.stick
		});
		GameRegistry.addShapedRecipe(new ItemStack(EmeraldHoe, 1), new Object[] {
			"XX ", " Y ", " Y ", 'X', Items.emerald, 'Y', Items.stick
		});
		GameRegistry.addShapedRecipe(new ItemStack(EmeraldShovel, 1), new Object[] {
			" X ", " Y ", " Y ", 'X', Items.emerald, 'Y', Items.stick
		});
		GameRegistry.addShapedRecipe(new ItemStack(Ruby, 1), new Object[] {
			"XXX", "XYX", "XXX", 'X', RubyShard, 'Y', Items.diamond
		});
    GameRegistry.addShapedRecipe(new ItemStack(Ruby, 1), new Object[] {
            "XXX", "XYX", "XXX", 'X', RubyShard, 'Y', Items.emerald
    });
		
		GameRegistry.addShapedRecipe(new ItemStack(RubyPickaxe, 1), new Object[] {
			"XXX", " Y ", " Y ", 'X', Ruby, 'Y', Items.stick
		});
		GameRegistry.addShapedRecipe(new ItemStack(UltraStick, 1), new Object[] {
			"XXX", "XYX", "XXX", 'X', Items.blaze_powder, 'Y', Items.stick
		});
		GameRegistry.addShapedRecipe(new ItemStack(RubySword, 1), new Object[] {
			" X ", " X ", " Y ", 'X', Ruby, 'Y', Items.stick
		});
	
		GameRegistry.addShapedRecipe(new ItemStack(RubyHoe, 1), new Object[] {
			"XX ", " Y ", " Y ", 'X', Ruby, 'Y', Items.stick
		});
		
		GameRegistry.addShapedRecipe(new ItemStack(RubyAxe, 1), new Object[] {
			"XX ", "XY ", " Y ", 'X', Ruby, 'Y', Items.stick
		});
		GameRegistry.addShapedRecipe(new ItemStack(RubyShovel, 1), new Object[] {
			" X ", " Y ", " Y ", 'X', Ruby, 'Y', Items.stick
		});
		GameRegistry.addShapedRecipe(new ItemStack(SapphirePickaxe, 1), new Object[] {
			"XXX", " Y ", " Y ", 'X', Sapphire, 'Y', UltraStick
		});
		GameRegistry.addShapedRecipe(new ItemStack(SapphireShovel, 1), new Object[] {
			" X ", " Y ", " Y ", 'X', Sapphire, 'Y', UltraStick
		});
		GameRegistry.addShapedRecipe(new ItemStack(SapphireSword, 1), new Object[] {
			" X ", " X ", " Y ", 'X', Sapphire, 'Y', UltraStick
		});
		GameRegistry.addShapedRecipe(new ItemStack(SapphireHelmet, 1), new Object[] {
			"XXX", "X X", 'X', Sapphire
		});
		GameRegistry.addShapedRecipe(new ItemStack(SapphireChestplate, 1), new Object[] {
			"X X", "XXX","XXX", 'X', Sapphire
		});
		GameRegistry.addShapedRecipe(new ItemStack(SapphireLeggings, 1), new Object[] {
			"XXX", "X X","X X", 'X', Sapphire
		});
		GameRegistry.addShapedRecipe(new ItemStack(SapphireBoots, 1), new Object[] {
			"X X", "X X", 'X', Sapphire
		});

        GameRegistry.addShapedRecipe(new ItemStack(EmeraldHelmet, 1), new Object[] {
            "XXX", "X X", 'X', Items.emerald
        });
        GameRegistry.addShapedRecipe(new ItemStack(EmeraldChestplate, 1), new Object[] {
            "X X", "XXX","XXX", 'X', Items.emerald
        });
        GameRegistry.addShapedRecipe(new ItemStack(EmeraldLeggings, 1), new Object[] {
            "XXX", "X X","X X", 'X', Items.emerald
        });
        GameRegistry.addShapedRecipe(new ItemStack(EmeraldBoots, 1), new Object[] {
            "X X", "X X", 'X', Items.emerald
        });

		GameRegistry.addShapedRecipe(new ItemStack(RubyHelmet, 1), new Object[] {
			"XXX", "X X", 'X', Ruby
		});
		GameRegistry.addShapedRecipe(new ItemStack(RubyChestplate, 1), new Object[] {
			"X X", "XXX", "XXX", 'X', Ruby
		});
		GameRegistry.addShapedRecipe(new ItemStack(RubyLeggings, 1), new Object[] {
			"XXX", "X X", "X X", 'X', Ruby
		});
		GameRegistry.addShapedRecipe(new ItemStack(RubyBoots, 1), new Object[] {
			"X X", "X X", 'X', Ruby
		});
		GameRegistry.addShapedRecipe(new ItemStack(SapphireHoe, 1), new Object[] {
			"XX ", " Y ", " Y ", 'X', Sapphire, 'Y', UltraStick
		});
		GameRegistry.addShapedRecipe(new ItemStack(SapphireAxe, 1), new Object[] {
			"XX ", "XY ", " Y ", 'X', Sapphire, 'Y', UltraStick
		});
		GameRegistry.addShapedRecipe(new ItemStack(AntiMetalPickaxe, 1), new Object[] {
			"XXX", " Y ", " Y ", 'X', AntiMetalIngot, 'Y', UltraStick
		});
		GameRegistry.addShapedRecipe(new ItemStack(AntiMetalSword, 1), new Object[] {
			" X ", " X ", " Y ", 'X', AntiMetalIngot, 'Y', UltraStick
		});

		GameRegistry.addShapedRecipe(new ItemStack(FeatherDuster, 1), new Object[] {
			"XYX", "XYX", " Y ", 'X', Items.feather, 'Y', Items.stick
		});
		GameRegistry.addShapelessRecipe(new ItemStack(Chain), Blocks.iron_bars);
		GameRegistry.addShapedRecipe(new ItemStack(Items.chainmail_chestplate, 1), new Object[] {
			"X X", "XXX", "XXX", 'X', Chain
		});
		GameRegistry.addShapedRecipe(new ItemStack(Items.chainmail_leggings, 1), new Object[] {
			"XXX", "X X", "X X", 'X', Chain
		});
		GameRegistry.addShapedRecipe(new ItemStack(Items.chainmail_helmet, 1), new Object[] {
			"XXX", "X X", 'X', Chain
		});
		GameRegistry.addShapedRecipe(new ItemStack(Items.chainmail_boots, 1), new Object[] {
			"X X", "X X",'X', Chain
		});
    GameRegistry.addShapedRecipe(new ItemStack(MiscCraft.SpawnTamableBull, 1), new Object[] {
            "XYX", "AZA","XYX", 'X', AntiMetalIngot, 'Y', EnderDust, 'Z', PlatinumChunk, 'A', StarDust
    });
		//Teporary(
		GameRegistry.addSmelting(RawAntiMetal, new ItemStack(AntiMetalIngot), 50);
		//)
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.dragon_egg, 1), new Object[] {
			"XYX", "YXY","XYX", 'X', EnderDust, 'Y', Blocks.end_stone
		});
		GameRegistry.addShapelessRecipe(new ItemStack(EnderDust), Items.ender_pearl);
		
		GameRegistry.addShapedRecipe(new ItemStack(Items.nether_star), "XYX", "YXY", "XYX", 'X', MiscCraft.StarDust, 'Y', Items.diamond);
	
	GameRegistry.addShapedRecipe(new ItemStack(AntiMetalHelmet, 1), new Object[] {
	"XXX", "X X", 'X', AntiMetalIngot
});
GameRegistry.addShapedRecipe(new ItemStack(AntiMetalChestplate, 1), new Object[] {
	"X X", "XXX","XXX", 'X', AntiMetalIngot
});
GameRegistry.addShapedRecipe(new ItemStack(AntiMetalLeggings, 1), new Object[] {
	"XXX", "X X","X X", 'X', AntiMetalIngot
});
GameRegistry.addShapedRecipe(new ItemStack(AntiMetalBoots, 1), new Object[] {
	"X X", "X X", 'X', AntiMetalIngot
});
GameRegistry.addShapedRecipe(new ItemStack(NetherStarBlock, 1), new Object[] {
	"XXX", "XXX", "XXX",'X', Items.nether_star
});

GameRegistry.addShapedRecipe(new ItemStack(Sapphire, 1), new Object[] {
	"XXX", "XYX","XXX", 'X', SapphireShard, 'Y', Ruby
});
GameRegistry.addShapedRecipe(new ItemStack(EnderDragonSpawnEgg, 1), new Object[] {
	"XXX", "XYX","XXX", 'X', AntiMetalIngot, 'Y', Sapphire
});
GameRegistry.addShapedRecipe(new ItemStack(TestFood, 1, 2), new Object[] {
	"XYZ", "QMJ","KOP", 'X', Blocks.diamond_ore, 'Y', Blocks.gold_ore, 'Z', Blocks.iron_ore, 'Q',Blocks.coal_ore, 'J', Blocks.redstone_ore, 'K', Blocks.lapis_ore, 'O', Blocks.emerald_ore, 'P', Blocks.obsidian, 'M', Items.diamond_pickaxe
});
GameRegistry.addShapedRecipe(new ItemStack(RawAntiMetal, 1), new Object[] {
	"XXX", "XXX","XXX", 'X', AntiMetalNugget
});
GameRegistry.addShapedRecipe(new ItemStack(LandMine, 3), new Object[] {
	"XXX", "YYY","XXX", 'X', Blocks.obsidian, 'Y', Blocks.tnt
});
GameRegistry.addShapedRecipe(new ItemStack(Items.saddle, 1), new Object[] {
	"XZX", "Y Y", 'X', Items.leather, 'Y', Blocks.wool, 'Z', Items.lead
});
GameRegistry.addShapedRecipe(new ItemStack(MiscCraft.Alarm, 1), new Object[] {
	"XXX", "XYX","ZAZ" ,'X', Blocks.obsidian, 'Y', Blocks.wooden_pressure_plate, 'Z', Items.redstone, 'A', MiscCraft.CompressedObsidian
});
GameRegistry.addShapedRecipe(new ItemStack(MiscCraft.IndoTorch, 4), new Object[] {
	"XXX", "XAX","XXX" ,'X', Blocks.obsidian,  'A', Blocks.torch
});
    GameRegistry.addShapedRecipe(new ItemStack(MiscCraft.Spikes, 4), new Object[] {
            " X ", "XXX","XXX" ,'X', Items.iron_ingot
    });
    GameRegistry.addShapedRecipe(new ItemStack(MiscCraft.PlatinumBlock, 1), new Object[] {
            "XXX", "XXX","XXX" ,'X', MiscCraft.PlatinumIngot
    });
    GameRegistry.addShapedRecipe(new ItemStack(MiscCraft.RubyBlock, 1), new Object[] {
            "XXX", "XXX","XXX" ,'X', MiscCraft.Ruby
    });
    GameRegistry.addShapedRecipe(new ItemStack(MiscCraft.SapphireBlock, 1), new Object[] {
            "XXX", "XXX","XXX" ,'X', MiscCraft.Sapphire
    });
    GameRegistry.addShapedRecipe(new ItemStack(MiscCraft.AntiMetalBlock, 1), new Object[] {
            "XXX", "XXX","XXX" ,'X', MiscCraft.AntiMetalIngot
    });
    GameRegistry.addShapedRecipe(new ItemStack(MiscCraft.PlatinumChunk, 1), new Object[] {
            "XX ", "XX ",'X', MiscCraft.PlatinumNugget
    });
    GameRegistry.addShapedRecipe(new ItemStack(MiscCraft.PlatinumChunk, 1), new Object[] {
            " XX", " XX",'X', MiscCraft.PlatinumNugget
    });
    GameRegistry.addShapedRecipe(new ItemStack(MiscCraft.PlatinumIngot, 1), new Object[] {
            "XXX", "XXX","XXX" ,'X', MiscCraft.PlatinumChunk
    });
    GameRegistry.addShapedRecipe(new ItemStack(MiscCraft.AntiMetalBlock, 1), new Object[] {
            "XXX", "XXX","XXX" ,'X', MiscCraft.AntiMetalIngot
    });
    GameRegistry.addShapedRecipe(new ItemStack(MiscCraft.GodHelmet, 1), new Object[] {
            "XBX", "AYA","XXX" ,'X', MiscCraft.PlatinumIngot, 'Y', MiscCraft.AntiMetalHelmet, 'A', MiscCraft.Sapphire, 'B', Items.diamond
    });
    GameRegistry.addShapedRecipe(new ItemStack(MiscCraft.GodChestplate, 1), new Object[] {
            "XBX", "AYA","XXX" ,'X', MiscCraft.PlatinumIngot, 'Y', MiscCraft.AntiMetalChestplate, 'A', MiscCraft.Sapphire, 'B', Items.diamond
    });
    GameRegistry.addShapedRecipe(new ItemStack(MiscCraft.GodLeggings, 1), new Object[] {
            "XBX", "AYA","XXX" ,'X', MiscCraft.PlatinumIngot, 'Y', MiscCraft.AntiMetalLeggings, 'A', MiscCraft.Sapphire, 'B', Items.diamond
    });
    GameRegistry.addShapedRecipe(new ItemStack(MiscCraft.GodBoots, 1), new Object[] {
            "XBX", "AYA","XXX" ,'X', MiscCraft.PlatinumIngot, 'Y', MiscCraft.AntiMetalBoots, 'A', MiscCraft.Sapphire, 'B', Items.diamond
    });
    GameRegistry.addShapedRecipe(new ItemStack(GodPickaxe, 1), new Object[] {
            "XAX", " Y ", " Y ", 'X', PlatinumIngot, 'Y', UltraStick, 'A', MiscCraft.Sapphire
    });
    GameRegistry.addShapedRecipe(new ItemStack(GodHoe, 1), new Object[] {
            "XA ", " Y ", " Y ", 'X', PlatinumIngot, 'Y', UltraStick, 'A', MiscCraft.Sapphire
    });
    GameRegistry.addShapedRecipe(new ItemStack(GodAxe, 1), new Object[] {
            "AX ", "XY ", " Y ", 'X', PlatinumIngot, 'Y', UltraStick, 'A', MiscCraft.Sapphire
    });
    GameRegistry.addShapedRecipe(new ItemStack(GodSword, 1), new Object[] {
            " X ", " A ", " Y ", 'X', PlatinumIngot, 'Y', UltraStick, 'A', MiscCraft.Sapphire
    });
    GameRegistry.addShapedRecipe(new ItemStack(GodShovel, 1), new Object[] {
            " X ", " Y ", " Y ", 'X', PlatinumIngot, 'Y', UltraStick
    });
    GameRegistry.addShapedRecipe(new ItemStack(DiamondFeather, 1), new Object[] {
            "XXX", "XYX", "XXX", 'X', Items.diamond, 'Y', Items.feather
    });
    GameRegistry.addShapedRecipe(new ItemStack(FlightGiver, 1), new Object[] {
            "XZX", "ZYZ", "XZX", 'X', PlatinumIngot, 'Y', DiamondFeather, 'Z', AntiMetalIngot
    });
    GameRegistry.addShapedRecipe(new ItemStack(GodBow, 1), new Object[] {
            " XY", "X Y", " XY", 'X', PlatinumIngot, 'Y', Items.string
    });
    GameRegistry.addShapedRecipe(new ItemStack(EnderPouch, 1), new Object[] {
            "ZZZ", "XYX", "XXX", 'X', Items.leather, 'Y', Blocks.ender_chest, 'Z', Items.string
    });
    GameRegistry.addShapedRecipe(new ItemStack(GoHome, 1), new Object[] {
            "XZX", "ZYZ", "XZX", 'X', EnderDust, 'Y', Items.wooden_door, 'Z', Blocks.torch
    });
    GameRegistry.addShapedRecipe(new ItemStack(ExpStorage, 1), new Object[] {
            " Z ", "YXY", "YYY", 'X', Items.glass_bottle, 'Y', Items.iron_ingot, 'Z', Blocks.hopper
    });
    GameRegistry.addShapedRecipe(new ItemStack(Wire, 4), new Object[] {
            "XYX", 'X', Blocks.wool, 'Y', MiscCraft.AntiMetalIngot
    });
    GameRegistry.addShapedRecipe(new ItemStack(BullSummonBlock, 1), new Object[] {
        "XYX", "YZY", "XYX",'X', MiscCraft.EnderDust, 'Y', MiscCraft.StarDust, 'Z', MiscCraft.Sapphire
    });
    GameRegistry.addShapedRecipe(new ItemStack(FireHydrant, 1), new Object[] {
            "XYX", "YZY", "XYX",'X', Items.water_bucket, 'Y', Items.iron_ingot, 'Z', MiscCraft.Ruby
    });
    GameRegistry.addShapedRecipe(new ItemStack(CraftingChest, 1), new Object[] {
        "XXX", "YZY", "XXX",'X', Items.slime_ball, 'Y', Blocks.chest, 'Z', Blocks.crafting_table
});


    GameRegistry.addShapelessRecipe(new ItemStack(LandMineGrass, 1), Blocks.grass, MiscCraft.LandMine);


    GameRegistry.addShapelessRecipe(new ItemStack(AntiMetalIngot, 9), AntiMetalBlock);
    GameRegistry.addShapelessRecipe(new ItemStack(Sapphire, 9), SapphireBlock);
    GameRegistry.addShapelessRecipe(new ItemStack(PlatinumIngot, 9), PlatinumBlock);
    GameRegistry.addShapelessRecipe(new ItemStack(Ruby, 9), RubyBlock);


    GameRegistry.addShapelessRecipe(new ItemStack(LandMineStone, 1), Blocks.stone, MiscCraft.LandMine);
    GameRegistry.addShapelessRecipe(new ItemStack(LandMineDiamondBlock, 1), Items.diamond, MiscCraft.LandMine);
    GameRegistry.addShapelessRecipe(new ItemStack(LandMineGoldBlock, 1),Items.gold_ingot, MiscCraft.LandMine);
    GameRegistry.addShapelessRecipe(new ItemStack(LandMineIronBlock, 1), Items.iron_ingot, MiscCraft.LandMine);
    GameRegistry.addShapelessRecipe(new ItemStack(LandMineRedstoneBlock, 1), Items.redstone, MiscCraft.LandMine);
    GameRegistry.addShapelessRecipe(new ItemStack(LandMineCobblestone, 1), Blocks.cobblestone, MiscCraft.LandMine);
    GameRegistry.addShapelessRecipe(new ItemStack(LandMineLapisLazuilBlock, 1), Items.dye, MiscCraft.LandMine);
    GameRegistry.addShapelessRecipe(new ItemStack(LandMineCoalBlock, 1), Items.coal, MiscCraft.LandMine);
    GameRegistry.addShapelessRecipe(new ItemStack(LandMineEmeraldBlock, 1), Items.emerald, MiscCraft.LandMine);

    GameRegistry.addShapelessRecipe(new ItemStack(AlarmGrass, 1), Blocks.grass, MiscCraft.Alarm);
    GameRegistry.addShapelessRecipe(new ItemStack(AlarmStone, 1), Blocks.stone, MiscCraft.Alarm);
    GameRegistry.addShapelessRecipe(new ItemStack(AlarmDiamondBlock, 1), Items.diamond, MiscCraft.Alarm);
    GameRegistry.addShapelessRecipe(new ItemStack(AlarmGoldBlock, 1),Items.gold_ingot, MiscCraft.Alarm);
    GameRegistry.addShapelessRecipe(new ItemStack(AlarmIronBlock, 1), Items.iron_ingot, MiscCraft.Alarm);
    GameRegistry.addShapelessRecipe(new ItemStack(AlarmRedstoneBlock, 1), Items.redstone, MiscCraft.Alarm);
    GameRegistry.addShapelessRecipe(new ItemStack(AlarmCobblestone, 1), Blocks.cobblestone, MiscCraft.Alarm);
    GameRegistry.addShapelessRecipe(new ItemStack(AlarmLapisLazuliBlock, 1), new ItemStack(Items.dye, 4), MiscCraft.Alarm);
    GameRegistry.addShapelessRecipe(new ItemStack(AlarmCoalBlock, 1), Items.coal, MiscCraft.Alarm);
    GameRegistry.addShapelessRecipe(new ItemStack(AlarmEmeraldBlock, 1), Items.emerald, MiscCraft.Alarm);
}





    private void registerEntityEgg(Class<? extends Entity> entity, int primaryColor, int secondaryColor) {
		int id = getUniqueEntityId();
		EntityList.IDtoClassMapping.put(id, entity);
		EntityList.entityEggs.put(id, new EntityEggInfo(id, primaryColor, secondaryColor));
		
		
	}
	
	
	public static int getUniqueEntityId() {
		do {
			startEntityId++;
		}
		while(EntityList.getStringFromID(startEntityId) != null);
		return startEntityId++;
	}




	@EventHandler
	public void load(FMLInitializationEvent event) {
		
		proxy.RenderInformation();

		NetworkRegistry.INSTANCE.registerGuiHandler(this, new MiscCraftGUIHandler());
        AchievementPage.registerAchievementPage(new AchievementPage("MiscCraft", new Achievement[]{PlatinumIngotAchievement, GodAxeAchievement, GodPickaxeAchievement, GodSwordAchievement, GodShovelAchievement, GodHoeAchievement, FlightAchievement, GodChestplateAchievement, GodHelmetAchievement, GodLeggingsAchievement, GodBootsAchievement, GodBowAchievement, SapphireAchievement, RubyAchievement, AntiMetalIngotAchievement}));
        FMLCommonHandler.instance().bus().register(new OnSmeltEvent());
        MinecraftForge.EVENT_BUS.register(new WindmillHighlightEvent());
        FMLCommonHandler.instance().bus().register(new OnCraftEvent());
        BiomeDictionary.registerBiomeType(platinumorebiome, BiomeDictionary.Type.MOUNTAIN);
        BiomeManager.addSpawnBiome(platinumorebiome);





    }
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		MiscCraftConfig.initProps(event.getModConfigurationDirectory());
		 BiomeDictionary.registerBiomeType(platinumorebiome, BiomeDictionary.Type.MOUNTAIN);
	        BiomeManager.addSpawnBiome(platinumorebiome);
	        BiomeManager.warmBiomes.add(new BiomeEntry(platinumorebiome, 100));
	        BiomeDictionary.registerAllBiomesAndGenerateEvents();
        DimensionManager.registerProviderType(-2, WorldProviderPlatinum.class, false);
        DimensionManager.registerDimension(-2, -2);
        

	}
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
    	MinecraftForge.EVENT_BUS.register(new WindmillHighlightEvent());
       
        
        


    }

	
	
	
	
}
	
