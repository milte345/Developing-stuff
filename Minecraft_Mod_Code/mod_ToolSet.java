package net.minecraft.src;

public class mod_ToolSet extends BaseMod
{
   public static final Item Sledgehammer = new ItemSword(1004, EnumToolMaterial.WOOD).setItemName("5");
      
	public mod_ToolSet()
	{
		Sledgehammer.iconIndex = ModLoader.addOverride("/gui/items.png", "/Sledgehammer.png");
		ModLoader.AddName(Sledgehammer, "Sledgehammer");
   		ModLoader.AddRecipe(new ItemStack(Sledgehammer, 1), new Object[] {
                " X ", " X ", " | ", Character.valueOf('X'), Block.dirt, Character.valueOf('|'), Item.stick
        });
	}

 public String Version()
   {
   return "1.8.1";
   }

}