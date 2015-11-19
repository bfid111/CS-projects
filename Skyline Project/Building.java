package nightskyline;



import javax.swing.JPanel; //import classes
import java.awt.*;
import java.util.Random;

public class Building extends JPanel
{
  private int a; //sets these variables private to hide them
  private int b;
  private int c;
  private int d;
  private int e;
  private int f;
  private int g;
  private int h;
  private int i;
  private int j;
  private int k;
  private int l;
  private int m;
  private int n;
  private int o;
  private int p;
  private int q;
  private int r;
  private int s;
  private int t;
  private int u;
  private int v;
  private int w;
  private int x;
  private int y;
  private int z;
  private int aa;
  private int ba;
  private int ca;
  private int da;
  private int ea;
  private int fa;
  private int ga;
  private int ha;
  private int ia;
  private int ja;
  private int la;
  private int ma;
  private int na;
  private int ka;
    
  public Building ()
   {
      setBackground (Color.blue); //blue background
      setPreferredSize (new Dimension(550, 240)); //sets size of background
   }

public void paintComponent (Graphics page)
   {
     Random generator = new Random(); //generates random values to use as basis for randomness 
     Building2 num1, num2, num3, num4, num5, num6; //Create 6 new objects of the PhoneNumber Class
num1 = new Building2();
num2 = new Building2();
num3 = new Building2();
num4 = new Building2();
num5 = new Building2();
num6 = new Building2();

num1.a(); //Use the different methods of the Class Buildings2 to gen the numbers
num2.b();
num3.c();
num4.d();
num5.e();
num6.f();

  
     a = num1.a(); e = num1.a(); i = num1.a();  m = num1.a(); //Assign the different strings to integer values
     b = num2.b(); f = num2.b(); j = num2.b(); n = num2.b();
     c = num3.c(); g = num3.c(); k = num3.c(); o = num3.c();
     d = num4.d(); h = num4.d(); l = num4.d(); p = num4.d(); 
     q = num5.e(); r = num5.e(); s = num5.e(); t = num5.e(); u = num5.e(); v = num5.e(); w = num5.e(); x = num5.e(); y = num5.e();
     z = num5.e(); aa = num5.e(); ba = num5.e(); ca = num5.e(); da = num5.e(); ea = num5.e();
     fa = num6.f(); ga = num6.f(); ha = num6.f(); ia = num6.f(); ja = num6.f(); ka = num6.f(); la = num6.f(); ma = num6.f(); na = num6.f(); 
        
      super.paintComponent (page);
       
      page.setColor (Color.white);
      page.fillOval (-35, -35, 80, 80);  // moon
       
      page.setColor (Color.black);
      
      page.fillRect (c, d, a, b);  // Building1
      page.fillRect (g, h, e, f);  // Building2
      page.fillRect (k, l, i, j);  // Building3
      page.fillRect (o, p, m, n);  // Building3
      page.fillRect (0, 195, 550, 170);  // Base/boardwalk
             
      page.setColor (Color.BLUE);  
      for ( int ab = 0; ab < 6; ab++)
      {
      page.fillRect (c+q, d+a, ab, ab);      // window
      page.fillRect (c+r, d+e, ab, ab);      // window
      page.fillRect (c+s, d+i, ab, ab);      // window
      
      page.fillRect (g+t, h+m, ab, ab);      // window
      page.fillRect (g+u, h+p, ab, ab);      // window
      page.fillRect (g+v, h+d, ab, ab);      // window
      
      page.fillRect (k+w, l+fa, ab, ab);      // window
      page.fillRect (k+x, l+ga, ab, ab);      // window
      page.fillRect (k+y, l+ha, ab, ab);      // window
      
      page.fillRect (o+z, p+ia, ab, ab);      // window
      page.fillRect (o+aa, p+ja, ab, ab);      // window
      page.fillRect (o+ba, p+ka, ab, ab);      // window
      
      page.fillRect (c+ca, d+la, ab, ab);      // window
      page.fillRect (g+da, h+ma, ab, ab);      // window
      page.fillRect (k+ea, l+na, ab, ab);      // window
      }
      page.setColor (Color.white);
      page.drawLine (0, 225, 550, 225); //boardwalk line
      page.drawLine (0, 195, 550, 195); //boardwalk vertical lines
      page.drawLine (50, 225, 50, 240);
     
       }
}