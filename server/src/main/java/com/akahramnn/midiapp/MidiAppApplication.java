package com.akahramnn.midiapp;

import Music.Setting;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Scanner;

@SpringBootApplication
public class MidiAppApplication {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int instrument = in.nextInt();
		int note = in.nextInt();
		Setting setting = new Setting();
		setting.play(instrument, note);
		System.out.println(instrument + note);
		SpringApplication.run(MidiAppApplication.class, args);
	}

}
