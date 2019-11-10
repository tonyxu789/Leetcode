import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Intervals {


    public static List<Integer> list = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        String inputline = sc.next();
        String[] timeArray = inputline.split(" ");
        int[][] internals = new int[timeArray.length][2];
        for(int i=0; i<timeArray.length; i++) {
            String time = timeArray[i];
            String[] timeSplit = time.split(",");
            String timeA = timeSplit[0].substring(1, timeSplit.length);
            String timeB = timeSplit[1].substring(0, timeSplit.length - 1);
            internals[i][0] = Integer.valueOf(timeA);
            internals[i][1] = Integer.valueOf(timeB);
        }


        int result = eraseOverlapIntervals(internals);

        System.out.println("count:"+result);

        for(int k=0; k<list.size(); k++) {
            int index = list.get(k);
            System.out.print("("+internals[index][0]+","+internals[index][1]+")");
            if (k!=list.size()-1) {
                System.out.print(" ");
            }
        }


    }



    public static int eraseOverlapIntervals(int [][] intervals) {

        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1]-o2[1];}
        });

        int count = 0;
        int i = 0;

        while(i<intervals.length) {
            list.add(i);
            int j=i+1;

            while(j<intervals.length&&intervals[j][0]<intervals[i][1]) {
                count++;
                j++;
            }
            i=j;
        }



        return intervals.length-count;

    }

}
