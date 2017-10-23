class CounterTerrorist
{

    private String terror[];
    private int noofCounterterrorist;
    int h=0;
	CounterTerrorist(int noofCounterterrorist)
	{
		this.noofCounterterrorist=noofCounterterrorist;
                terror=new String[noofCounterterrorist];
	}
        
        public void setCounterterrorist(String playerofCounterterrorist)
        {
            terror[h]=playerofCounterterrorist;
            h++;
        }
}