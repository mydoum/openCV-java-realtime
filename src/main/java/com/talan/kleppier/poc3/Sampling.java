package com.talan.kleppier.poc3;

import nu.pattern.OpenCV;
import org.opencv.core.*;

/**
 * Created by alonso on 12/25/17.
 */
public class Sampling {
    Mat mat;

    public Sampling() {
        OpenCV.loadLibrary();
        this.mat = Mat.eye(3, 3, CvType.CV_8UC1);;
    }

    public void run() {
        System.out.println("mat = " + mat.dump());
    }
}
