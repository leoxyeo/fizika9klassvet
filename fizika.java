import javax.swing.AbstractAction;

class fizika {
    public static void main(String args[]) {
        double a; //исходное значение 1
        double b; //исходное значение 2
        double c; //исходное значение 3
        double aa; //значение в симуляции 1
        double bb; //значение в симуляции 2
        double cc; //значение в симуляции 3
        double aaa; //значение y в симуляции 1
        double bbb; //значение y в симуляции 2
        double ccc; //значение y в симуляции 3
        a = 8;
        b = 22;
        c = 59;
        aa = 8.0;
        bb = 22.0;
        cc = 59.0;
        aaa = 5.0;
        bbb = 15.0;
        ccc = 49.0;
        
              double g1 = aa;
              double r1 = Math.toRadians(g1);
              double g2 = bb;
              double r2 = Math.toRadians(g2);
              double g3 = cc;
              double r3 = Math.toRadians(g3);
              double g4 = aaa;
              double r4 = Math.toRadians(g4);
              double g5 = bbb;
              double r5 = Math.toRadians(g5);
              double g6 = ccc;
              double r6 = Math.toRadians(g6);

              System.out.println("1.1 = " + a);
              System.out.println("1.2 = " + b);
              System.out.println("1.3 = " + c);
              System.out.format("2.1 Синус %.1f градусов равен %.4f%n", g1, Math.sin(r1));
              System.out.format("2.2 Синус %.1f градусов равен %.4f%n", g2, Math.sin(r2));
              System.out.format("2.3 Синус %.1f градусов равен %.4f%n", g3, Math.sin(r3));
              System.out.println("3.1 = " + aaa);
              System.out.println("3.2 = " + bbb);
              System.out.println("3.3 = " + ccc);
              System.out.format("4.1 yСинус %.1f градусов равен %.4f%n", g4, Math.sin(r4));
              System.out.format("4.2 yСинус %.1f градусов равен %.4f%n", g5, Math.sin(r5));
              System.out.format("4.3 yСинус %.1f градусов равен %.4f%n", g6, Math.sin(r6));
              System.out.println("5.1 = " + aa / aaa);
              System.out.println("5.2 = " + bb / bbb);
              System.out.println("5.3 = " + cc / ccc);

    }
}
