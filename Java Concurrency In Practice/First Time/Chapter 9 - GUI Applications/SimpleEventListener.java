public class SimpleEventListener {
    public static void main(String[] args) {
        final Random random = new Random();
        final JButton button = new JButton("Change Color");

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                button.setBackground(new Color(random.nextInt()));
            }
        });
    }
}