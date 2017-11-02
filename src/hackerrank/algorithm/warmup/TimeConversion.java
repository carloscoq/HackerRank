package hackerrank.algorithm.warmup;

public class TimeConversion {

	static String timeConversion(String s) {
        String hour = s.substring(0,2);
        String ampm = s.substring(8,s.length());
        
        if("PM".equals(ampm)){
            
        	if(!"12".equals(hour)){        		
        		hour = (Integer.parseInt(hour)+12)+"";
        	}

            if(Integer.parseInt(hour) >=24){
                hour = "00";

            }
        }
        return hour+s.substring(2,8);
    }

    public static void main(String[] args) {
        /*Scanner in = new Scanner(System.in);
        String s = in.next();*/
    	
    	String s = "11:01:01PM";
    	
        String result = timeConversion(s);
        System.out.println(result);
    }
}
