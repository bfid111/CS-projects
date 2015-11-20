/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Youngmin
 */
public class QueueDriver extends Task implements Comparable
{
    private int expectedTime; // variable used to store expected amount of time for the queue to be printed
    private String name;
    private int priority;
    /**
     * Creates Task Variable
     * @param time
     * @super
     * @param taskName
     * @param prio
     */
    public QueueDriver(String taskName, int prio, int time) {
        super(taskName, prio);
        this.expectedTime= time;
        this.priority = prio;
        this.name = taskName;
    }
    private void addTime()
    {
        this.expectedTime += 2.0; // add 2 second wait time
    }
    
    private void setTime(int time)
    {
        this.expectedTime = time;
    }
    private void subtractTime()
    {
        this.expectedTime -= 2.0;// subtract 2 seconds 
    }
    /**
     * Returns the value of the Task's Priority 
     * @return priority
     */
    @Override
    public int getPriority ()
   {
      return this.priority;
   }
    /**
     * Returns Name of the Queue 
     * @return name 
     */
    public String getName()
   {
      return this.name;
   }
    /**
     * Returns How much Time the Task has left to get printed 
     * @return expectedTime;
     */
    public double getTime()
    {
        return this.expectedTime;
    }
    @Override
   public int compareTo (Object t)
   {
      if (priority < ((Task)t).getPriority())
         return -1;
      else if (priority == ((Task)t).getPriority())
         return 0;
      else
         return 1;
   }
}
