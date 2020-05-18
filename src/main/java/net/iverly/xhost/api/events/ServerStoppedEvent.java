package net.iverly.xhost.api.events;

import net.iverly.xhost.api.XServer;
import net.md_5.bungee.api.plugin.Event;
import org.jetbrains.annotations.NotNull;

public class ServerStoppedEvent extends Event {

    public ServerStoppedEvent(@NotNull XServer server) {}

    @NotNull
    public XServer getServer() { return null; }

}
