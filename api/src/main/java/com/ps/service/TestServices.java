package com.ps.service;

import com.ps.domain.Student;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 * @author VP
 */
public interface TestServices  extends Remote{

    void add() throws RemoteException;

    List<Student> student() throws RemoteException;
}
