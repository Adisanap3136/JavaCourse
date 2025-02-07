class LargestNumTernaryOperator
{
	public static void main(String[] args) 
	{
		int a =5;
		int b= 6;
		int c = 11;
        //             5>6      5>11                  6>11
		int largest = (a>b) ? ((a>c) ? (a) : (c)) : ((b>c) ? (b) : (c));
		System.out.println("larger: "+largest);
        //             5>6      5>11                  6>11 
		int smallest = (a<b) ? ((a<c)?(a):(c)) : ((b<c)?(b):(c));
		System.out.println("smaller: "+smallest);
	}
}