class inputhandler
{
    int noofterrorist=scan.nextInt();
    int noofCounterterrorist=scan.nextInt();
    Player array[]=new Player[noofCounterterrorist+noofterrorist];

    for(int i=0;i<noofCounterterrorist+noofterrorist;i++)
    {
        array[i]=new Player(types,orders,statergies);
    }

}