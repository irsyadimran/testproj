
interface Modem {
	
	public String modemVersion;
	public boolean open ();
	public boolean close ();
	public int read ();
	public int write (byte[] buffer);

}
