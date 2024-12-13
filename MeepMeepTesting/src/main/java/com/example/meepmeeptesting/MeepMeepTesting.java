package com.example.meepmeeptesting;

import com.acmerobotics.roadrunner.Pose2d;
import com.acmerobotics.roadrunner.Trajectory;
import com.acmerobotics.roadrunner.TrajectoryActionBuilder;
import com.acmerobotics.roadrunner.TrajectoryBuilder;
import com.acmerobotics.roadrunner.Vector2d;
import com.noahbres.meepmeep.MeepMeep;
import com.noahbres.meepmeep.roadrunner.DefaultBotBuilder;
import com.noahbres.meepmeep.roadrunner.entity.RoadRunnerBotEntity;

import java.awt.image.SampleModel;


enum Route {
    NET_ZONE_AUTO,
    OBERSVATION_PARK
}


public class MeepMeepTesting {

    public static final Route route = Route.NET_ZONE_AUTO;
    public static final double maxVel = 60;
    public static final double maxAccel = 60;
    public static final double maxAngVel = Math.toRadians(180);
    public static final double maxAngAccel = Math.toRadians(180);
    public static final double trackWidth = 15;


    public static final boolean red = false;
    public static double netZoneX = -53;
    public static double netZoneY = -53;
    public static double sampleOneX = ;
    public static double sampleOneY = ;
    public static double sampleTwoX = ;
    public static double sampleTwoY = ;
    public static double samplThreeX = ;
    public static double sampleThreeY = ;



    public static void main(String[] args) {

        if (!red) {
            netZoneX *= -1;
            netZoneY *= -1;
        }








        MeepMeep meepMeep = new MeepMeep(600);

        RoadRunnerBotEntity myBot = new DefaultBotBuilder(meepMeep)
                // Set bot constraints: maxVel, maxAccel, maxAngVel, maxAngAccel, track width
                .setConstraints(maxVel, maxAccel, maxAngVel, maxAngAccel, trackWidth)
                .build();



        myBot.runAction(myBot.getDrive().actionBuilder(new Pose2d(30, 60, 0))

                // score preload
                .strafeToLinearHeading(new Vector2d(53,53), Math.toRadians(-135))
                .waitSeconds(2)

                // line up with sample and intake
//                .splineToLinearHeading(new Pose2d(37,25, Math.toRadians(0)), 0)
                .strafeToLinearHeading(new Vector2d(37,40), Math.toRadians(0))
                .strafeTo(new Vector2d(37, 25))
                .waitSeconds(2)


                // line up with basket and score
                .strafeToLinearHeading(new Vector2d(53,53), Math.toRadians(-135))
                .waitSeconds(2)

                // line up with sample 2 and intake
//                .splineToLinearHeading(new Pose2d(47, 25, Math.toRadians(0)), 0)
                .strafeToLinearHeading(new Vector2d(47,25), Math.toRadians(0))
                .waitSeconds(2)

                // line up with basket and score
                .strafeToLinearHeading(new Vector2d(53,53), Math.toRadians(-135))
                .waitSeconds(2)

                // line up with sample 3 and intake
//                .splineToLinearHeading(new Pose2d(57, 25, Math.toRadians(0)), 0)
                .strafeToLinearHeading(new Vector2d(57,25), Math.toRadians(0))
                .waitSeconds(2)

                // line up with basket and score
                .strafeToLinearHeading(new Vector2d(53,53), Math.toRadians(-135))
                .waitSeconds(2)

                // park
                .splineToLinearHeading(new Pose2d(25, 0, Math.toRadians(180)), 160)
                .waitSeconds(2)





                .build());




        meepMeep.setBackground(MeepMeep.Background.FIELD_INTO_THE_DEEP_JUICE_DARK)
                .setDarkMode(true)
                .setBackgroundAlpha(0.95f)
                .addEntity(myBot)
                .start();



    }



    public static RoadRunnerBotEntity netZone(MeepMeep meepMeep) {
        RoadRunnerBotEntity myBot = new DefaultBotBuilder(meepMeep)
                // Set bot constraints: maxVel, maxAccel, maxAngVel, maxAngAccel, track width
                .setConstraints(maxVel, maxAccel, maxAngVel, maxAngAccel, trackWidth)
                .build();



        myBot.runAction(myBot.getDrive().actionBuilder(new Pose2d(30, 60, 0))

                // score preload
                .strafeToLinearHeading(new Vector2d(53,53), Math.toRadians(-135))
                .waitSeconds(2)

                // line up with sample and intake
//                .splineToLinearHeading(new Pose2d(37,25, Math.toRadians(0)), 0)
                .strafeToLinearHeading(new Vector2d(37,40), Math.toRadians(0))
                .strafeTo(new Vector2d(37, 25))
                .waitSeconds(2)


                // line up with basket and score
                .strafeToLinearHeading(new Vector2d(53,53), Math.toRadians(-135))
                .waitSeconds(2)

                // line up with sample 2 and intake
//                .splineToLinearHeading(new Pose2d(47, 25, Math.toRadians(0)), 0)
                .strafeToLinearHeading(new Vector2d(47,25), Math.toRadians(0))
                .waitSeconds(2)

                // line up with basket and score
                .strafeToLinearHeading(new Vector2d(53,53), Math.toRadians(-135))
                .waitSeconds(2)

                // line up with sample 3 and intake
//                .splineToLinearHeading(new Pose2d(57, 25, Math.toRadians(0)), 0)
                .strafeToLinearHeading(new Vector2d(57,25), Math.toRadians(0))
                .waitSeconds(2)

                // line up with basket and score
                .strafeToLinearHeading(new Vector2d(53,53), Math.toRadians(-135))
                .waitSeconds(2)

                // park
                .splineToLinearHeading(new Pose2d(25, 0, Math.toRadians(180)), 160)
                .waitSeconds(2)





                .build());






        return myBot;
    }





}