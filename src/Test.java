public class Test {

    public int add(int x, int y) {
        return x + y;
    }

    public int sub(int x, int y) {
        return x - y;
    }

    public int multiply(int x, int y) {
        return x * y;
    }

    public void divisiblityBy5() {
        int n = 25;
        if (n % 5 == 0) {
            System.out.println("Divisible by 5");
        } else {
            System.out.println("Not divisible by 5 ");
        }

    }
<<<<<<< HEAD
    public int mod(int a, int b)
    {
    	return a%b;
=======
    public int div(int x, int y) {
    	return x/y;
    }
    public int sumplustwo(int x,int y) {
    	return x+y+2;
    	
    }
  
    public double percentage(int x, int y){
        return (x/y)*100;
>>>>>>> ec58feb782ec46bf1c5d3a0024c5bb19ae954400
    }
}
