import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

public class PetSelectorWithImages extends JFrame implements ActionListener {
    private JRadioButton birdButton, catButton, dogButton, rabbitButton, pigButton;
    private ButtonGroup group;
    private JLabel imageLabel;

    public PetSelectorWithImages() {
        // Set up the frame
        setTitle("Pet Selector");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Initialize radio buttons
        birdButton = new JRadioButton("Bird");
        catButton = new JRadioButton("Cat");
        dogButton = new JRadioButton("Dog");
        rabbitButton = new JRadioButton("Rabbit");
        pigButton = new JRadioButton("Pig");

        // Add action listeners to radio buttons
        birdButton.addActionListener(this);
        catButton.addActionListener(this);
        dogButton.addActionListener(this);
        rabbitButton.addActionListener(this);
        pigButton.addActionListener(this);

        // Group radio buttons
        group = new ButtonGroup();
        group.add(birdButton);
        group.add(catButton);
        group.add(dogButton);
        group.add(rabbitButton);
        group.add(pigButton);

        // Initialize image label
        imageLabel = new JLabel();
        imageLabel.setPreferredSize(new Dimension(300, 300));
        imageLabel.setHorizontalAlignment(JLabel.CENTER);

        // Add components to frame
        add(birdButton);
        add(catButton);
        add(dogButton);
        add(rabbitButton);
        add(pigButton);
        add(imageLabel);

        // Make  frame visible
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String imagePath = "";
        if (birdButton.isSelected()) {
            imagePath = "images/bird.png";
        } else if (catButton.isSelected()) {
            imagePath = "images/cat.png";
        } else if (dogButton.isSelected()) {
            imagePath = "images/dog.png";
        } else if (rabbitButton.isSelected()) {
            imagePath = "images/rabbit.png";
        } else if (pigButton.isSelected()) {
            imagePath = "images/pig.png";
        }
        imageLabel.setIcon(new ImageIcon(imagePath));
    }

    public static void main(String[] args) {
        // Set the look and feel to the system's default
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        new PetSelectorWithImages();
    }
}
