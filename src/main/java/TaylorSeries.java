public class TaylorSeries {
	
	// YOUR CODE GOES HERE
	
	static int factorial(int n){
		if(n>=1) {
			return n*factorial(n-1);
		}
		return 1;
	}
	static int pow(int x,int y){
		if(y>=1) {
			return x*pow(x,y-1);
		}
		return 1;
	}
	
	static float approximateExp(int base, int num) {
		int count=0;
		float approx=0;
		while(count<num) {
			float top=pow(base,count);
			float bot=factorial(count);
			float fraction = top/bot;
			approx = approx + fraction;
			count++;
		}
		return approx;
	}
}