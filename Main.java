import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.BasicStroke;

class Path {
    Node head;
    Node tail;

    public class Node {
        int d;
        Node next;

        Node() {
            this.next = null;
        }

        Node(int data) {
            d = data;
            next = null;
        }
    }

    public Node createPath() {
        Node[] red = new Node[12];
        Node[] green = new Node[12];
        Node[] blue = new Node[12];
        Node[] yellow = new Node[12];
        for (int i = 0; i < 12; i++) {
            red[i].data = 0;
            green[i].data = 1;
            yellow[i].data = 2;
            blue[i].data = 3;
        }
        Node redtail = new Node(0);
        Node greentail = new Node(1);
        Node yellowtail = new Node(2);
        Node bluetail = new Node(3);
        Node[] path = new Node[4];
        path[0] = red[0];
        path[1] = green[0];
        path[2] = yellow[0];
        path[3] = blue[0];
        red[11].next = redtail;
        green[11].next = greentail;
        yellow[11].next = yellowtail;
        blue[11].next = bluetail;
        redtail.next = green[0];
        greentail.next = yellow[0];
        yellowtail.next = blue[0];
        bluetail.next = red[0];
    }
}

class Layout extends JPanel {
    int x, y, width, height;

    public Layout(int xi, int yi) {
        x = xi;
        y = yi;
        width = 30;
        height = 30;
    }

