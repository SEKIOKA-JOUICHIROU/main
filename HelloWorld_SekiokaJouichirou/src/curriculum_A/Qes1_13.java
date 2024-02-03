package curriculum_A;

public class Qes1_13 {
	public static void main(String[] args) {
		
		//問１
		
		byte b ;
		short s ;
		int i ;
		long l ;
		float f ;
		double d ;
		char c ;
		String str ;
		boolean boo ;
		
		//問２
		
		b = 0 ;
		s = 0 ;
		i = 0 ;
		l = 0L ;
		f = 0.0f ;
		d = 0.0d ;
		c = '\u0000' ;
		str = null ;
		boo = false ;
		
		//問３
		
		b = 10 ;
		s = 100 ;
		i = 1000 ;
		l = 10000 ;
		f = 9.5f ;
		d = 10.5 ;
		c = 'a' ;
		str = "ハロー" ;
		boo = true ;
		
		//問４
		
		System.out.println(b + s + i + l);
		System.out.println(Math.round(f + d));
		System.out.println(c + str + boo);
		System.out.println(Math.round(b + s + i + l + f + d));
		System.out.println(b * s * i * l);
		System.out.println(d / s);
		System.out.println(b - s);
		
		//問５
		
		int num= 20;
		int num1=23;
		
		System.out.println("ハローJAVA"+(num+num1));
		
		//問６
		
		String s1= "山田太郎";
		i = 18;
		d = 170.5;
		f = 62.2f;
		String s2= "寿司";
		
		System.out.println("「初めまして" + s1 + "です」");
		System.out.println("「年齢は" + i + "歳です」");
		System.out.println("「身長は" + d + "cmです」");
		System.out.println("「体重は" + f + "kgです」");
		System.out.println("「好きな食べ物は" + s2 + "です」");
		
		//問７
		
		System.out.println("「BMIは" + f / ((d / 100) * (d / 100)) + "です」");
		
		//問８
		
		String s3= "鈴木一郎";
		i = 24;
		d = 168.5;
		f = 64.2f;
		String s4= "オムライス";
		double num2 = f / ((d / 100) * (d / 100));
		double num3 = ((double)Math.round(num2 * 10))/10;
		
		System.out.println("「初めまして" + s3 + "です」");
		System.out.println("「年齢は" + i + "歳です」");
		System.out.println("「身長は" + d + "cmです」");
		System.out.println("「体重は" + f + "kgです」");
		System.out.println("「好きな食べ物は" + s4 + "です」");
		System.out.println("「BMIは" + num3 + "です」");
		
		//問９
		
		i = i + i;
		d = d + d;
		f = f + f;
		double num4 = f / ((d / 100) * (d / 100));
		double num5 = ((double)Math.round(num4 * 100))/100;
		
		System.out.println("「初めまして" + s3 + "です」");
		System.out.println("「年齢は" + i + "歳です」");
		System.out.println("「身長は" + d + "cmです」");
		System.out.println("「体重は" + f + "kgです」");
		System.out.println("「好きな食べ物は" + s4 + "です」");
		System.out.println("「BMIは" + num5 + "です」");
		
		//問１０
		
		boo =  (i >= 25); 
		
		System.out.println(boo);
		
		//問１１
		
		String istr = String.valueOf(i);
		String dstr = String.valueOf(d);
		String fstr = String.valueOf(f);
		
		System.out.println(istr + dstr + fstr);
		
		//問１２
		
		int iint = Integer.valueOf(istr);
		double dd = Double.parseDouble(dstr);
		int dint = (int)dd;
		
		System.out.println(iint);
		System.out.println(dint);
		
		//問１３
		
		boo =  (iint == 25 || dint >= 160);
		
		System.out.println(boo);
		
		//確認テスト
		
		float ans = 7 / 6;
		System.out.println(ans);
		
	}

}
