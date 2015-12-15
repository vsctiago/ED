/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

import Exceptions.EmptyCollectionException;
import Exceptions.NotFoundCollectionException;
import java.util.Iterator;

/**
 *
 * @author psycku
 * @param <T>
 */
public class ArrayList<T> implements ListADT<T> {

    private static final int DEFAULT_CAPACITY = 10;
    protected int rear;
    protected T[] array;
    
    public ArrayList() {
        this.rear = 0;
        this.array = (T[])(new Object[DEFAULT_CAPACITY]);
    }
    
    @Override
    public T removeFirst() throws EmptyCollectionException {
        if(isEmpty())
            throw new EmptyCollectionException("Vazio");
            
        T removed = array[0];
        for(int i=0; i<rear; i++) {
            array[i] = array[i+1];
        }
        this.rear--;
        return removed;
    }

    @Override
    public T removeLast() throws EmptyCollectionException {
        if(isEmpty())
            throw new EmptyCollectionException("Vazio");

        T removed = array[rear-1];
        this.array[rear-1] = null;
        rear--;
        return removed;
    }

    @Override
    public T remove(T element) throws EmptyCollectionException, NotFoundCollectionException {
        if(isEmpty())
            throw new EmptyCollectionException("Vazio");
            
        int pos = find(element);
        
        if(pos != -1) { // Encontrou o elemento
            T removed = this.array[pos];
            for(int i=pos; i<rear; i++) {
                array[i] = array[i+1];
            }
            return removed;
        } else {
            throw new NotFoundCollectionException("Item não foi encontrado.");
        }
    }

    @Override
    public T first() {
        return this.array[0];
    }

    @Override
    public T last() {
        return this.array[rear];
    }

    @Override
    public boolean contains(T target) {
        return find(target) != -1;
    }

    @Override
    public boolean isEmpty() {
        return rear == 0;
    }

    @Override
    public int size() {
        return rear;
    }

    public int find(T element) {
        for(int i=0; i<rear; i++) {
            if(element.equals(array[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public Iterator<T> iterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
