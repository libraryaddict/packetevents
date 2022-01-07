/*
 * This file is part of packetevents - https://github.com/retrooper/packetevents
 * Copyright (C) 2021 retrooper and contributors
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.github.retrooper.packetevents.event;

import com.github.retrooper.packetevents.event.impl.*;

import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;

/**
 * Abstract packet listener.
 *
 * @author retrooper
 * @since 1.8
 */
public abstract class PacketListenerAbstract {
    protected final Map<Byte, List<Method>> methods;
    private final PacketListenerPriority priority;
    private boolean readOnly;
    private boolean preProcessed;
    public PacketListenerAbstract(PacketListenerPriority priority) {
        this.priority = priority;
        this.methods = null;
    }

    public PacketListenerAbstract(PacketListenerPriority priority, boolean readOnly) {
        this.priority = priority;
        this.methods = null;
        this.readOnly = readOnly;
    }

    public PacketListenerAbstract(PacketListenerPriority priority, boolean readOnly, boolean preProcessed) {
        this.priority = priority;
        this.methods = null;
        this.readOnly = readOnly;
        this.preProcessed = preProcessed;
    }

    public PacketListenerAbstract(PacketListenerPriority priority, Map<Byte, List<Method>> methods) {
        this.priority = priority;
        this.methods = methods;
    }

    public PacketListenerAbstract(PacketListenerPriority priority, Map<Byte, List<Method>> methods, boolean readOnly) {
        this.priority = priority;
        this.methods = methods;
        this.readOnly = readOnly;
    }

    public PacketListenerAbstract(PacketListenerPriority priority, Map<Byte, List<Method>> methods, boolean readOnly, boolean preProcessed) {
        this.priority = priority;
        this.methods = methods;
        this.readOnly = readOnly;
        this.preProcessed = preProcessed;
    }


    public PacketListenerAbstract() {
        this.priority = PacketListenerPriority.NORMAL;
        this.methods = null;
    }

    public PacketListenerPriority getPriority() {
        return priority;
    }

    public boolean isReadOnly() {
        return readOnly;
    }

    public void setReadOnly(boolean readOnly) {
        this.readOnly = readOnly;
    }

    public boolean isPreProcessed() {
        return preProcessed;
    }

    public void setPreProcessed(boolean preProcess) {
        this.preProcessed = preProcess;
    }

    public void onPlayerInject(PlayerInjectEvent event) {
    }

    public void onPostPlayerInject(PostPlayerInjectEvent event) {
    }

    public void onPlayerEject(PlayerEjectEvent event) {
    }

    public void onPacketReceive(PacketReceiveEvent event) {
    }

    public void onPacketSend(PacketSendEvent event) {
    }

    public void onPacketEventExternal(PacketEvent event) {
    }

}
