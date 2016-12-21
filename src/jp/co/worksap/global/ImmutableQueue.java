/*
 * The program is supported with an user interface and can be viewed by clicking the jar file submitted.
 * Note :- The code of user interface is made in java but may not work correctly if directly compiled with ecllipse.
 * So to get the best experience out of the user interface it is expected that the program is started from the jar file.
*/
package jp.co.worksap.global;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class ImmutableQueue<E>{
	
	//Data Members
	public final ArrayList<E> immutableQueue;
	public ArrayList<E> secondaryQueue;
	private ImmutableQueue<E> immutableQueueReference;
	public Object dequeuedObject;
	public boolean enqueueSuccess = false;
	public boolean dequeueSuccess = false;
	
	//Member Methods
	public ImmutableQueue(){
		immutableQueue = new ArrayList<>();
		secondaryQueue = new ArrayList<>();
	}
	
	public boolean copyContentsOfImmutableQueueToSecondary(){
		boolean success = false;
		for(int i = 0 ; i < immutableQueue.size() ; i++){
			success = true;
			secondaryQueue.add(i, immutableQueue.get(i));
		}				
		return success;
	}
	
	public ImmutableQueue<E> enqueue(E e){
		if(e == null){
			throw new IllegalArgumentException();
		}else{
			enqueueSuccess = secondaryQueue.add(e);
			immutableQueueReference = this;
		}				
		return immutableQueueReference;
	}
	
	public ImmutableQueue<E> dequeue(){
		if(secondaryQueue.isEmpty()){
			throw new NoSuchElementException();
		}else{
			dequeuedObject = secondaryQueue.remove(0);
			if(dequeuedObject != null){
				dequeueSuccess = true;
			}
			immutableQueueReference = this;
		}
		return immutableQueueReference;
	}
	
	public E peek(){
		if(secondaryQueue.isEmpty()){
			throw new NoSuchElementException();
		}else{
			return secondaryQueue.get(0);
		}
	}
	
	public int size(){
		return secondaryQueue.size();
	}
	
	public boolean addItemsToImmutableQueue(E e){
		if(e == null){
			throw new IllegalArgumentException();
		}
		return immutableQueue.add(e);
	}
	
	public void printQueue(ArrayList<E> list){
		System.out.println(list);	
	}
	
}