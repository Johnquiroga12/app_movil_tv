package com.john.quiroga.app_tv_movil;

import java.util.ArrayList;
import java.util.List;

public final class MovieList {
    public static final String MOVIE_CATEGORY[] = {
            "PELICULAS ",
            "SERIES",
            "ANIME",
            "NOVELAS",

    };

    private static List<Movie> list;
    private static long count = 0;

    public static List<Movie> getList() {
        if (list == null) {
            list = setupMovies();
        }
        return list;
    }

    public static List<Movie> setupMovies() {
        list = new ArrayList<>();
        String title[] = {
                "RAPIDOS Y FURIOSOS",
                "Google Demo Slam_ 20ft Search",
                "Introducing Gmail Red",
                "Introducing Google Fiber to the Pole",
                "Introducing Google Nose"
        };

        String description = "Fusce id nisi turpis. Praesent viverra bibendum semper. ";
        String studio[] = {
                "PELICULAS", "SERIES", "ANIME", "NOVELAS", "NOTICIAS"
        };
        String videoUrl[] = {
                "https://commondatastorage.googleapis.com/android-tv/Sample%20videos/Zeitgeist/Zeitgeist%202010_%20Year%20in%20Review.mp4",
                "https://commondatastorage.googleapis.com/android-tv/Sample%20videos/Demo%20Slam/Google%20Demo%20Slam_%2020ft%20Search.mp4",
                "https://commondatastorage.googleapis.com/android-tv/Sample%20videos/April%20Fool's%202013/Introducing%20Gmail%20Blue.mp4",
                "https://commondatastorage.googleapis.com/android-tv/Sample%20videos/April%20Fool's%202013/Introducing%20Google%20Fiber%20to%20the%20Pole.mp4",
                "https://commondatastorage.googleapis.com/android-tv/Sample%20videos/April%20Fool's%202013/Introducing%20Google%20Nose.mp4"
        };
        String bgImageUrl[] = {
                "https://rtvc-assets-radionica3.s3.amazonaws.com/s3fs-public/2022-02/animes.jpg",
                "https://i.blogs.es/6449f7/espinof-peliculas-mas-esperadas-estrenos-cine-2018/840_560.jpg",
                "https://internetpasoapaso.com/wp-content/uploads/%C2%BFCu%C3%A1les-son-las-mejores-p%C3%A1ginas-web-para-ver-novelas-Online-gratis-y-completas-Lista.jpg",
                "https://commondatastorage.googleapis.com/android-tv/Sample%20videos/April%20Fool's%202013/Introducing%20Google%20Fiber%20to%20the%20Pole/bg.jpg",
                "https://commondatastorage.googleapis.com/android-tv/Sample%20videos/April%20Fool's%202013/Introducing%20Google%20Nose/bg.jpg",
        };
        String cardImageUrl[] = {
                //RAPIDOS
                "https://mx.web.img3.acsta.net/pictures/21/04/14/17/28/5059871.jpg",
//SERIE
                "https://1.bp.blogspot.com/-2FUUi16sUv8/YY5ZBNFQCkI/AAAAAAABJIY/VJr6UzLkJWA5ItwLPACCkIPm2JCXKTTfQCLcBGAsYHQ/s1350/poster%2Bperdidos%2Ben%2Bel%2Bespacio%2Btemporada%2Bfinal.jpg",

       //ANIME
                "https://img1.ak.crunchyroll.com/i/spire3/98ea4207e23a2ea3e3af39ad641d88001533322009_main.jpg",
//NOVELA
                "",
                "https://cdnb.20m.es/sites/139/2022/05/9788419301000-196x300.jpg",


        };

        for (int index = 0; index < title.length; ++index) {
            list.add(
                    buildMovieInfo(
                            title[index],
                            description,
                            studio[index],
                            videoUrl[index],
                            cardImageUrl[index],
                            bgImageUrl[index]));
            }
        return list;
    }





    private static Movie buildMovieInfo(
            String title,
            String description,
            String studio,
            String videoUrl,
            String cardImageUrl,
            String backgroundImageUrl) {
        Movie movie = new Movie();
        movie.setId(count++);
        movie.setTitle(title);
        movie.setDescription(description);
        movie.setStudio(studio);
        movie.setCardImageUrl(cardImageUrl);
        movie.setBackgroundImageUrl(backgroundImageUrl);
        movie.setVideoUrl(videoUrl);
        return movie;
    }
}