package com.example.meepmeeptesting;

import com.acmerobotics.roadrunner.Pose2d;
import com.acmerobotics.roadrunner.Vector2d;
import com.noahbres.meepmeep.MeepMeep;
import com.noahbres.meepmeep.roadrunner.DefaultBotBuilder;
import com.noahbres.meepmeep.roadrunner.entity.RoadRunnerBotEntity;

public class MeepMeepTesting {
    public static void main(String[] args) {
        MeepMeep meepMeep = new MeepMeep(600);

        RoadRunnerBotEntity myBot = new DefaultBotBuilder(meepMeep)
                // Set bot constraints: maxVel, maxAccel, maxAngVel, maxAngAccel, track width
                .setConstraints(60, 60, Math.toRadians(180), Math.toRadians(180), 15)
                .build();

        myBot.runAction(myBot.getDrive().actionBuilder(new Pose2d(30, 60, 0))
//               // line up with sample and intake
                .strafeToLinearHeading(new Vector2d(37,25), Math.toRadians(0))
                .waitSeconds(2)

                // line up with basket and score
                .splineToLinearHeading(new Pose2d(53,53, Math.toRadians(-135)), 0)
                .waitSeconds(2)

                // line up with sample 2 and intake
                .splineToLinearHeading(new Pose2d(47, 25, Math.toRadians(0)), 0)
                .waitSeconds(2)

                // line up with basket and score
                .splineToLinearHeading(new Pose2d(53,53, Math.toRadians(-135)), 0)
                .waitSeconds(2)

                // line up with sample 3 and intake
                .splineToLinearHeading(new Pose2d(57, 25, Math.toRadians(0)), 0)
                .waitSeconds(2)

                // line up with basket and score
                .splineToLinearHeading(new Pose2d(53,53, Math.toRadians(-135)), 30)
                .waitSeconds(2)

                // park
                .splineToLinearHeading(new Pose2d(25, 0, Math.toRadians(180)), 90)
                .waitSeconds(2)





                .build());


        meepMeep.setBackground(MeepMeep.Background.FIELD_INTO_THE_DEEP_JUICE_DARK)
                .setDarkMode(true)
                .setBackgroundAlpha(0.95f)
                .addEntity(myBot)
                .start();
    }
}