/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yzh
 */
import java.applet.AudioClip;
import java.io.*;
import java.applet.Applet;
import java.net.MalformedURLException;
import java.net.URL;

public class Audioclip {
    public static AudioClip a;
    public static void main(String args[]) {
        playMusic();
    }
    static void playMusic(){//播放
        try {
            URL b;
            File f = new File("Samsara.wav"); // 音乐文件
            b = f.toURL();
            a = Applet.newAudioClip(b);
            a.play();
        } catch (MalformedURLException e) {

            e.printStackTrace();
        }
    }
    static void StopMusic(){//停止
        a.stop();
    }
}