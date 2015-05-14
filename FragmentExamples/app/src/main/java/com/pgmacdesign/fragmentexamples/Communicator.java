package com.pgmacdesign.fragmentexamples;

/*
This interface allows for the fragments to use interfaces to send messages to the
activities and the respective fragments. You don't want to couple the fragments together by having
fragment A interact directly with fragment b.
 */
public interface Communicator {

	public void respond(String data);
}
