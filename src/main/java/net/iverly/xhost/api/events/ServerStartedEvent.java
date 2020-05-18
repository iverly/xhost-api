package net.iverly.xhost.api.events;

import net.iverly.xhost.api.XServer;
import net.md_5.bungee.api.plugin.Event;
import org.jetbrains.annotations.NotNull;

public class ServerStartedEvent extends Event {

    public ServerStartedEvent(@NotNull XServer server) {}

    @NotNull
    public XServer getServer() { return null; }

}