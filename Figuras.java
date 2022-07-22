import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;

public class Figuras extends JPanel {
    private int opcion;

    public Figuras(int opcionUsuario){
        this.opcion = opcionUsuario;
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);

        for(int i=0; i<10; i++){

            switch (opcion) {
                case 1:

                    g.setColor( Color.YELLOW );
                    g.fillOval( 10, 10, 200, 200 );

                    g.setColor( Color.BLACK );
                    g.fillOval( 55, 65, 30, 30 ); //ojo izquierdo
                    g.fillOval( 135, 65, 30, 30 );//Ojo Derecho


                    g.fillOval( 50, 110, 120, 60 );//Boca abierta

                    g.setColor( Color.YELLOW );
                    g.fillRect( 50, 110, 120, 30 );//Relleno de boca
                    g.fillOval( 50, 120, 120, 40 );//Carita Feli
                    break;
                case 2:
                    g.setColor( Color.YELLOW );
                    g.fillOval( 10, 10, 200, 200 );

                    g.setColor( Color.BLACK );
                    g.fillOval( 55, 65, 30, 30); //ojo izquierdo
                    //g.fillOval( 55, 75, 30, 10); //ojo izquierdo
                    g.fillOval( 135, 65, 30, 30 );//Ojo Derecho


                    g.fillOval( 50, 110, 120, 60 );//Boca abierta

                    g.setColor( Color.YELLOW );
                    //g.fillRect( 50, 110, 120, 30 );//Relleno de boca
                    g.fillOval( 50, 120, 120, 50 );
                    break;

                case 3:
                    g.setColor( Color.YELLOW );
                    g.fillOval( 10, 10, 200, 200 );

                    g.setColor( Color.BLACK );
                    g.fillOval( 55, 65, 30, 30); //ojo izquierdo
                    g.fillOval( 135, 65, 30, 30 );//Ojo Derecho


                    g.fillOval( 50, 110, 120, 60 );//Boca abierta

                    g.setColor( Color.YELLOW );
                    g.fillRect( 50, 110, 120, 30 );//Relleno de boca

                    break;
                case 4:
                    g.setColor( Color.YELLOW );
                    g.fillOval( 10, 10, 200, 200 );

                    g.setColor( Color.BLACK );
                    g.fillOval( 55, 85, 40, 5); //ojo izquierdo guiño
                    g.fillOval( 135, 65, 30, 30 );//Ojo Derecho


                    g.fillOval( 50, 110, 120, 60 );//Boca abierta

                    g.setColor( Color.YELLOW );
                    g.fillRect( 50, 110, 120, 30 );//Relleno de boca
                    g.fillOval( 50, 120, 120, 40 );//Carita Feli

                    break;
                case 5:
                    g.setColor(Color.YELLOW);
                    g.fillOval(10, 10, 200, 200);

                    g.setColor(Color.BLACK);
                    g.fillOval(50,60, 30, 30);
                    g.fillOval(130,60, 30, 30);

                    g.fillOval(60, 110, 90, 70);

                    break;
                case 6:
                    g.setColor( Color.YELLOW );
                    g.fillOval( 10, 10, 200, 200 );

                    g.setColor( Color.BLACK );
                    g.fillOval( 55, 65, 30, 30); //ojo izquierdo
                    g.fillOval( 135, 65, 30, 30 );//Ojo Derecho

                    g.fillRect(55,140,110,5);
                    break;
                case 7:
                    g.setColor( Color.YELLOW );
                    g.fillOval( 10, 10, 200, 200 );

                    g.setColor( Color.BLACK );
                    g.fillRect(55,85,40,5);
                    g.fillRect(135,85,40,5);

                    g.fillRect(55,140,110,5);
                    break;
                case 8:

                    g.setColor( Color.YELLOW );
                    g.fillOval( 10, 10, 200, 200 );

                    g.setColor( Color.BLACK );
                    g.fillOval( 55, 65, 30, 30); //ojo izquierdo
                    g.fillOval( 135, 65, 30, 30 );//Ojo Derecho

                    g.setColor( Color.YELLOW );
                    g.fillRect( 50, 110, 120, 30 );//Relleno de boca
                    g.fillOval( 50, 120, 120, 50 );//Carita Feli
                    break;
                case 9:
                    int[] X1={130,150,210,160,180,130,80,100,50,110};
                    int[] Y1={20,90,90,130,200,160,200,130,90,90};
                    int n1=10;

                    g.setColor(Color.YELLOW);
                    g.drawPolygon(X1,Y1,n1);
                    g.fillPolygon(X1,Y1,n1);
                    break;
                case 10:
                    int[] X2={10,10,30,130,150,150,80};
                    int[] Y2={70,40,20,20,40,70,140};
                    int n2=7;

                    g.setColor(Color.CYAN);
                    g.drawPolygon(X2,Y2,n2);
                    g.fillPolygon(X2,Y2,n2);

                    break;
                case 11:
                    int[] X3={10,10,30,100,78,50,130,150,150,80};
                    int[] Y3={70,40,20,20,40,20,20,40,70,140};
                    int n3=10;

                    g.setColor(Color.RED);
                    g.drawPolygon(X3,Y3,n3);
                    g.fillPolygon(X3,Y3,n3);
                    break;
                case 12:
                    int[] X4={80,60,40,50,50,70,70,90,90,110,110,120,100};
                    int[] Y4={60,80,100,100,150,150,130,130,150,150,100,100,80};
                    int n4=13;

                    g.setColor(Color.DARK_GRAY);
                    g.drawPolygon(X4,Y4,n4);
                    g.fillPolygon(X4,Y4,n4);
                    break;

            }

        }

    }
}
