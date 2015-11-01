package crl.levelgen.patterns;

import java.util.Hashtable;

import crl.levelgen.MonsterSpawnInfo;

public class CastleBridge extends StaticPattern{
	public String getMapKey(){
		return "BRIDGE";
	}
	
	public String getDescription() {
		return "Castle Bridge";
	}

	public String getMusicKeyMorning() {
		return "CASTLE_BRIDGE";
	}

	public String getMusicKeyNoon() {
		return null;
	}

	public CastleBridge(){
		this.cellMap = new String [][]{
				{
			"tttttttttt~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~wwwwwwwwwwwwwww",
			"ttttttttt~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~..............w",
			"tttttttt~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~............w",
			"tttt~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~...........w",
			"tt~~~~tt~~~~~~~~~~~~~~~~~~~~x~~~~~~~~~~~~~~~~~~~~~x~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~...w",
			"tt~~~tt~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~x~~~~~~~~~~~~~~~~~~~~~x~~~.~.w",
			"ttuuttt~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~...w",
			"ttuuttt~~~~~~~~~x~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~x~~~~~~~~~~~~~~w",
			"t...tt~~~~~~~~~~~~~~~M~~~~~~~~~~~~~~~~~~M~~~~~~~~~~~~~~~~~~~~~~~M~~~~~~~~~~~~~~~~~~~~~~~M~~~~~~~~~~~~~.w",
			"tt.......~~~~~~~~~~~~~~~~~~......X...~~~~~~~~~~~~~~~~~~~....X.....~~~~~~~~~...~~~~.....~~~~~~~~~~~~~~..w",
			"t...................~~~~....X....X......~~~x~~~x~~~x..........X.....~~......X......X......~~...........w",
			"T...................ssss................ssssssssssss.....X..X...X...~~........~~~~.X......~~...........E",
			"t...................~~~~....X....X......~~~x~~~x~~~x..........X.....~~......X......X......~~...........w",
			"t.......~~~~~~~~~~~~~~~~~~~......X...~~~~~~~~~~~~~~~~~~~....X.....~~~~~~~~~...~~~~.....~~~~~~~~~~~~~~~.w",
			"ttuutt~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~.w",
			"tuuuutt~~~~~~~~~x~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~M~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~x~~~~~~~~~~~~~~w",
			"t,~~~~t~~~~~~~~~~~~~~~M~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~wwww~~~~~~~~~~~~~~~~~M~~~~~~~~~~~~~~~~~~~~~~~~~w",
			"t,,~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ww~~ww~~~~~~~~~~~~~x~~~~~~~~~~~~~~~~~~~~~x~~~~~~w",
			"tt~~~~~~~~~~~~~~~~~~~~~~~~~~x~~~~~~~~~~~~~~~~~~~~~x~~~~w~~~~w~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~,w",
			"t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ww~~ww~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~w",
			"t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~wwww~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~w",
			"t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~",
			"t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
		},
		{
			"tttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttwwttttttttttttttttttwww",
			"ttttttttt----------------------------------------------------------------------------w-----------wwwttww",
			"ttttttt------------------------------------------------------------------------------------wwww-------ww",
			"ttttt-----------------------------------------------------------------------------------------wwwwww---w",
			"tttt------------------------x---------------------x------------------------------------------------ww-ww",
			"tttttt--------------------------------------------------------------------x---------------------x---w->w",
			"ttttttt---------------------------------------------------------------------------------------------wwww",
			"tttt------------x-----------------------------------------------------------------------x--------------w",
			"ttt----------------------------------------------------------------------------------------------------w",
			"tt--------------------------------x----------------------x--x--x------------x--x--x--x-----------------w",
			"tt-------x------x------------x-------------x---x---x--------------------------------------------------ww",
			"ttt--------------------------------------------------------------x---------------------------x---x--x-ww",
			"ttt------x------x------------x-------------x---x---x--------------------------------------------------ww",
			"ttttttt---------------------------x----------------------x--x--x------------x--x--x--x----------------ww",
			"ttttttt------------------------------------------------------------------------------------------------w",
			"tttt------------x----------------------------------------xx-----------------------------x--------------w",
			"tt-----------------------------------------------------x----x------------------------------------------w",
			"ttt----------------------------------------------------x----x-------------x---------------------x------w",
			"tttttt----------------------x---------------------x------xx-------------------------------tt----------ww",
			"tttttttttt---------------------------------------------------------------------------------------------w",
			"ttttttttt-----------------------------------------------------------------------------ttt------------www",
			"ttttttttttt---ttttttt----------------------------------ttttttttttwwwttttwwwwwwwwwwwwwtwwww----------wwww",
			"tttttttttttttttttt--ttttttttttttttttttttttttttttttttttttt----------wwwwww-----ttttttt-wwwwwwwwwwwwwwwwww"
		}};
		
		charMap.put("t", "FOREST_TREE");
		charMap.put(".", "BRIDGE_WALKWAY");
		charMap.put("T", "BRIDGE_WALKWAY EXIT _BACK");
		charMap.put(",", "FOREST_GRASS");
		charMap.put("w", "GARDEN_WALL");
		charMap.put("x", "BRIDGE_COLUMN");
		charMap.put("X", "STONE_BLOCK");
		charMap.put("s", "WOODEN_BRIDGE");
		charMap.put("~", "DARK_LAKE_ETH");
		charMap.put("-", "DARK_LAKE");
		charMap.put("u", "DARK_LAKE_ETH_STAIR");
		charMap.put(">", "LAKE_STAIRSUP");
		charMap.put("<", "DARK_LAKE_ETH");
		charMap.put("M", "DARK_LAKE_ETH MONSTER MERMAN");
		charMap.put("E", "BRIDGE_WALKWAY EXIT _NEXT");
		
		spawnInfo = new MonsterSpawnInfo []{
			new MonsterSpawnInfo("MERMAN", MonsterSpawnInfo.WATER, 85)
		};
	}
	
	public MonsterSpawnInfo[] getDwellers(){
		return new MonsterSpawnInfo[]{
			new MonsterSpawnInfo("R_SKELETON", MonsterSpawnInfo.UNDERGROUND, 80),
			new MonsterSpawnInfo("MERMAN", MonsterSpawnInfo.WATER, 20),
		};
	}
	
	public boolean isRutinary() {
		return true;
	}
	
}