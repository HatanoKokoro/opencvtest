package com.artoria;

import java.io.File;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class TesseractTest {
    
    public static void main(String[] args) throws TesseractException, InterruptedException {
        
        ITesseract instance = new Tesseract();
//        instance.setLanguage("chi_sim");
        File imgDir = new File("D:/456.jpg");
        long startTime = System.currentTimeMillis();
        String ocrResult = instance.doOCR(imgDir);
        // 输出识别结果
        System.out.println("OCR Result: \n" + ocrResult + "\n 耗时：" + (System.currentTimeMillis() - startTime) + "ms");
        
    }
    
}
