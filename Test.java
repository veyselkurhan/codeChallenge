import java.util.ArrayList;
import java.util.Scanner;
public class Test {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		ArrayList<Point>points=new ArrayList<Point>();
		System.out.println("alan belirleyiniz örn: 5 5");
		// bu alan baþlangýç noktasý 0,0 olacak en uç noktasý gireceðimiz nokta olacak bu noktalarý kapsayacak bir alana sahip olacaðýz
		// 5,5 girildiðinde 5 birim yatay birey dikey uzunluðuna sahip bir kare þeklinde alana sahip olacaðýz
		int alanX=scan.nextInt();
		int alanY=scan.nextInt();	
		System.out.println("uzay gezgincileriln koordinatlarýný gireceksiniz burada istediðiniz kadar uzay gezgincisi oluþturabilirsiniz"
				+ "ancak eðer gezginci koordinatlarý girmeyi sonladýrmak istiyorsanýz yeni bir gezginci koordinatlarý girmeden  -1 yazýp entera basýn");
		int x=scan.nextInt();
		while(x!=-1)
		{
			Point point;
			
			int y=scan.nextInt();
			char a=scan.next().charAt(0);//
			point =new Point(x,y,a);
			point.setLastXandY(alanX, alanY);
			String yon=scan.next();
			for(int c=0;c<yon.length();c++)
			{
				char b=yon.charAt(c);
			if(b=='L'|| b=='R')point.changeYon(b);
			else if(b=='M')
				point.MovePoint();
			}
			points.add(point);
			x=scan.nextInt();
		}
		
		for(int a=0;a<points.size();a++)
		{
			System.out.println(points.get(a).getX()+" "+ points.get(a).getY()+ " "+points.get(a).getYon());
			
		}
		

	}

}
