package MindStickExam;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,3,2,4};
		int n=4;
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = i+1; j < a.length; j++) 
			{
				if(a[i]<a[j])
				{
					System.out.println(a[j]);
					break;
				}
					
			}
			if(a[i]==n)
			{
				System.out.println(-1);
			}
		}


	}

}
