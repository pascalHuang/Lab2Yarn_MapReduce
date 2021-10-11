package com.opstty;

import com.opstty.job.*;
import org.apache.hadoop.util.ProgramDriver;

public class AppDriver {
    public static void main(String argv[]) {
        int exitCode = -1;
        ProgramDriver programDriver = new ProgramDriver();

        try {
            programDriver.addClass("wordcount", WordCount.class,
                    "A map/reduce program that counts the words in the input files.");

            programDriver.addClass("districtcount", DistrictCount.class,
                    "A map/reduce program that counts the tress in each district.");

            programDriver.addClass("displayspecies", DisplaySpecies.class,
                    "A map/reduce program that display every species of tree.");

            programDriver.addClass("kindcount", KindCount.class,
                    "A map/reduce program that count trees by kind.");

            programDriver.addClass("kindmaxheight", KindMaxHeight.class,
                    "A map/reduce program that display every max height of trees by kind.");

            programDriver.addClass("sortheight", SortHeight.class,
                    "A map/reduce program that sort the height of trees.");

            exitCode = programDriver.run(argv);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }

        System.exit(exitCode);
    }
}
