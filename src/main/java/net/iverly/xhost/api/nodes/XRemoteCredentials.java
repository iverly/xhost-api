package net.iverly.xhost.api.nodes;

import org.jetbrains.annotations.NotNull;

import java.io.File;

/**
 * @author iverly on 12/05/2020
 * @project xhost-api
 */
public class XRemoteCredentials {

    /**
     * XRemoteCredentials represent a credentials object
     *
     * @param hostname hostname of node
     * @param user user of node
     * @param password password of node
     * @param port port of node (default to 22)
     */
    public XRemoteCredentials(@NotNull String hostname, @NotNull String user, @NotNull String password, int port) {}

    /**
     * XRemoteCredentials represent a credentials object
     *
     * @param hostname hostname of node
     * @param user user of node
     * @param password password of node
     */
    public XRemoteCredentials(@NotNull String hostname, @NotNull String user, @NotNull String password) {}

    /**
     * XRemoteCredentials represent a credentials object
     *
     * @param hostname hostname of node
     * @param user user of node
     * @param keyFile File of RSA key
     * @param passphrase passphrase of RSA key
     * @param port port of node (default to 22)
     */
    public XRemoteCredentials(@NotNull String hostname, @NotNull String user, @NotNull File keyFile, @NotNull String passphrase, int port) {}

    /**
     * XRemoteCredentials represent a credentials object
     *
     * @param hostname hostname of node
     * @param user user of node
     * @param keyFile File of RSA key
     * @param passphrase passphrase of RSA key
     */
    public XRemoteCredentials(@NotNull String hostname, @NotNull String user, @NotNull File keyFile, @NotNull String passphrase) {}

    /**
     * Return the hostname of node
     *
     * @return hostname of node
     */
    @NotNull
    public String getHostname() { return null; }

    /**
     * Return the user of node
     *
     * @return user of node
     */
    @NotNull
    public String getUser() { return null; }

    /**
     * Return the password of node
     *
     * @return password of node
     */
    @NotNull
    public String getPassword() { return null; }

    /**
     * Return the File of RSA key
     *
     * @return File of RSA key
     */
    @NotNull
    public File getKeyFile() { return null; }

    /**
     * Return the passphrase of RSA key
     *
     * @return passphrase of RSA key
     */
    @NotNull
    public String getPassphrase() { return null; }

    /**
     * Boolean to check if credentials use RSA key
     *
     * @return credentials use RSA key
     */
    public boolean isUsingKey() { return false; }

}
