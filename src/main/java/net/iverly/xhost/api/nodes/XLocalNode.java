package net.iverly.xhost.api.nodes;

import net.iverly.xhost.api.XServer;
import org.jetbrains.annotations.NotNull;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeoutException;

/**
 * @author iverly on 03/05/2020
 * @project xhost-api
 */
public class XLocalNode {

    /**
     * XLocalNode represent your machine as a node.
     */
    public XLocalNode() {}

    /**
     * XLocalNode represent your machine as a node.
     *
     * @param dataPath Path of your data folder on the node
     */
    public XLocalNode(@NotNull String dataPath) throws Exception {}

    /**
     * XLocalNode represent your machine as a node.
     *
     * @param dataPath Path of your data folder on the node
     * @param network Network name on Docker to link all XServer
     */
    public XLocalNode(@NotNull String dataPath, @NotNull String network) throws Exception {}

    /**
     * Create a server from XServer to Docker
     *
     * @param server XServer object
     * @throws IllegalArgumentException throw when server or server jar is null
     * @throws IllegalStateException throw when server with the same name is already registered
     * @throws FileNotFoundException throw when the server jar or a server files are not found
     * @throws InterruptedException throw when docker crash
     * @throws TimeoutException throw when docker is unreachable
     * @throws IOException throw when docker return an error
     */
    public void createServer(@NotNull XServer server) throws IllegalArgumentException, IllegalStateException, FileNotFoundException, InterruptedException, TimeoutException, IOException {}

    /**
     * Start a server asynchronously and emit the ServerStartedEvent when the server is open
     *
     * @param server XServer object
     * @throws IllegalArgumentException throw when server is null
     * @throws IllegalStateException throw when the server is already started
     * @throws InterruptedException throw when docker crash
     * @throws TimeoutException throw when docker is unreachable
     * @throws IOException throw when docker return an error
     */
    public void startServerAsync(@NotNull XServer server) throws IllegalArgumentException, IllegalStateException, InterruptedException, TimeoutException, IOException {}

    /**
     * Start a server synchronously, the function end when the server is open
     *
     * @param server XServer object
     * @throws IllegalArgumentException throw when server is null
     * @throws IllegalStateException throw when the server is already started
     * @throws InterruptedException throw when docker crash
     * @throws TimeoutException throw when docker is unreachable
     * @throws IOException throw when docker return an error
     */
    public void startServer(@NotNull XServer server) throws IllegalArgumentException, IllegalStateException, InterruptedException, TimeoutException, IOException {}

    /**
     * Stop a server
     *
     * @param server XServer object
     * @throws IllegalArgumentException throw when server is null
     * @throws IllegalStateException throw when the server isn't started
     * @throws InterruptedException throw when docker crash
     * @throws TimeoutException throw when docker is unreachable
     * @throws IOException throw when docker return an error
     */
    public void stopServer(@NotNull XServer server) throws IllegalArgumentException, IllegalStateException, InterruptedException, TimeoutException, IOException {}

    /**
     * Delete a server from Docker
     *
     * @param server XServer object
     * @throws IllegalArgumentException throw when server is null
     * @throws IllegalStateException throw when the server is started
     * @throws InterruptedException throw when the server isn't started
     * @throws TimeoutException throw when docker is unreachable
     * @throws IOException throw when docker return an error
     */
    public void deleteServer(XServer server) throws IllegalArgumentException, IllegalStateException, InterruptedException, TimeoutException, IOException {}

    /**
     * Return the data path of the node
     *
     * @return data path of the node
     */
    @NotNull
    public String getDataPath() { return null; }

    /**
     * Set the data path of the node
     *
     * @param dataPath data path of the node
     */
    public void setDataPath(String dataPath) {}

    /**
     * Return the network name of the node
     *
     * @return network name of the node
     */
    @NotNull
    public String getNetwork() { return null; }

    /**
     * Set the network name of the node
     *
     * @param network network name of the node
     */
    public void setNetwork(String network) {}

    /**
     * Boolean to check if the node is using network
     *
     * @return server using network
     */
    public boolean isUseNetwork() { return false; }

}
