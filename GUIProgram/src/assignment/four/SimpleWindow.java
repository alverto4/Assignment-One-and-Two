package assignment.four;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SimpleWindow implements ActionListener{
    JFrame areaFrame;
    JPanel areaPanel;
    JTextField radius;
    JLabel radiusLabel, areaLabel;
    JButton calcArea;

    //This is the method where we create our Frame/Window for our applet
    public SimpleWindow(){
        areaFrame = new JFrame("Area of Circle");
        areaFrame.setLocationRelativeTo(null);
        areaFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        areaFrame.setSize(400,120);

        areaPanel = new JPanel(new GridLayout(2,2));

        addWidgets();

        areaFrame.getRootPane().setDefaultButton(calcArea);

        areaFrame.getContentPane().add(areaPanel, BorderLayout.CENTER);

        areaFrame.setVisible(true);
    }

    //This is the method for creating our widgets/objects to be placed on out applet window
    private void addWidgets(){
        radius = new JTextField(2);
        radiusLabel = new JLabel("Radius", SwingConstants.LEFT);
        calcArea = new JButton("Calculate");
        areaLabel = new JLabel("Area", SwingConstants.LEFT);

        calcArea.addActionListener(this);

        //Here is where we add the components to the panel which is located on our applet's window
        areaPanel.add(radius);
        areaPanel.add(radiusLabel);
        areaPanel.add(calcArea);
        areaPanel.add(areaLabel);

        radiusLabel.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
        areaLabel.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
    }

    //This method shows what is to be done upon clicking of the button "Calculate"
    public void actionPerformed(ActionEvent event){
        double radii = Double.parseDouble(radius.getText());
        double areaCircle = radii * radii * Math.PI;
        double areaCircleRounded = Math.round(areaCircle * 1000D) / 1000D;
        areaLabel.setText(areaCircleRounded + " units square");
    }

    //This method creates the object of which will make our GUI become visible
    private static void createAndShowGUI(){

        SimpleWindow calculator = new SimpleWindow();
    }

    public static void main(String[] args){

        createAndShowGUI();
    }
}
