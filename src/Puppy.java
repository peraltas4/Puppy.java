//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//  Creating an Adorable lion  Author: Steffanie Peralta-Duran
//
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;

public class Puppy extends Application {

    //-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    //  Presents an adorable Puppy
    //-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

    public void start(Stage primaryStage)

    //-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    //  Starting with the head of the puppy
    //-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    {

        Circle head = new Circle(100,150,35);
        head.setFill(Color.LIGHTPINK);


        Ellipse lefteye = new Ellipse(85,133,5,5);
        lefteye.setFill(Color.BLACK);

        Ellipse righteye = new Ellipse(110,133,5,5);
        righteye.setFill(Color.BLACK);


        //-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        //  Creating the body of puppy
        //-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

        Rectangle body = new Rectangle(100,180,100,70);
        body.setFill(Color.LIGHTPINK);

        //-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        //  Creating the arms and legs of puppy
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
        //  Creating the tail of the puppy
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
        pedal4.setFill(Color.BLUE);

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



        //-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        //  Grouping the puppy, tail, sun, and grass
        //-------------------------------------------------------------------------------------------------------------------------------------------------------------------

        Group root = new Group(grass, sun,leftear, rightear, stem, head, smile, leftarm, leftleg, rightarm,pedal2,pedal6, pedal3, pedal4,pedal5, pedal7, rightleg, lefteye,righteye,body,tail, pedal1);
        Scene scene= new Scene(root,500, 350, Color.LIGHTCYAN);
        primaryStage.setTitle("Sad Puppy");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}




















