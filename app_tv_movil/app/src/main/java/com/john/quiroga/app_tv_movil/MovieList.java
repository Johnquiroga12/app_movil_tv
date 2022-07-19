package com.john.quiroga.app_tv_movil;

import java.util.ArrayList;
import java.util.List;

public final class MovieList {
    public static final String MOVIE_CATEGORY[] = {
            "HISTORIA",
            " FLORA",
            "FAUNA",
            "ASTRONOMIA",

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
                "historia",
                "flora",
                "fauna",
                "astronomia",
                "Introducing Google Nose"
        };///john

        String description []={
                "El documental es la expresión de un aspecto de la realidad, mostrada en forma audiovisual. La organización " +
                        "y estructura de imágenes y sonidos (textos y entrevistas), según el punto de vista del autor, determina " +
                        "el tipo de documental.",
                "Las plantas también se comunican entre ellas (e incluso con otros seres vivos) Aunque a los humanos" +
                        " nos cueste percatarnos, las plantas son capaces de comunicarse a través de señales olorosas, " +
                        "visuales, auditivas, químicas y eléctricas",
                "La tecnología, gran salvadora de documentales\n" +
                        "Como explicaba antes el experto, a veces los animales no ofrecen material interesante, por lo que tienen que" +
                        " crearlo ellos mismos. De esta forma, algunos documentales están formados por imágenes CGI, es decir, generadas " +
                        "por ordenador",
                "Las estrellas son motores de energía cósmica que producen calor, luz, rayos ultravioleta, rayos X y otras formas de radiación. " +
                        "Están compuestas casi en su totalidad de gas y plasma, un estado de supercalentamiento de la materia compuesta de partículas " +
                        "subatómicas.",
                "",
                //john


        } ;
        String studio[] = {
                "DOCUMENTAL DE HISTORIA", "DOCUMENTAL DE FLORA", "DOCUMENTAL DE FAUNA", "DOCUMENTAL DE ASTRONOMIA", "NOTICIAS"
        };
        String videoUrl[] = {
                "https://s31.aconvert.com/convert/p3r68-cdx67/zt8jl-wskff.mp4",
                "https://s17.aconvert.com/convert/p3r68-cdx67/fbobh-gc5yt.mp4",
                "https://s31.aconvert.com/convert/p3r68-cdx67/cl8pj-nrfpl.mp4",
                "https://commondatastorage.googleapis.com/android-tv/Sample%20videos/April%20Fool's%202013/Introducing%20Google%20Fiber%20to%20the%20Pole.mp4",
                ""
        };
        String bgImageUrl[] = {
                "https://eacnur.org/blog/wp-content/uploads/2017/09/mejores-documentales-de-historia_opt-800x400.jpg",
                "https://i.pinimg.com/564x/cd/e5/9b/cde59b624fed215e110c4a6a0756ca78.jpg",
                "https://i.pinimg.com/564x/74/87/90/74879008028c2e3f128003e3ea3b9e1a.jpg",
                "https://i.pinimg.com/564x/39/d1/10/39d11052e7d5952db5fb7ab5bff1c885.jpg",
                "https://www.queeseconomia.site/wp-content/uploads/2018/05/363.png",
        };
        String cardImageUrl[] = {
                //RAPIDOS
                "https://i.pinimg.com/564x/6f/aa/c2/6faac27ed0f8392a6998a636661e4db5.jpg",
//SERIE
                "https://i.pinimg.com/564x/ff/bf/e0/ffbfe0943790c9cc3583ce01adf65dcc.jpg",

       //ANIME
                "https://i.pinimg.com/564x/f0/81/74/f0817496cf29cae7e60af02b58750801.jpg",
//NOVELA
                "https://i.pinimg.com/564x/df/31/7b/df317b8f5fa351f66438217901359b18.jpg",
                "",


        };

        for (int index = 0; index < title.length; ++index) {
            list.add(
                    buildMovieInfo(
                            title[index],
                            description[index],
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