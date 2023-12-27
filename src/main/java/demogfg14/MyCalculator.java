package demogfg14;

public class MyCalculator {
	 public int sum(int a,int b){
	        return  a+b;
	    }
	    public int diff(int a ,int b){
	        return a-b;
	    }
	    public int div(int a ,int b){
	        return a/b;
	    }
	    public static void main(String[] args){
	        MyCalculator cal=new MyCalculator();
	        System.out.println("sum is:"+cal.sum(20,10));
	        System.out.println("diff is:"+cal.diff(20,10));
	        System.out.println("div is:"+cal.div(20,10));
	    }
	}


