/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

/**
 *
 * @author psycku
 */
public class ArrayUnorderedList<T> extends ArrayList<T> implements UnorderedListADT<T> {

    public ArrayUnorderedList() {
        super();
    }
    
    private void expandCapacity() {
        T[] temp = (T[]) (new Object[array.length * 2]);
        for (int i = 0; i < array.length; i++) {
            temp[i] = array[i];
        }
        array = temp;
    }
    
    @Override
    public void addToFront(T element) {
        Comparable temp = (Comparable) element;
        
        if(super.size() == rear){
            expandCapacity();
        }
        for(int i=rear; i>0; i--) {
            array[i] = array[i-1];
        }
        array[0] = element;
        rear++;
    }

    @Override
    public void addToRear(T element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addAfter(T element, T target) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
