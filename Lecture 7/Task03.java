package assignment.pkg6;

import java.util.Arrays;

public class Task03 {
    public static class StopWatch {
        private long StartTime;
        private long EndTime;
       
        long getStartTime() {
            return this.StartTime;
        }
        
        long getEndTime() {
            return this.EndTime;
        }
        
        //Constructor - StopWatch
        public StopWatch() {
           this.StartTime = StartTime;
           this.EndTime = EndTime;
        }
       
        //Method - Set StartTime at start 
        void start() {
           this.StartTime = System.currentTimeMillis();
        }
        //Method - Set EndTime at stop
        void stop() {
           this.EndTime = System.currentTimeMillis();
        }
        //Metod - getElapsedTime between start and stop
        long getElapsedTime() {
            long ElapsedTime = this.EndTime - this.StartTime;
            return ElapsedTime;
        } 
    }
    
    public static void main (String[] args) {
        //Create an array with 100000 random numbers
        int[] number = new int[100000];
        int count = 0;
        
            
            //Inserts numbers into the array
            for(int i = 0 ; i < 100000 ; i++) {
                // Math.random gives a random number between 0 and 1
                // (int)(Math.random() * ((upperbound - lowerbound) + 1) + lowerbound); 
                // Generate a random numbers between 10 and 99    
                number[i] = (int)(Math.random() * ((99 - 10) + 1) + 10);
                count++;
                    //Display the output
                    if (count%20 == 0) {
                        System.out.println(number[i] + ", ");
                    } else {
                        System.out.print(number[i] + ", ");
                    } 
            }
        
        //Create object stopWatch
        StopWatch stopWatch = new StopWatch();
        
        //Start the stop-watch
        stopWatch.start();
        
        //Method sortArray -->
        sortArray(number);
        
        //End the stop-watch   
        stopWatch.stop();
        
        System.out.println("Elapsed time: " + stopWatch.getElapsedTime() + " ms.");
    }
    
    public static int[] sortArray(int[] number) {
        int temp; //temp. store to switch around the numbers
        
        //Sort the array:
        for ( int i = 0 ; i < number.length ; i++) {
            //int xIndex = number[i];
            //int xValue = i; 
            
            for( int j = 0 ; j < (number.length - 1) ; j++) {
                //int yIndex = number[j];
                //int yValue = j;
                
                if(number[j+1]<number[j]) {
                    temp        = number[j+1];
                    number[j+1] = number[j];
                    number[j]   = temp;     
                }   
            }
        }
        
        //Display the sorted array:
        int count = 0;
        System.out.println("---- Print the sorted array: ----");
        
        for (int g = 0 ; g < number.length ; g++) {
            count++;
           
            if (count%20 == 0) {
                System.out.println(number[g] + ", ");
            } else {
                System.out.print(number[g] + ", ");
            }
        }
        return number;
    }
}
