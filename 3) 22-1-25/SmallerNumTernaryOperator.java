class SmallerNumTernaryOperator 
{
	public static void main(String[] args) 
	{
		int a = 10;
		int b = 4;
		int c = 9;
		int smallest;
		//			10<4	 10<9			   4<9
		smallest = (a<b) ? ((a<c)?(a):(c)) : ((b<c)?(b):(c));
		System.out.println(smallest);
	}
}
