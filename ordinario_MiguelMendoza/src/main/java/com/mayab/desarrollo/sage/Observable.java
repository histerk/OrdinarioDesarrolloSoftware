/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.desarrollo.sage;

/**
 *
 * @author migue
 */
public interface Observable {
    public void addObserverToListMsg(Observer persona);
    public void pauseObserverFromListMsg(Observer persona);
    public void addObserverToListCorreo(Observer persona);
    public void pauseObserverFromListCorreo(Observer persona);
    public void notifyObserversMsg();
    public void notifyObserversCorreo();
}
