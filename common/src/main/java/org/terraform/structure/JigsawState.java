package org.terraform.structure;

import org.terraform.data.SimpleChunkLocation;
import org.terraform.data.SimpleLocation;
import org.terraform.structure.room.RoomLayoutGenerator;
import org.terraform.structure.room.RoomPopulatorAbstract;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * This class will hold the runtime state for each unique structure
 * at each unique position. Upon initialisation, calculate path locations
 * and room locations.
 */
public class JigsawState {

    //This will hold the room coordinates.
    //Lowest index generates first.
    public final ArrayList<RoomLayoutGenerator> roomPopulatorStates = new ArrayList<>();


}