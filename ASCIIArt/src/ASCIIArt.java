public class ASCIIArt 
{
	public static void sceneryTop()
	//Creates the top of trees and mountains
	{
		System.out.println("           /                 \\                       /                 \\         ");
		System.out.println("      /\\  /         /\\        \\   /\\            /\\  /         /\\        \\   /\\");
		System.out.println("     /  \\/         /  \\        \\ /  \\          /  \\/         /  \\        \\ /  \\");
		System.out.println("    /    \\        /    \\        /    \\        /    \\        /    \\        /    \\");
		System.out.println("   /      \\      /      \\      /      \\      /      \\      /      \\      /      \\");
	}
	
	public static void treeTrunks()
	//Creates the base of the trees
	{
		System.out.println("   *--| |--*     *--| |--*     *--| |--*     *--| |--*     *--| |--*     *--| |--*");
	}
	public static void road()
	//Creates a road for cars
	{
		System.out.println("________________________________________________________________________________\n\n");
		System.out.println("---   ---   ---   ---   ---   ---   ---   ---   ---   ---   ---   ---   ---   ---");
		System.out.println("\n________________________________________________________________________________");
	}
	public static void houseWallRow1()
	//Creates the walls for a row of houses
	{
		 System.out.println(" |             |     |             |     |             |     |             |   ");
	}
	public static void houseWallRow2()
	//Doubles the lengths of the walls for a row of houses
	{
		houseWallRow1();
		houseWallRow1();
	}
	public static void sidewalk()
	//Creates a sidewalk
	{
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println("    *\"    *\"    *\"    *\"    *\"    *\"    *\"    *\"    *\"    *\"    *\"    *\"    *\"");
		System.out.println("   *\"   *\"   *\"   *\"   *\"   *\"   *\"   *\"   *\"   *\"   *\"   *\"   *\"   *\"   *\"");
		System.out.println("---------------------------------------------------------------------------------");
	}

	public static void houseRow()
	//Creates a row of 4 houses
	{
		System.out.println("   _II________         _II________         _II________         _II________");
		System.out.println("  /-----------\\       /-----------\\       /-----------\\       /-----------\\   ");
		System.out.println(" /-------------\\     /-------------\\     /-------------\\     /-------------\\ ");
		System.out.println("/_______________\\   /_______________\\   /_______________\\   /_______________\\");
		houseWallRow2();
		System.out.println("");
	}
	
	public static void forest()
	//Creates a forest with mountains in the background
	{
		sceneryTop();
		treeTrunks();
	}
	
	public static void Snowyville()
	//Creates a small town featuring a forest and 8 houses with side walks
	{
		forest();
		sidewalk();
		road();
		houseRow();
		houseRow();
		road();
		sidewalk();
	}

	public static void main(String[] args) 
	//Creates the town of Snowyville with a beautiful caption!!
	{
	Snowyville();
	System.out.println("Snowyville, the toun that lies beneath the legendary Arzic Mountains!");
	System.out.println("You plan on going up there you say? You're quite brave!");
	System.out.println("It'll be a long journey so make sure you're prepared!");
	}

}
