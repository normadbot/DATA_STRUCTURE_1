import java.awt.*;
import javax.swing.*;
import java.sound.midi.*;
import java.util.*;
import java.awt.event.*;


public class BeatBox {
	JPanel mainPanel ;
	ArrayList<JCheckBox> checkboxList;
	Sequencer sequencer;
	Track track;
	JFrame theFrame;
	
		String [] instrumentNames = {"Bass drum ","Close ","Open hi hat","Acoustic Snara",
		"Crash Cymbal","Hand Clap","Cowbell","vibraslap",""

}