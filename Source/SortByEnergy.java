class SortByEnergy extends Statergy
{

 
  //for terrtorist 
void sortforterrorist()
{
   for (int c = 0 ; c < ( noofterrorist - 1 ); c++)
  {
    for(int d = 0 ; d < noofterrorist - c - 1; d++)
    {
      if (array[d].energy() > array[d+1].energy()) /* For decreasing order use < */
      {
        swap       = array[d].energy();
        array[d].energy()   = array[d+1].energy();
        array[d+1].energy() = swap;
      }
    }
  }
}

  //for Counterterrtorist

void sortforcounterterrorist()
{
   for (int c = 0 ; c < ( noofCounterterrorist - 1 ); c++)
  {
    for(int d = 0 ; d < noofCounterterrorist - c - 1; d++)
    {
      if (array[d].energy() > array[d+1].energy()) /* For decreasing order use < */
      {
        swap       = array[d].energy();
        array[d].energy()   = array[d+1].energy();
        array[d+1].energy() = swap;
      }
    }
  }
}
 




}