    public void draw(Graphics2D g) {
        g.setColor(Color.WHITE);
        g.fillRect(x, y, 15 * width, 15 * height);
        for (int i = 0; i < 6; i++) {
            g.setColor(new Color(0xE7210A));
            g.fillRect(x + (i * width), y, width, height);
            g.fillRect(x, y + (i * height), width, height);
            g.fillRect(x + (i * width), y + (5 * height), width, height);
            g.fillRect(x + (5 * width), y + (i * height), width, height);
            g.setColor(new Color(0x0DED0A));
            g.fillRect(x + ((i + 9) * width), y, width, height);
            g.fillRect(x + (9 * width), y + (i * height), width, height);
            g.fillRect(x + ((i + 9) * width), y + (5 * height), width, height);
            g.fillRect(x + (14 * width), y + (i * height), width, height);
            g.setColor(new Color(0xF9F905));
            g.fillRect(x + ((i + 9) * width), y + (9 * height), width, height);
            g.fillRect(x + (9 * width), y + ((i + 9) * height), width, height);
            g.fillRect(x + ((i + 9) * width), y + (14 * height), width, height);
            g.fillRect(x + (14 * width), y + ((i + 9) * height), width, height);
            g.setColor(new Color(0x3854D3));
            g.fillRect(x + (i * width), y + (9 * height), width, height);
            g.fillRect(x, y + ((i + 9) * height), width, height);
            g.fillRect(x + (i * width), y + (14 * height), width, height);
            g.fillRect(x + (5 * width), y + ((i + 9) * height), width, height);
        }

        for (int i = 1; i < 6; i++) {
            g.setColor(new Color(0xE7210A));
            g.fillRect(x + (i * width), y + (7 * height), width, height);
            g.setColor(new Color(0xF9F905));
            g.fillRect(x + ((8 + i) * width), y + (7 * height), width, height);
            g.setColor(new Color(0x0DED0A));
            g.fillRect(x + (7 * width), y + (i * height), width, height);
            g.setColor(new Color(0x3854D3));
            g.fillRect(x + ((7) * width), y + ((8 + i) * height), width, height);
        }

        g.setColor(new Color(0xE7210A));
        g.fillRect(x + (1 * width), y + (6 * height), width, height);
        g.setColor(new Color(0xF9F905));
        g.fillRect(x + ((13) * width), y + (8 * height), width, height);
        g.setColor(new Color(0x0DED0A));
        g.fillRect(x + (8 * width), y + (1 * height), width, height);
        g.setColor(new Color(0x3854D3));
        g.fillRect(x + ((6) * width), y + ((13) * height), width, height);

        int temp1 = x + 45, temp2 = y + 45;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                g.setColor(new Color(0xE7210A));
                g.fillRect(temp1 + (2 * i * width), temp2 + (2 * j * height), width, height);
                g.setColor(new Color(0xF9F905));
                g.fillRect(temp1 + (2 * i * width) + 9 * width, temp2 + (2 * j * height) + 9 * height, width, height);
                g.setColor(new Color(0x0DED0A));
                g.fillRect(temp1 + (2 * i * width) + 9 * width, temp2 + (2 * j * height) + 0 * height, width, height);
                g.setColor(new Color(0x3854D3));
                g.fillRect(temp1 + (2 * i * width) + 0 * width, temp2 + (2 * j * height) + 9 * height, width, height);
            }
        }

        g.setColor(new Color(0xE7210A));
        int xpoints0[] = { x + (6 * width), x + (6 * width), x + 15 + (7 * width) };
        int ypoints0[] = { y + (6 * height), y + (9 * height), y + 15 + (7 * width) };
        int npoints = 3;
        g.fillPolygon(xpoints0, ypoints0, npoints);
        g.setColor(new Color(0xF9F905));
        int xpoints1[] = { x + (9 * width), x + (9 * width), x + 15 + (7 * width) };
        int ypoints1[] = { y + (6 * height), y + (9 * height), y + 15 + (7 * width) };
        int npoints1 = 3;
        g.fillPolygon(xpoints1, ypoints1, npoints1);
        g.setColor(new Color(0x0DED0A));
        int xpoints2[] = { x + (6 * width), x + (9 * width), x + 15 + (7 * width) };
        int ypoints2[] = { y + (6 * height), y + (6 * height), y + 15 + (7 * width) };
        int npoints2 = 3;
        g.fillPolygon(xpoints2, ypoints2, npoints2);
        g.setColor(new Color(0x3854D3));
        int xpoints3[] = { x + (6 * width), x + (9 * width), x + 15 + (7 * width) };
        int ypoints3[] = { y + (9 * height), y + (9 * height), y + 15 + (7 * width) };
        int npoints3 = 3;
        g.fillPolygon(xpoints3, ypoints3, npoints3);

        g.setStroke(new BasicStroke(2));
        g.setColor(Color.BLACK);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                g.drawRect(x + ((i + 6) * width), y + (j * height), width, height);
                g.drawRect(x + ((j) * width), y + ((i + 6) * height), width, height);
                g.drawRect(x + ((i + 6) * width), y + ((j + 9) * height), width, height);
                g.drawRect(x + ((j + 9) * width), y + ((i + 6) * height), width, height);
            }
        }
        g.drawRect(x + ((1) * width), y + (1 * height), 4 * width, 4 * height);
        g.drawRect(x + ((10) * width), y + (1 * height), 4 * width, 4 * height);
        g.drawRect(x + ((1) * width), y + (10 * height), 4 * width, 4 * height);
        g.drawRect(x + ((10) * width), y + (10 * height), 4 * width, 4 * height);
        g.drawRect(x, y, 15 * width, 15 * height);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                g.drawRect(temp1 + (2 * i * width), temp2 + (2 * j * height), width, height);
                g.drawRect(temp1 + (2 * i * width) + 9 * width, temp2 + (2 * j * height) + 9 * height, width, height);
                g.drawRect(temp1 + (2 * i * width) + 9 * width, temp2 + (2 * j * height) + 0 * height, width, height);
                g.drawRect(temp1 + (2 * i * width) + 0 * width, temp2 + (2 * j * height) + 9 * height, width, height);
            }
        }
        g.drawPolygon(xpoints0, ypoints0, npoints);
        g.drawPolygon(xpoints1, ypoints1, npoints1);
        g.drawPolygon(xpoints2, ypoints2, npoints2);
        g.drawPolygon(xpoints3, ypoints3, npoints3);
        g.drawOval(x + 5 + (6 * width), y + 5 + (2 * height), width - 10, height - 10);
        g.drawOval(x + 5 + (12 * width), y + 5 + (6 * height), width - 10, height - 10);
        g.drawOval(x + 5 + (8 * width), y + 5 + (12 * height), width - 10, height - 10);
        g.drawOval(x + 5 + (2 * width), y + 5 + (8 * height), width - 10, height - 10);
    }

    public void paint(Graphics g) {
        draw((Graphics2D) g);
    }
}

class Main {
    public static void main(String[] args) {
        JFrame jframe = new JFrame();
        jframe.setBounds(10, 10, 1000, 600);
        jframe.setTitle("Ludo by Dev, Dhruv and Sahil");
        jframe.setResizable(false);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Layout board = new Layout(80, 50);
        jframe.add(board);
        jframe.setVisible(true);
        ImageIcon image = new ImageIcon("logo.png");
        jframe.setIconImage(image.getImage());
        jframe.getContentPane().setBackground(new Color(0x123456));
    }
}
