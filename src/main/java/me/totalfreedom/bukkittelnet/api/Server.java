/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.totalfreedom.bukkittelnet.api;

import me.totalfreedom.bukkittelnet.SocketListener;

public interface Server
{

    public void startServer();

    public void stopServer();

    public SocketListener getSocketListener();

}
