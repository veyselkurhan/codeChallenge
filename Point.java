
public class Point {
int x;
int y;
int lastX;
int lastY;
int yonSay;//burada kuzey icin 4 , dogu icin 3 ,guney icin 2 bati icin 1 olacak bu rakamlar yon degistirmede kullanilacak 
//daha sonra yazarken yonlerin harfleri yazılacak
char yon;// bu kuzey güney dogu batının basharfleri//;
public Point(int x,int y,char yon)
{
	this.x=x;
	this.y=y;
this.yon=yon;
setYon();//burada yon degiskeninden bir yonSay degiskeni oluşturuyoruz
	}
public void MovePoint()
{
	if(yonSay==1)
	kontrolX(x, false);
	if(yonSay==3)
	kontrolX(x, true);
	if(yonSay==2)
	kontrolY(y, true);
	if(yonSay==4)
	{	
	kontrolY(y, false);
	}
}
public void setYon()
{
	if(yon=='N')yonSay=4;
	if(yon=='E')yonSay=3;
	if(yon=='S')yonSay=2;
	if(yon=='W')yonSay=1;
}
public void changeYon(char a)
{
	if(a=='L')
{if(yonSay-1<0)yonSay=4;
else yonSay=yonSay-1;
	}
	if(a=='R')
	{
 if((yonSay+1)>4)yonSay=1;
else yonSay=yonSay+1;
	}
}
public void dondur(){
	if(yonSay==4)yon='N';
	if(yonSay==3)yon='E';
	if(yonSay==2)yon='S';
	if(yonSay==1)yon='W';	
}
public void setX(int x)
{
this.x=x;
}
public void setY(int y)
{

this.y=y;
}
public int getX()
{
	return x;
	}
public int getY()
{
return y;	
}
public char getYon()
{
dondur();
return yon;
}
public void setLastXandY(int x ,int y)
{
lastX=x;
lastY=y;
}
public void kontrolX(int x,boolean b)// bu method bu noktaya ait x koordinatını bir artırıyor veya bir birim azaltiyor.
{
	// bu method iki deger alıyor birincisi x degeri diğeri de bir boolean değer aliyor eger bu boolean deger false ise biz anliyoruz x degerini bir artirmak gerekiyor
	//eger bu deger true ise x degerini 1 azaltmak gerektigini anliyoruz.
	if(b==false)
{
if((x+1)>lastX)System.out.println("belirlediginiz alanı astınız ve eski yonde durdu");
else setX(x+1);
}
	else if(b==true)
	{
		if((x-1)<0)System.out.println("belirlediginiz alani astiniz ve eski yonde durdu");
		else setX(x-1);
	}
}
public void kontrolY(int y,boolean b)
{
	if(b==false)
{
if((y+1)>lastY)System.out.println("belirlediginiz alani astiniz ve eski yonde durdu");
else setY(y+1);
}
	else if(b==true)
	{
		if((y-1)<0)System.out.println("belirlediginiz alani astiniz ve eski yonde durdu"); 
		else setY(y-1);
	}
}
}
