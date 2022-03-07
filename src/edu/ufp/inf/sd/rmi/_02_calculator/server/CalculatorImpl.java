package edu.ufp.inf.sd.rmi._02_calculator.server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class CalculatorImpl extends UnicastRemoteObject implements CalculatorRI {


    public CalculatorImpl() throws RemoteException {
        super();
    }

    @Override
    public double add(double a, double b) throws RemoteException {
        Logger.getLogger(this.getClass().getName()).log(Level.INFO, "SOMA");
        return a + b;
    }

    @Override
    public double add(ArrayList<Double> list) throws RemoteException {
        double sum = 0;
        for (double n : list) {
            sum += n;
        }
        Logger.getLogger(this.getClass().getName()).log(Level.INFO, "SOMA ARRAY");

        return sum;
    }

    @Override
    public double div(double a, double b) throws RemoteException {
        Logger.getLogger(this.getClass().getName()).log(Level.INFO, "DIVISÃO");

        return a / b;
    }

    @Override
    public double sub(double a, double b) throws RemoteException {
        Logger.getLogger(this.getClass().getName()).log(Level.INFO, "SUB");

        return a - b;
    }

    @Override
    public double mul(double a, double b) throws RemoteException {
        Logger.getLogger(this.getClass().getName()).log(Level.INFO, "MULT");

        return a * b;
    }
}
