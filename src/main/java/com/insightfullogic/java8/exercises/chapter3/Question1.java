package com.insightfullogic.java8.exercises.chapter3;

import com.insightfullogic.java8.examples.chapter1.Album;
import com.insightfullogic.java8.examples.chapter1.Artist;
import com.insightfullogic.java8.examples.chapter1.SampleData;
import com.insightfullogic.java8.exercises.Exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Question1 {

    public static int addUp(Stream<Integer> numbers) {
        return numbers.reduce(0, (acc, x) -> (acc + x));
    }

    public static List<String> getNamesAndOrigins(List<Artist> artists) {
        return artists.stream().flatMap(artist -> Stream.of(artist.getName(), artist.getNationality())).collect(
            Collectors.toList());
        //        return Exercises.replaceThisWithSolution();
    }

    public static List<Album> getAlbumsWithAtMostThreeTracks(List<Album> input) {
        return input.stream()
            .filter(album ->  album.getTrackList().size() <= 3).collect(Collectors.toList());
//        return Exercises.replaceThisWithSolution();
    }

    public static void main(String[] args) {
        Stream<Integer> stream = new ArrayList<>(Arrays.asList(1, 2, 3, 4)).stream();
        System.out.println(addUp(stream));
        System.out.println(getNamesAndOrigins(SampleData.getThreeArtists()));
        System.out.println(getAlbumsWithAtMostThreeTracks(SampleData.getAlbums()));
    }
}
