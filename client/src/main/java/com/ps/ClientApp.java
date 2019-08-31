package com.ps;

import com.ps.domain.Student;
import com.ps.service.TestServices;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.List;

/**
 * Hello world!
 */
public class ClientApp {
    public static void main(String[] args) throws RemoteException, NotBoundException, MalformedURLException {
        // 通过命名空间找到网络服务
        TestServices testService = (TestServices) Naming.lookup("rmi://127.0.0.1:9980/TestService");
        testService.add();
        List<Student> student = testService.student();
        System.out.println(student);
    }
}
