package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;


public class StreamMain
{
    public static void main(String[] args)
    {
        PoemBeautifier poemBeautifier=new PoemBeautifier();

        poemBeautifier.beatufiy("Dog", (param)-> "1) " + param.toLowerCase() );
        poemBeautifier.beatufiy("Fish", (param)-> "2) " + param.toUpperCase() );
        poemBeautifier.beatufiy("Lazyday", (param)-> "3) " + param+param.toUpperCase() + param );
        poemBeautifier.beatufiy("Programmer", (param)-> "4) If you can: \"" + param + "\" anyone can !" );
        poemBeautifier.beatufiy("ABCDEFGH",(param)->"5)"+param+param.toLowerCase());
        System.out.println(":-)"+"\n");
        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);

    }

}