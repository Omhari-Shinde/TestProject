package TechLead;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][][]= {{{1,2},{2,3}},
			     {{7,6},{2,3}}};
	for (int i = 0; i < a.length; i++) 
	{
		for (int j = 0; j < a.length; j++) 
		{
			for (int k = 0; k < a.length; k++) 
			{
				int cnt=0;
				for (int x = 0; x < a.length; x++) 
				{
					for (int y = 0; y < a.length; y++) 
					{
						for (int z = 0; z < a.length; z++) 
						{
							if(a[i][j][k]==a[x][y][z])
							{
								cnt++;
							}
						}
					}
				}
				System.out.println(cnt+" "+a[i][j][k]);
			}
		}
	}


	}

}
