import java.util.ArrayList;
import java.util.Scanner;
public class Test {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		ArrayList<Point>points=new ArrayList<Point>();
		System.out.println("alan belirleyiniz �rn: 5 5");
		// bu alan ba�lang�� noktas� 0,0 olacak en u� noktas� girece�imiz nokta olacak bu noktalar� kapsayacak bir alana sahip olaca��z
		// 5,5 girildi�inde 5 birim yatay birey dikey uzunlu�una sahip bir kare �eklinde alana sahip olaca��z
		int alanX=scan.nextInt();
		int alanY=scan.nextInt();	
		System.out.println("uzay gezgincileriln koordinatlar�n� gireceksiniz burada istedi�iniz kadar uzay gezgincisi olu�turabilirsiniz"
				+ "ancak e�er gezginci koordinatlar� girmeyi sonlad�rmak istiyorsan�z yeni bir gezginci koordinatlar� girmeden  -1 yaz�p entera bas�n");
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
