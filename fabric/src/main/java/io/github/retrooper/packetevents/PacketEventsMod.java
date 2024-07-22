package io.github.retrooper.packetevents;

import com.github.retrooper.packetevents.PacketEvents;
import com.github.retrooper.packetevents.event.*;
import com.github.retrooper.packetevents.protocol.packettype.PacketType;
import com.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientChatMessage;
import com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerChatMessage;
import com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerKeepAlive;
import io.github.retrooper.packetevents.factory.fabric.FabricPacketEventsBuilder;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.entrypoint.PreLaunchEntrypoint;
import net.minecraft.client.Minecraft;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.network.chat.contents.PlainTextContents;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PacketEventsMod implements PreLaunchEntrypoint, ModInitializer {
    // This logger is used to write text to the console and the log file.
    // It is considered best practice to use your mod id as the logger's name.
    // That way, it's clear which mod wrote info, warnings, and errors.
    public static final Logger LOGGER = LoggerFactory.getLogger("packetevents");

    @Override
    public void onPreLaunch() {
        PacketEvents.setAPI(FabricPacketEventsBuilder.build("packetevents"));
        //PacketEvents.getAPI().getSettings().debug(true);
        PacketEvents.getAPI().load();
    }

    @Override
    public void onInitialize() {
        PacketEvents.getAPI().init();
    }
}
