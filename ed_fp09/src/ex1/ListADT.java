/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

import Exceptions.*;
import java.util.Iterator;

public interface ListADT<T> extends Iterable<T> {
    
    public T removeFirst() throws EmptyCollectionException;
    public T removeLast() throws EmptyCollectionException;
    public T remove(T element) throws EmptyCollectionException, NotFoundCollectionException;
    public T first();
    public T last();
    public boolean contains(T target);
    public boolean isEmpty();
    public int size();
    public Iterator<T> iterator();
    public String toString();
    
}
