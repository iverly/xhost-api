package net.iverly.xhost.api;

import com.sun.istack.internal.NotNull;
import net.md_5.bungee.api.config.ServerInfo;

import java.util.HashMap;

/**
 * @author iverly on 03/05/2020
 * @project xhost-api
 */
public class XServer {

    /**
     * XServer represent a Minecraft server
     *
     * @param name Name registered on BungeeCord and Docker need to be unique
     * @param port Port exposed to host, need to be not used
     */
    public XServer(@NotNull String name, @NotNull int port) {}

    /**
     * XServer represent a Minecraft server
     *
     * @param name Name registered on BungeeCord and Docker need to be unique
     */
    public XServer(@NotNull String name) {}

    /**
     * Set informations about server
     *
     * @param jarName Path to your server jar from your pathFile of Node
     * @param serverFiles HashMap representing the server files, key is the path on your host and value is the path in the server
     * @param serverEnvironment HashMap representing the server environment, you can see the list on the Wiki
     */
    public void setInformations(@NotNull String jarName, @NotNull HashMap<String, String> serverFiles, @NotNull HashMap<String, String> serverEnvironment) {}

    /**
     * Return the name of the server
     *
     * @return name of the server
     */
    @NotNull
    public String getName() { return null; }

    /**
     * Return the port of the server, if you are not using exposed port, this will return you 25565
     *
     * @return port of the server
     */
    @NotNull
    public int getPort() { return 0; }

    /**
     * Boolean to check if the server using exposed port
     *
     * @return server using exposed port
     */
    @NotNull
    public boolean isExposedPort() { return false; }

    /**
     * Return the ServerInfo of the server provided by BungeeCord
     *
     * @return ServerInfo of the server
     */
    @NotNull
    public ServerInfo getServerInfo() { return null; }

    /**
     * Return the jar path of the server
     *
     * @return jar path of the server
     */
    @NotNull
    public String getJarPath() { return null; }

    /**
     * Return the server files, key is the path on your host and value is the path in the server
     *
     * @return HashMap containing the server files
     */
    @NotNull
    public HashMap<String, String> getServerFiles() { return null; }

    /**
     * Return the server environment, you can see the list on the Wiki
     *
     * @return HashMap containing the server environment
     */
    @NotNull
    public HashMap<String, String> getServerEnvironment() { return null; }

    /**
     * Boolean to check if the server is loaded
     *
     * @return server is loaded
     */
    @NotNull
    public boolean isLoaded() { return false; }

    /**
     * Boolean to check if the server is starting
     *
     * @return server is starting
     */
    @NotNull
    public boolean isStarting() { return false; }

    /**
     * Boolean to check if the server is started
     *
     * @return server is started
     */
    @NotNull
    public boolean isStarted() { return false; }

}
