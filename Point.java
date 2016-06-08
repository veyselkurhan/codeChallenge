
public class Point {
int x;
int y;
int lastX;
int lastY;
int yonSay;//burada kuzey i�in 4 , do�u i�in 3 ,g�ney i�in 2 bat� i�in 1 olacak bu rakamlar y�nde�i�tirmede kullan�lcak 
//daha sonra yazarken y�nlerin harfleri yaz�lacak
char yon;// bu kuzey g�ney do�u bat�n�n ba�harfleri//;
public Point(int x,int y,char yon)
{
	this.x=x;
	this.y=y;
this.yon=yon;
setYon();//burada yon de�i�keninden bir yonSay de�i�keni olu�turuyoruz
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
public void kontrolX(int x,boolean b)// bu method bu noktaya ait x koordinat�n� bir art�r�yor veya bir birim azalt�yor.
{
	// bu method iki de�er al�yor birincisi x de�eri di�eri de bi boolean de�er al�yor e�er bu boolean de�er false ise biz anl�yoruz x de�erini bir art�rmak gerekiyor
	//e�er bu de�er true ise x de�erini 1 azaltmak gerekti�ini anl�yoruz.
	if(b==false)
{
if((x+1)>lastX)System.out.println("belirledi�iniz alan� a�t�n�z ve eski y�nde durdu");
else setX(x+1);
}
	else if(b==true)
	{
		if((x-1)<0)System.out.println("belirledi�iniz alan� a�t�n�z ve eski y�nde durdu");
		else setX(x-1);
	}
}
public void kontrolY(int y,boolean b)
{
	if(b==false)
{
if((y+1)>lastY)System.out.println("belirledi�iniz alan� a�t�n�z ve eski y�nde durdu");
else setY(y+1);
}
	else if(b==true)
	{
		if((y-1)<0)System.out.println("belirledi�iniz alan� a�t�n�z ve eski y�nde durdu"); 
		else setY(y-1);
	}
}
}
