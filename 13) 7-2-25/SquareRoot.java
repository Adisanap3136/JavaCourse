import java.util.Scanner;
class SquareRoot 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the num: ");
		int num=sc.nextInt();
		for(int i=1; i<num; i++){
			int sq=i*i;
			if(sq>num){
				break;
			}
			else if(sq==num){
				System.out.println(i+ " is Perfect Square of " +num);

				}
				else{
					System.out.println(num+ " has NOT a Perfect Square");
					break;
				}
		
		
		}
	
	}
}