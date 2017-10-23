class SortBySucess extends Statergy
{
    //for terrtorist 
void sortforterrorist()
{
   for (int c = 0 ; c < ( noofterrorist - 1 ); c++)
  {
    for(int d = 0 ; d < noofterrorist - c - 1; d++)
    {
      if (array[d].sucess() > array[d+1].sucess()) /* For decreasing order use < */
      {
        swap       = array[d].sucess();
        array[d].sucess()   = array[d+1].sucess();
        array[d+1].sucess() = swap;
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
      if (array[d].sucess() > array[d+1].sucess()) /* For decreasing order use < */
      {
        swap       = array[d].sucess();
        array[d].sucess()   = array[d+1].sucess();
        array[d+1].sucess() = swap;
      }
    }
  }
} 


}