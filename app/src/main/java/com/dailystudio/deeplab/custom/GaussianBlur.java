package com.dailystudio.deeplab.custom;

import android.graphics.Bitmap;

import static com.dailystudio.deeplab.custom.CameraActivity.bitmap;

public class GaussianBlur {

    /*public static void blur(Bitmap image,int br) {
        int col, row;//br: the depth of blur
        char IMG1[][][] = new char[2000][2000][3]; //original image
        char IMG2[][][] = new char[2000][2000][3]; //horizontal blur image
        char IMG3[][][] = new char[2000][2000][3]; //vertical blur image
        int T[][][] = new int[2000][2000][3]; //the sum matrix
        row = image.getWidth();
        col = image.getHeight();
        //export the original image to IMG1 matrix:

        int[] pix = new int[row * col];
        bitmap.getPixels(pix, 0, row, 0, 0, row, col);

        for (int i = 0; i < row; i++)
            for (int j = 0; j < col; j++){
                for (int k = 0; k < 3; k++) IMG1[i][j][k] = image.
                }

        //HORIZONTAL BLUR - blur theo chieu ngang
        int wH[]=new int [3000];
        for (int c = 0; c < col; c++) {
            if (c < br) wH[c] = br + c + 1;
            else if (c >= col - br) wH[c] = col + br - c;
            else wH[c] = 2 * br + 1;
        }
        //cal IMG2[r][0]
        for (int r = 0; r < row; r++) {
            //int T[3];
            T[r][0][0] = T[r][0][1] = T[r][0][2] = 0;
            for (int c = 0; c < wH[0]; c++) {
                for (int k = 0; k < 3; k++) T[r][0][k] += IMG1[r][c][k];
            }
            for (int k = 0; k < 3; k++) IMG2[r][0][k] = T[r][0][k] / wH[0];
        }

        //horizontal blur
        for (int r = 0; r < row; r++) {
            for (int c = 1; c < col; c++) {
                 char L[]=new char[3];
                 char R[]=new char[3];

                if (c - br - 1 < 0) L[0] = L[1] = L[2] = 0;
                else for (int k = 0; k < 3; k++) L[k] = IMG1[r][c - br - 1][k];

                if (c + br >= col) R[0] = R[1] = R[2] = 0;
                else for (int k = 0; k < 3; k++) R[k] = IMG1[r][c + br][k];

                for (int k = 0; k < 3; k++) {
                    T[r][c][k] = T[r][c - 1][k] - L[k] + R[k];
                    IMG2[r][c][k] = T[r][c][k] / wH[c];
                }
            }
        }


        //VERICAL BLUR - blur theo chieu doc
        int wV[]=new int[3000];
        for (int r = 0; r < row; r++) {
            if (r < br) wV[r] = br + r + 1;
            else if (r >= row - br) wV[r] = row + br - r;
            else wV[r] = 2 * br + 1;
        }
        //cal IMG3[0][c]
        for (int c = 0; c < col; c++) {
            T[0][c][0] = T[0][c][1] = T[0][c][2] = 0;
            for (int r = 0; r < wV[0]; r++) {
                for (int k = 0; k < 3; k++) T[0][c][k] += IMG2[r][c][k];
            }
            for (int k = 0; k < 3; k++) IMG3[0][c][k] = T[0][c][k] / wV[0];
        }

        //vertical blur
        for (int c = 0; c < col; c++) {
            for (int r = 1; r < row; r++) {
                char L[]=new char[3];
                char R[]=new char[3];

                if (r - br - 1 < 0) L[0] = L[1] = L[2] = 0;
                else for (int k = 0; k < 3; k++) L[k] = IMG2[r - br - 1][c][k];

                if (r + br >= row) R[0] = R[1] = R[2] = 0;
                else for (int k = 0; k < 3; k++) R[k] = IMG2[r + br][c][k];

                for (int k = 0; k < 3; k++) {
                    T[r][c][k] = T[r - 1][c][k] - L[k] + R[k];
                    IMG3[r][c][k] = T[r][c][k] / wV[r];
                }
            }
        }
    }*/
}
