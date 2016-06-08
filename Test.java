import java.util.ArrayList;
import java.util.Scanner;
public class Test {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		ArrayList<Point>points=new ArrayList<Point>();
		System.out.println("alan belirleyiniz örn: 5 5");
		// bu alan baslangic noktasi 0,0 olacak en uc noktasi girecegimiz nokta olacak bu noktalari kapsayacak bir alana sahip olacagız
		// 5,5 girildiginde 5 birim yatay e birim dikey uzunluguna sahip bir kare şeklinde alana sahip olacagiz
		int alanX=scan.nextInt();
		int alanY=scan.nextInt();	
		System.out.println("uzay gezgincileriln koordinatlarini gireceksiniz burada istediginiz kadar uzay gezgincisi olusturabilirsiniz"
				+ "ancak eger gezginci koordinatlari girmeyi sonladırmak istiyorsanız yeni bir gezginci koordinatları girmeden  -1 yazıp entera basın");
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
