package com.ps.service;

import com.ps.domain.Student;
import com.ps.service.TestServices;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

/**
 * @author VP
 */
public class TestServiceImpl extends UnicastRemoteObject implements TestServices {

    public TestServiceImpl() throws RemoteException {}

    @Override
    public void add() throws RemoteException {
        System.out.println("哭着笑");
    }

    @Override
    public List<Student> student() throws RemoteException {
        List<Student> list = new ArrayList<>();
        Student student = new Student();
        student.setName("haha");
        student.setAge(12);
        list.add(student);
        return list;
    }
}
