package ivan.springSwiftbook;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());
        System.out.println(musicPlayer.playMusic());

        ClassicalMusic classicalMusic1 = context.getBean("classicalMusic", ClassicalMusic.class);
        
//        musicPlayer.playMusicGenre(Genre.ROCK);
//        musicPlayer.playMusicGenre(Genre.CLASSICAL);
//        Music music = context.getBean("rockMusic", Music.class);
//        MusicPlayer musicPlayer = new MusicPlayer(music);
//
//        musicPlayer.playMusic();
//
//        Music music2 = context.getBean("classicalMusic", Music.class);
//        MusicPlayer classicalMusicPlayer = new MusicPlayer(music2);
//        classicalMusicPlayer.playMusic();

//        ClassicalMusic classicalMusic = context.getBean("musicBean", ClassicalMusic.class);
//
//        System.out.println(classicalMusic.getSong());
//
//        MusicPlayer firstmusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        MusicPlayer secondmusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//
//        boolean comparison = firstmusicPlayer == secondmusicPlayer;
//        System.out.println(comparison);
//
//        System.out.println(firstmusicPlayer);
//        System.out.println(secondmusicPlayer);
//
//        firstmusicPlayer.setVolume(10);
//        System.out.println(firstmusicPlayer.getVolume());
//        System.out.println(secondmusicPlayer.getVolume());
        context.close();
    }
}
