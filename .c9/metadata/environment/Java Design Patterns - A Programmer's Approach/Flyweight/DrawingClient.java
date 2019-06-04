{"filter":false,"title":"DrawingClient.java","tooltip":"/Java Design Patterns - A Programmer's Approach/Flyweight/DrawingClient.java","undoManager":{"mark":31,"position":31,"stack":[[{"start":{"row":0,"column":0},"end":{"row":2,"column":22},"action":"insert","lines":["package com.journaldev.design.flyweight;","import java.awt.BorderLayout;","import java.awt.Color;"],"id":1}],[{"start":{"row":2,"column":22},"end":{"row":3,"column":0},"action":"insert","lines":["",""],"id":2}],[{"start":{"row":3,"column":0},"end":{"row":38,"column":37},"action":"insert","lines":["import java.awt.Container;","import java.awt.Graphics;","import java.awt.event.ActionEvent;","import java.awt.event.ActionListener;","import javax.swing.JButton;","import javax.swing.JFrame;","import javax.swing.JPanel;","import com.journaldev.design.flyweight.ShapeFactory.ShapeType;","public class DrawingClient extends JFrame{","private static final long serialVersionUID = -1350200437285282550L;","private final int WIDTH;","private final int HEIGHT;","private static final ShapeType shapes[] = { ShapeType.LINE,","ShapeType.OVAL_FILL,ShapeType.OVAL_NOFILL };","private static final Color colors[] = { Color.RED, Color.GREEN,","Color.YELLOW };","public DrawingClient(int width, int height){","this.WIDTH=width;","this.HEIGHT=height;","Container contentPane = getContentPane();","JButton startButton = new JButton(\"Draw\");","final JPanel panel = new JPanel();","contentPane.add(panel, BorderLayout.CENTER);","contentPane.add(startButton, BorderLayout.SOUTH);","setSize(WIDTH, HEIGHT);","setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);","setVisible(true);","startButton.addActionListener(new ActionListener() {","public void actionPerformed(ActionEvent event) {","Graphics g = panel.getGraphics();","for (int i = 0; i < 20; ++i) {","Shape shape =","ShapeFactory.getShape(getRandomShape());","shape.draw(g, getRandomX(), getRandomY(),","getRandomWidth(),","getRandomHeight(), getRandomColor());"],"id":3}],[{"start":{"row":38,"column":37},"end":{"row":39,"column":0},"action":"insert","lines":["",""],"id":4}],[{"start":{"row":39,"column":0},"end":{"row":64,"column":1},"action":"insert","lines":["}","}","});","}","private ShapeType getRandomShape() {","return shapes[(int) (Math.random() * shapes.length)];","}","private int getRandomX() {","return (int) (Math.random() * WIDTH);","}","private int getRandomY() {","return (int) (Math.random() * HEIGHT);","}","private int getRandomWidth() {","return (int) (Math.random() * (WIDTH / 10));","}","private int getRandomHeight() {","return (int) (Math.random() * (HEIGHT / 10));","}","private Color getRandomColor() {","return colors[(int) (Math.random() * colors.length)];","}","public static void main(String[] args) {","DrawingClient drawing = new DrawingClient(500,600);","}","}"],"id":5}],[{"start":{"row":12,"column":0},"end":{"row":12,"column":4},"action":"insert","lines":["    "],"id":6},{"start":{"row":13,"column":0},"end":{"row":13,"column":4},"action":"insert","lines":["    "]},{"start":{"row":14,"column":0},"end":{"row":14,"column":4},"action":"insert","lines":["    "]},{"start":{"row":15,"column":0},"end":{"row":15,"column":4},"action":"insert","lines":["    "]},{"start":{"row":16,"column":0},"end":{"row":16,"column":4},"action":"insert","lines":["    "]},{"start":{"row":17,"column":0},"end":{"row":17,"column":4},"action":"insert","lines":["    "]},{"start":{"row":18,"column":0},"end":{"row":18,"column":4},"action":"insert","lines":["    "]},{"start":{"row":19,"column":0},"end":{"row":19,"column":4},"action":"insert","lines":["    "]},{"start":{"row":20,"column":0},"end":{"row":20,"column":4},"action":"insert","lines":["    "]},{"start":{"row":21,"column":0},"end":{"row":21,"column":4},"action":"insert","lines":["    "]},{"start":{"row":22,"column":0},"end":{"row":22,"column":4},"action":"insert","lines":["    "]},{"start":{"row":23,"column":0},"end":{"row":23,"column":4},"action":"insert","lines":["    "]},{"start":{"row":24,"column":0},"end":{"row":24,"column":4},"action":"insert","lines":["    "]},{"start":{"row":25,"column":0},"end":{"row":25,"column":4},"action":"insert","lines":["    "]},{"start":{"row":26,"column":0},"end":{"row":26,"column":4},"action":"insert","lines":["    "]},{"start":{"row":27,"column":0},"end":{"row":27,"column":4},"action":"insert","lines":["    "]},{"start":{"row":28,"column":0},"end":{"row":28,"column":4},"action":"insert","lines":["    "]},{"start":{"row":29,"column":0},"end":{"row":29,"column":4},"action":"insert","lines":["    "]},{"start":{"row":30,"column":0},"end":{"row":30,"column":4},"action":"insert","lines":["    "]},{"start":{"row":31,"column":0},"end":{"row":31,"column":4},"action":"insert","lines":["    "]},{"start":{"row":32,"column":0},"end":{"row":32,"column":4},"action":"insert","lines":["    "]},{"start":{"row":33,"column":0},"end":{"row":33,"column":4},"action":"insert","lines":["    "]},{"start":{"row":34,"column":0},"end":{"row":34,"column":4},"action":"insert","lines":["    "]},{"start":{"row":35,"column":0},"end":{"row":35,"column":4},"action":"insert","lines":["    "]},{"start":{"row":36,"column":0},"end":{"row":36,"column":4},"action":"insert","lines":["    "]},{"start":{"row":37,"column":0},"end":{"row":37,"column":4},"action":"insert","lines":["    "]},{"start":{"row":38,"column":0},"end":{"row":38,"column":4},"action":"insert","lines":["    "]},{"start":{"row":39,"column":0},"end":{"row":39,"column":4},"action":"insert","lines":["    "]},{"start":{"row":40,"column":0},"end":{"row":40,"column":4},"action":"insert","lines":["    "]},{"start":{"row":41,"column":0},"end":{"row":41,"column":4},"action":"insert","lines":["    "]},{"start":{"row":42,"column":0},"end":{"row":42,"column":4},"action":"insert","lines":["    "]},{"start":{"row":43,"column":0},"end":{"row":43,"column":4},"action":"insert","lines":["    "]},{"start":{"row":44,"column":0},"end":{"row":44,"column":4},"action":"insert","lines":["    "]},{"start":{"row":45,"column":0},"end":{"row":45,"column":4},"action":"insert","lines":["    "]},{"start":{"row":46,"column":0},"end":{"row":46,"column":4},"action":"insert","lines":["    "]},{"start":{"row":47,"column":0},"end":{"row":47,"column":4},"action":"insert","lines":["    "]},{"start":{"row":48,"column":0},"end":{"row":48,"column":4},"action":"insert","lines":["    "]},{"start":{"row":49,"column":0},"end":{"row":49,"column":4},"action":"insert","lines":["    "]},{"start":{"row":50,"column":0},"end":{"row":50,"column":4},"action":"insert","lines":["    "]},{"start":{"row":51,"column":0},"end":{"row":51,"column":4},"action":"insert","lines":["    "]},{"start":{"row":52,"column":0},"end":{"row":52,"column":4},"action":"insert","lines":["    "]},{"start":{"row":53,"column":0},"end":{"row":53,"column":4},"action":"insert","lines":["    "]},{"start":{"row":54,"column":0},"end":{"row":54,"column":4},"action":"insert","lines":["    "]},{"start":{"row":55,"column":0},"end":{"row":55,"column":4},"action":"insert","lines":["    "]},{"start":{"row":56,"column":0},"end":{"row":56,"column":4},"action":"insert","lines":["    "]},{"start":{"row":57,"column":0},"end":{"row":57,"column":4},"action":"insert","lines":["    "]},{"start":{"row":58,"column":0},"end":{"row":58,"column":4},"action":"insert","lines":["    "]},{"start":{"row":59,"column":0},"end":{"row":59,"column":4},"action":"insert","lines":["    "]},{"start":{"row":60,"column":0},"end":{"row":60,"column":4},"action":"insert","lines":["    "]},{"start":{"row":61,"column":0},"end":{"row":61,"column":4},"action":"insert","lines":["    "]},{"start":{"row":62,"column":0},"end":{"row":62,"column":4},"action":"insert","lines":["    "]},{"start":{"row":63,"column":0},"end":{"row":63,"column":4},"action":"insert","lines":["    "]}],[{"start":{"row":10,"column":62},"end":{"row":11,"column":0},"action":"insert","lines":["",""],"id":7}],[{"start":{"row":15,"column":29},"end":{"row":16,"column":0},"action":"insert","lines":["",""],"id":8},{"start":{"row":16,"column":0},"end":{"row":16,"column":4},"action":"insert","lines":["    "]}],[{"start":{"row":18,"column":2},"end":{"row":18,"column":3},"action":"remove","lines":[" "],"id":9},{"start":{"row":18,"column":1},"end":{"row":18,"column":2},"action":"remove","lines":[" "]},{"start":{"row":18,"column":0},"end":{"row":18,"column":1},"action":"remove","lines":[" "]},{"start":{"row":17,"column":63},"end":{"row":18,"column":0},"action":"remove","lines":["",""]}],[{"start":{"row":19,"column":0},"end":{"row":19,"column":4},"action":"remove","lines":["    "],"id":10},{"start":{"row":18,"column":67},"end":{"row":19,"column":0},"action":"remove","lines":["",""]}],[{"start":{"row":18,"column":67},"end":{"row":18,"column":68},"action":"insert","lines":[" "],"id":11}],[{"start":{"row":20,"column":0},"end":{"row":20,"column":4},"action":"insert","lines":["    "],"id":12},{"start":{"row":21,"column":0},"end":{"row":21,"column":4},"action":"insert","lines":["    "]},{"start":{"row":22,"column":0},"end":{"row":22,"column":4},"action":"insert","lines":["    "]},{"start":{"row":23,"column":0},"end":{"row":23,"column":4},"action":"insert","lines":["    "]},{"start":{"row":24,"column":0},"end":{"row":24,"column":4},"action":"insert","lines":["    "]},{"start":{"row":25,"column":0},"end":{"row":25,"column":4},"action":"insert","lines":["    "]},{"start":{"row":26,"column":0},"end":{"row":26,"column":4},"action":"insert","lines":["    "]},{"start":{"row":27,"column":0},"end":{"row":27,"column":4},"action":"insert","lines":["    "]},{"start":{"row":28,"column":0},"end":{"row":28,"column":4},"action":"insert","lines":["    "]},{"start":{"row":29,"column":0},"end":{"row":29,"column":4},"action":"insert","lines":["    "]},{"start":{"row":30,"column":0},"end":{"row":30,"column":4},"action":"insert","lines":["    "]},{"start":{"row":31,"column":0},"end":{"row":31,"column":4},"action":"insert","lines":["    "]},{"start":{"row":32,"column":0},"end":{"row":32,"column":4},"action":"insert","lines":["    "]},{"start":{"row":33,"column":0},"end":{"row":33,"column":4},"action":"insert","lines":["    "]},{"start":{"row":34,"column":0},"end":{"row":34,"column":4},"action":"insert","lines":["    "]},{"start":{"row":35,"column":0},"end":{"row":35,"column":4},"action":"insert","lines":["    "]},{"start":{"row":36,"column":0},"end":{"row":36,"column":4},"action":"insert","lines":["    "]},{"start":{"row":37,"column":0},"end":{"row":37,"column":4},"action":"insert","lines":["    "]},{"start":{"row":38,"column":0},"end":{"row":38,"column":4},"action":"insert","lines":["    "]},{"start":{"row":39,"column":0},"end":{"row":39,"column":4},"action":"insert","lines":["    "]},{"start":{"row":40,"column":0},"end":{"row":40,"column":4},"action":"insert","lines":["    "]},{"start":{"row":41,"column":0},"end":{"row":41,"column":4},"action":"insert","lines":["    "]}],[{"start":{"row":34,"column":0},"end":{"row":34,"column":4},"action":"insert","lines":["    "],"id":13},{"start":{"row":35,"column":0},"end":{"row":35,"column":4},"action":"insert","lines":["    "]},{"start":{"row":36,"column":0},"end":{"row":36,"column":4},"action":"insert","lines":["    "]},{"start":{"row":37,"column":0},"end":{"row":37,"column":4},"action":"insert","lines":["    "]},{"start":{"row":38,"column":0},"end":{"row":38,"column":4},"action":"insert","lines":["    "]}],[{"start":{"row":35,"column":8},"end":{"row":35,"column":12},"action":"remove","lines":["    "],"id":14},{"start":{"row":35,"column":4},"end":{"row":35,"column":8},"action":"remove","lines":["    "]},{"start":{"row":35,"column":0},"end":{"row":35,"column":4},"action":"remove","lines":["    "]},{"start":{"row":34,"column":25},"end":{"row":35,"column":0},"action":"remove","lines":["",""]}],[{"start":{"row":34,"column":25},"end":{"row":34,"column":26},"action":"insert","lines":[" "],"id":15}],[{"start":{"row":32,"column":0},"end":{"row":32,"column":4},"action":"insert","lines":["    "],"id":16},{"start":{"row":33,"column":0},"end":{"row":33,"column":4},"action":"insert","lines":["    "]},{"start":{"row":34,"column":0},"end":{"row":34,"column":4},"action":"insert","lines":["    "]},{"start":{"row":35,"column":0},"end":{"row":35,"column":4},"action":"insert","lines":["    "]},{"start":{"row":36,"column":0},"end":{"row":36,"column":4},"action":"insert","lines":["    "]},{"start":{"row":37,"column":0},"end":{"row":37,"column":4},"action":"insert","lines":["    "]},{"start":{"row":38,"column":0},"end":{"row":38,"column":4},"action":"insert","lines":["    "]}],[{"start":{"row":31,"column":0},"end":{"row":31,"column":4},"action":"insert","lines":["    "],"id":17},{"start":{"row":32,"column":0},"end":{"row":32,"column":4},"action":"insert","lines":["    "]},{"start":{"row":33,"column":0},"end":{"row":33,"column":4},"action":"insert","lines":["    "]},{"start":{"row":34,"column":0},"end":{"row":34,"column":4},"action":"insert","lines":["    "]},{"start":{"row":35,"column":0},"end":{"row":35,"column":4},"action":"insert","lines":["    "]},{"start":{"row":36,"column":0},"end":{"row":36,"column":4},"action":"insert","lines":["    "]},{"start":{"row":37,"column":0},"end":{"row":37,"column":4},"action":"insert","lines":["    "]},{"start":{"row":38,"column":0},"end":{"row":38,"column":4},"action":"insert","lines":["    "]},{"start":{"row":39,"column":0},"end":{"row":39,"column":4},"action":"insert","lines":["    "]}],[{"start":{"row":29,"column":25},"end":{"row":30,"column":0},"action":"insert","lines":["",""],"id":18},{"start":{"row":30,"column":0},"end":{"row":30,"column":8},"action":"insert","lines":["        "]}],[{"start":{"row":44,"column":4},"end":{"row":44,"column":8},"action":"insert","lines":["    "],"id":19}],[{"start":{"row":47,"column":4},"end":{"row":47,"column":8},"action":"insert","lines":["    "],"id":20}],[{"start":{"row":50,"column":4},"end":{"row":50,"column":8},"action":"insert","lines":["    "],"id":21}],[{"start":{"row":53,"column":4},"end":{"row":53,"column":8},"action":"insert","lines":["    "],"id":22}],[{"start":{"row":56,"column":4},"end":{"row":56,"column":8},"action":"insert","lines":["    "],"id":23}],[{"start":{"row":59,"column":4},"end":{"row":59,"column":8},"action":"insert","lines":["    "],"id":24}],[{"start":{"row":62,"column":4},"end":{"row":62,"column":8},"action":"insert","lines":["    "],"id":25}],[{"start":{"row":60,"column":5},"end":{"row":61,"column":0},"action":"insert","lines":["",""],"id":26},{"start":{"row":61,"column":0},"end":{"row":61,"column":4},"action":"insert","lines":["    "]}],[{"start":{"row":57,"column":5},"end":{"row":58,"column":0},"action":"insert","lines":["",""],"id":27},{"start":{"row":58,"column":0},"end":{"row":58,"column":4},"action":"insert","lines":["    "]}],[{"start":{"row":54,"column":5},"end":{"row":55,"column":0},"action":"insert","lines":["",""],"id":28},{"start":{"row":55,"column":0},"end":{"row":55,"column":4},"action":"insert","lines":["    "]}],[{"start":{"row":51,"column":5},"end":{"row":52,"column":0},"action":"insert","lines":["",""],"id":29},{"start":{"row":52,"column":0},"end":{"row":52,"column":4},"action":"insert","lines":["    "]}],[{"start":{"row":48,"column":5},"end":{"row":49,"column":0},"action":"insert","lines":["",""],"id":30},{"start":{"row":49,"column":0},"end":{"row":49,"column":4},"action":"insert","lines":["    "]}],[{"start":{"row":45,"column":5},"end":{"row":46,"column":0},"action":"insert","lines":["",""],"id":31},{"start":{"row":46,"column":0},"end":{"row":46,"column":4},"action":"insert","lines":["    "]}],[{"start":{"row":42,"column":5},"end":{"row":43,"column":0},"action":"insert","lines":["",""],"id":33},{"start":{"row":43,"column":0},"end":{"row":43,"column":4},"action":"insert","lines":["    "]}]]},"ace":{"folds":[],"scrolltop":720,"scrollleft":0,"selection":{"start":{"row":43,"column":4},"end":{"row":43,"column":4},"isBackwards":false},"options":{"guessTabSize":true,"useWrapMode":false,"wrapToView":true},"firstLineState":{"row":36,"state":"start","mode":"ace/mode/java"}},"timestamp":1559651923854,"hash":"5afc63d19d230c7eae6fe1c49f9eea77de01d368"}