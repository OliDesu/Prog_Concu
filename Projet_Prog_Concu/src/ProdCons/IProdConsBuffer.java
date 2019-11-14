package ProdCons;

public interface IProdConsBuffer {
/* Put the message m in the prodcons buffer */
	public void put(Message m) throws InterruptedException;
	/* Retrieve a message from the prodcons buffer, following a fifo buffer */
	public Message get() throws InterruptedException;
	/* Returns the number of messages curretly available in the prodcons buffer*/
	public int nmsg();
	/* Returns the total number of messages that have been put in the buffer since its creation */
	public int totmsg();
}}
	
}
