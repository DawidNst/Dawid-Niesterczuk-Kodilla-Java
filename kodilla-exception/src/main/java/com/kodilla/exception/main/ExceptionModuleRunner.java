package com.kodilla.exception.main;

import com.kodilla.exception.io.FileReader;
import com.kodilla.exception.io.FileReaderException;
import com.kodilla.exception.io.FileReaderWithoutHandling;

import java.io.File;

public class ExceptionModuleRunner {

    public static void main(String[] args) {
        //FileReaderWithoutHandling fileReader = new FileReaderWithoutHandling();
        FileReader fileReader = new FileReader();
        fileReader.readFile();

        fileReader.readFile();
    }

}