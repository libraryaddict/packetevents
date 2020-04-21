package me.purplex.packetevents;

import me.purplex.packetevents.events.manager.PacketManager;

public class PacketEvents {
    private static PacketManager packetManager;


    public static PacketManager getPacketManager() {
        if(packetManager == null) {
            packetManager = new PacketManager();
        }
        return packetManager;
    }
}
