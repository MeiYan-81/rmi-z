package com.ps;

import com.ps.service.TestServiceImpl;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

/**
 * Hello world!
 *
 * @author VP
 */
public class ServiceApp {
    public static void main(String[] args) throws RemoteException, NotBoundException, MalformedURLException {
        //注册通讯端口
        LocateRegistry.createRegistry(9980);
        //注册通讯路径
        Naming.rebind("rmi://127.0.0.1:9980/TestService", new TestServiceImpl());
        System.out.println("启动服务器.....");
    }
}
