package org.terraform.structure.warmoceanruins;

import org.terraform.coregen.populatordata.PopulatorDataAbstract;
import org.terraform.structure.room.CubeRoom;
import org.terraform.structure.small.DesertWellPopulator;

import java.util.Random;

public class WarmOceanWellRoom extends WarmOceanBaseRoom{
    public WarmOceanWellRoom(Random rand, boolean forceSpawn, boolean unique) {
        super(rand, forceSpawn, unique);
    }


    @Override
    public void populate(PopulatorDataAbstract data, CubeRoom room) {
        super.populate(data, room);
        new DesertWellPopulator().spawnDesertWell(data.getTerraformWorld(), rand,
                data, room.getX(), room.getY()-1, room.getZ(), false);
    }

    @Override
    public boolean canPopulate(CubeRoom room) {
        return room.getWidthX()<25;
    }
}
