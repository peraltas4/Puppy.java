//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//  Creating an SAD PIG  Author: Steffanie Peralta-Duran
//
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;

public class SADPIG extends Application {

    //-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    //  Presents an adorable PIG
    //-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

    public void start(Stage primaryStage)

    //-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    //  Starting with the head of the PIG
    //-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    {

        Circle head = new Circle(100,150,35);
        head.setFill(Color.LIGHTPINK);


        Ellipse lefteye = new Ellipse(85,133,5,5);
        lefteye.setFill(Color.BLACK);

        Ellipse righteye = new Ellipse(110,133,5,5);
        righteye.setFill(Color.BLACK);


        //-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        //  Creating the body of PIG
        //-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

        Rectangle body = new Rectangle(100,180,100,70);
        body.setFill(Color.LIGHTPINK);

        //-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        //  Creating the arms and legs of PIG
        //-------------------------------------------------------------------------------------------------------------------------------------------------------------------

        Rectangle leftarm = new Rectangle(100,250,15,15);
        leftarm.setFill(Color.HOTPINK);


        Rectangle rightarm = new Rectangle(120,250,15,15);
        rightarm.setFill(Color.HOTPINK);


        Rectangle rightleg = new Rectangle(180,250,15,15);
        rightleg.setFill(Color.HOTPINK);


        Rectangle leftleg = new Rectangle(150,250,15,15);
        leftleg.setFill(Color.HOTPINK);

        Line smile = new Line(90,150,105,155);
        smile.setFill(Color.BLACK);
        smile.setRotate(-40);



        //-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        //  Creating the tail of the PIG
        //-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

        Ellipse tail = new Ellipse(210,180,4,30);
        tail.setFill(Color.HOTPINK);
        tail.setRotate(20);


        Ellipse leftear = new Ellipse(75,113,10, 10);
        leftear.setFill(Color.HOTPINK);

        Ellipse rightear = new Ellipse(127,113,10, 10);
        rightear.setFill(Color.HOTPINK);

        //-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        //  Creating the Sun
        //-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

        Circle sun = new Circle(50,50,30);
        sun.setFill(Color.GOLD);

        //-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        //  Creating a flower
        //-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

        Ellipse stem = new Ellipse(300, 250, 5,35);
        stem.setFill(Color.DARKGREEN);


        Circle pedal2 = new Circle(280,205,12);
        pedal2.setFill(Color.VIOLET);

        Circle pedal3 = new Circle(292,220,12);
        pedal3.setFill(Color.PLUM);

        Circle pedal4 = new Circle(320,203,12);
        pedal4.setFill(Color.CORAL);

        Circle pedal5 = new Circle(308,221,12);
        pedal5.setFill(Color.DEEPPINK);

        Circle pedal6 = new Circle(307,190,12);
        pedal6.setFill(Color.MEDIUMVIOLETRED);

        Circle pedal7 = new Circle(290,187,12);
        pedal7.setFill(Color.PINK);


        Circle pedal1 = new Circle(300,205,10);
        pedal1.setFill(Color.YELLOW);



        //-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        //  Creating the grass
        //-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

        Rectangle grass = new Rectangle(0,250,500,100);
        grass.setFill(Color.GREEN);

        Line g1 = new Line(325,295,325,315);
        g1.setFill(Color.DARKGREEN);
        g1.setRotate(20);

        Line g2 = new Line(320,295,320,315);
        g2.setFill(Color.DARKGREEN);
        g2.setRotate(-10);


        Line g3 = new Line(310,295,310,315);
        g3.setFill(Color.DARKGREEN);
        g3.setRotate(-20);

        Line g4 = new Line(315,295,315,315);
        g4.setFill(Color.DARKGREEN);
        g4.setRotate(-15);

        Line g5 = new Line(375,290,375,305);
        g5.setFill(Color.DARKGREEN);
        g5.setRotate(-15);

        Line g6 = new Line(380,290,380,305);
        g6.setFill(Color.DARKGREEN);
        g6.setRotate(-10);

        Line g7 = new Line(385,290,385,305);
        g7.setFill(Color.DARKGREEN);
        g7.setRotate(-20);

        Line g8 = new Line(390,290,390,305);
        g8.setFill(Color.DARKGREEN);
        g8.setRotate(25);

        Line g9 = new Line(260,250,260,275);
        g9.setFill(Color.DARKGREEN);
        g9.setRotate(-20);

        Line g10 = new Line(265,250,265,275);
        g10.setFill(Color.DARKGREEN);
        g10.setRotate(-10);


        Line g11 = new Line(270,250,270,275);
        g11.setFill(Color.DARKGREEN);
        g11.setRotate(20);

        Line g12 = new Line(270,250,275,275);
        g12.setFill(Color.DARKGREEN);
        g12.setRotate(-15);



        //-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        //  Grouping the PIG, tail, sun, flower and grass
        //-------------------------------------------------------------------------------------------------------------------------------------------------------------------

        Group root = new Group(grass, sun,leftear,g1,g2,g3,g4,g5,g6,g7,g8,g9,g10,g11,g12, rightear, stem, head, smile, leftarm, leftleg, rightarm,pedal2,pedal6, pedal3, pedal4,pedal5, pedal7, rightleg, lefteye,righteye,body,tail, pedal1);
        Scene scene= new Scene(root,500, 350, Color.LIGHTCYAN);
        primaryStage.setTitle("SAD PIG");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}




















