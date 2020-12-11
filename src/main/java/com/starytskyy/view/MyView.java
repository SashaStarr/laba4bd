package com.starytskyy.view;

import com.starytskyy.controller.*;
import com.starytskyy.model.entity.*;

import java.sql.SQLException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MyView {

    private final ActorsCastController actorsCastController = new ActorsCastController();
    private final DescriptionController descriptionController = new DescriptionController();
    private final FilmController filmController = new FilmController();
    private final PriorityController priorityController = new PriorityController();
    private final RatingController ratingController = new RatingController();
    private final ReviewController reviewController = new ReviewController();
    private final ReviewsFilmController reviewsFilmController = new ReviewsFilmController();
    private final StoryAboutMainActorController storyAboutMainActorController = new StoryAboutMainActorController();

    private final Map<String, String> menu;
    private final Map<String, Printable> methodsMenu;
    private static final Scanner INPUT = new Scanner(System.in);

    public MyView() {
        menu = new LinkedHashMap<>();
        methodsMenu = new LinkedHashMap<>();

        menu.put("Q", "Q - exit program");
        menu.put("S", "S - show menu");

        menu.put("1", "\n1 - Get all storyAboutMainActor");
        menu.put("2", "2 - Get storyAboutMainActor by ID");
        menu.put("3", "3 - Create storyAboutMainActor");
        menu.put("4", "4 - Delete storyAboutMainActor");
        menu.put("5", "5 - Update storyAboutMainActor\n");

        menu.put("6", "6 - Get all actorsCast");
        menu.put("7", "7 - Get actorsCast by ID");
        menu.put("8", "8 - Create actorsCast");
        menu.put("9", "9 - Delete actorsCast");
        menu.put("10", "10 - Update actorsCast\n");

        menu.put("11", "11 - Get all description");
        menu.put("12", "12 - Get description by ID");
        menu.put("13", "13 - Create description");
        menu.put("14", "14 - Delete description");
        menu.put("15", "15 - Update description\n");

        menu.put("16", "16 - Get all film");
        menu.put("17", "17 - Get film day by ID");
        menu.put("18", "18 - Create film");
        menu.put("19", "19 - Delete film");
        menu.put("20", "20 - Update film\n");

        menu.put("21", "21 - Get all priority");
        menu.put("22", "22 - Get priority by ID");
        menu.put("23", "23 - Create priority ");
        menu.put("24", "24 - Delete priority ");
        menu.put("25", "25 - Update priority\n");

        menu.put("26", "26 - Get all rating");
        menu.put("27", "27 - Get rating by ID");
        menu.put("28", "28 - Create rating ");
        menu.put("29", "29 - Delete rating");
        menu.put("30", "30 - Update rating \n");

        menu.put("31", "31 - Get all review");
        menu.put("32", "32 - Get review by ID");
        menu.put("33", "33 - Create review");
        menu.put("34", "34 - Delete review");
        menu.put("35", "35 - Update review\n");

        menu.put("36", "36 - Get all reviewsFilm");
        menu.put("37", "37 - Get reviewsFilm by ID");
        menu.put("38", "38 - Create reviewsFilm");
        menu.put("39", "39 - Delete reviewsFilm");
        menu.put("40", "40 - Update reviewsFilm\n");

        methodsMenu.put("S", this::showMenu);

        methodsMenu.put("1", this::getAllStoryAboutMainActor);
        methodsMenu.put("2", this::getStoryAboutMainActorById);
        methodsMenu.put("3", this::createStoryAboutMainActor);
        methodsMenu.put("4", this::deleteStoryAboutMainActor);
        methodsMenu.put("5", this::updateStoryAboutMainActor);

        methodsMenu.put("6", this::getAllActorsCast);
        methodsMenu.put("7", this::getActorsCastById);
        methodsMenu.put("8", this::createActorsCast);
        methodsMenu.put("9", this::deleteActorsCast);
        methodsMenu.put("10", this::updateActorsCast);

        methodsMenu.put("11", this::getAllDescription);
        methodsMenu.put("12", this::getDescriptionById);
        methodsMenu.put("13", this::createDescription);
        methodsMenu.put("14", this::deleteDescription);
        methodsMenu.put("15", this::updateDescription);

        methodsMenu.put("16", this::getAllFilm);
        methodsMenu.put("17", this::getFilmById);
        methodsMenu.put("18", this::createFilm);
        methodsMenu.put("19", this::deleteFilm);
        methodsMenu.put("20", this::updateFilm);

        methodsMenu.put("21", this::getAllPriority);
        methodsMenu.put("22", this::getPriorityById);
        methodsMenu.put("23", this::createPriority);
        methodsMenu.put("24", this::deletePriority);
        methodsMenu.put("25", this::updatePriority);

        methodsMenu.put("26", this::getAllRating);
        methodsMenu.put("27", this::getRatingById);
        methodsMenu.put("28", this::createRating);
        methodsMenu.put("29", this::deleteRating);
        methodsMenu.put("30", this::updateRating);

        methodsMenu.put("31", this::getAllReview);
        methodsMenu.put("32", this::getReviewById);
        methodsMenu.put("33", this::createReview);
        methodsMenu.put("34", this::deleteReview);
        methodsMenu.put("35", this::updateReview);

        methodsMenu.put("36", this::getAllReviewsFilm);
        methodsMenu.put("37", this::getReviewsFilmById);
        methodsMenu.put("38", this::createReviewsFilm);
        methodsMenu.put("39", this::deleteReviewsFilm);
        methodsMenu.put("40", this::updateReviewsFilm);

    }

    private void getAllActorsCast() throws SQLException {
        System.out.println("\nActorsCast:");
        System.out.println(actorsCastController.getAll());
    }

    private void getActorsCastById() throws SQLException {
        System.out.println("\nEnter ID for ActorsCast");
        int id = INPUT.nextInt();
        System.out.println(actorsCastController.getBy(id));
    }

    private void deleteActorsCast() throws SQLException {
        System.out.println("\nEnter ID for ActorsCast you want to delete");
        int id = INPUT.nextInt();
        System.out.println(actorsCastController.delete(id));
    }

    private void createActorsCast() throws SQLException {
        System.out.println("\nEnter numbersActors");
        int numbersActors = INPUT.nextInt();
        System.out.println("\nEnter nameAndSurnameMainActor");
        String nameAndSurnameMainActor = INPUT.next();
        ActorsCast actorsCastt = new ActorsCast(numbersActors,nameAndSurnameMainActor);
        System.out.println(actorsCastController.create(actorsCastt));
    }

    private void updateActorsCast() throws SQLException {
        System.out.println("\nEnter ID");
        int id = INPUT.nextInt();
        System.out.println("\nEnter film_ID");
        int filmId = INPUT.nextInt();
        System.out.println("\nEnter  numbersActors");
        int numbersActors = INPUT.nextInt();
        System.out.println("\nEnter nameAndSurnameMainActor");
        String nameAndSurnameMainActor = INPUT.next();
        ActorsCast first = new ActorsCast(id,filmId, numbersActors, nameAndSurnameMainActor);
        System.out.println(actorsCastController.update(first));
    }

    private void getAllDescription() throws SQLException {
        System.out.println("\nDescription:");
        System.out.println(descriptionController.getAll());
    }

    private void getDescriptionById() throws SQLException {
        System.out.println("\nEnter ID for Description");
        int id = INPUT.nextInt();
        System.out.println(descriptionController.getBy(id));
    }

    private void deleteDescription() throws SQLException {
        System.out.println("\nEnter ID for Description you want to delete");
        int id = INPUT.nextInt();
        System.out.println(descriptionController.delete(id));
    }

    private void createDescription() throws SQLException {
        System.out.println("\nEnter description");
        String description = INPUT.next();
        Description second = new Description(description);
        System.out.println(descriptionController.create(second));
    }

    private void updateDescription() throws SQLException {
        System.out.println("\nEnter film_ID");
        int filmId = INPUT.nextInt();
        System.out.println("\nEnter Description");
        String description = INPUT.next();
        Description exercise = new Description(filmId,description);
        System.out.println(descriptionController.update(exercise));
    }

    private void getAllFilm() throws SQLException {
        System.out.println("\nFilm:");
        System.out.println(filmController.getAll());
    }

    private void getFilmById() throws SQLException {
        System.out.println("\nEnter ID for Film");
        int id = INPUT.nextInt();
        System.out.println(filmController.getBy(id));
    }

    private void deleteFilm() throws SQLException {
        System.out.println("\nEnter ID for Film you want to delete");
        int id = INPUT.nextInt();
        System.out.println(filmController.delete(id));
    }

    private void createFilm() throws SQLException {
        System.out.println("\nEnter filmName");
        String filmName = INPUT.next();
        System.out.println("\nEnter director");
        String director = INPUT.next();
        System.out.println("\nEnter premiereDate in (yyyy-[m]m-[d]d) format");
        String premiereDate = INPUT.next();
        System.out.println("\nEnter durationInMinutes");
        int durationInMinutes = INPUT.nextInt();
        System.out.println("\nEnter budgetInDollars");
        int budgetInDollars = INPUT.nextInt();
        System.out.println("\nEnter profitInDollars");
        int profitInDollars = INPUT.nextInt();

        Film three = new Film(filmName, durationInMinutes, director,premiereDate,budgetInDollars,profitInDollars);
        System.out.println(filmController.create(three));
    }

    private void updateFilm() throws SQLException {
        System.out.println("\nEnter ID");
        int id = INPUT.nextInt();
        System.out.println("\nEnter filmName");
        String filmName = INPUT.next();
        System.out.println("\nEnter director");
        String director = INPUT.next();
        System.out.println("\nEnter premiereDate in (yyyy-[m]m-[d]d) format");
        String premiereDate = INPUT.next();
        System.out.println("\nEnter durationInMinutes");
        int durationInMinutes = INPUT.nextInt();
        System.out.println("\nEnter budgetInDollars");
        int budgetInDollars = INPUT.nextInt();
        System.out.println("\nEnter profitInDollars");
        int profitInDollars = INPUT.nextInt();
        Film four = new Film(id,filmName, durationInMinutes, director,premiereDate,budgetInDollars,profitInDollars);
        System.out.println(filmController.update(four));
    }

    private void getAllPriority() throws SQLException {
        System.out.println("\nPriority:");
        System.out.println(priorityController.getAll());
    }

    private void getPriorityById() throws SQLException {
        System.out.println("\nEnter ID for Priority");
        int id = INPUT.nextInt();
        System.out.println(priorityController.getBy(id));
    }

    private void deletePriority() throws SQLException {
        System.out.println("\nEnter ID for Priority you want to delete");
        int id = INPUT.nextInt();
        System.out.println(priorityController.delete(id));
    }

    private void createPriority() throws SQLException {
        System.out.println("\nEnter priority");
        int priority = INPUT.nextInt();
        Priority five = new Priority(priority);
        System.out.println(priorityController.create(five));
    }

    private void updatePriority() throws SQLException {
        System.out.println("\nEnter ID");
        int id = INPUT.nextInt();
        System.out.println("\nEnter Priority");
        int priority = INPUT.nextInt();
        Priority six = new Priority(id, priority);
        System.out.println(priorityController.update(six));
    }

    private void getAllRating() throws SQLException {
        System.out.println("\nRating:");
        System.out.println(ratingController.getAll());
    }

    private void getRatingById() throws SQLException {
        System.out.println("\nEnter ID for Rating");
        int id = INPUT.nextInt();
        System.out.println(ratingController.getBy(id));
    }

    private void deleteRating() throws SQLException {
        System.out.println("\nEnter ID for Rating you want to delete");
        int id = INPUT.nextInt();
        System.out.println(ratingController.delete(id));
    }

    private void createRating() throws SQLException {

        System.out.println("\nEnter rating");
        int rating = INPUT.nextInt();
        Rating seven = new Rating(rating);
        System.out.println(ratingController.create(seven));
    }

    private void updateRating() throws SQLException {
        System.out.println("\nEnter filmId");
        int filmId = INPUT.nextInt();
        System.out.println("\nEnter priorityId");
        int priorityId = INPUT.nextInt();
        System.out.println("\nEnter rating");
        int rating = INPUT.nextInt();
        Rating eight = new Rating(filmId,priorityId,rating);
        System.out.println(ratingController.update(eight));
    }

    private void getAllReview() throws SQLException {
        System.out.println("\nReview:");
        System.out.println(reviewController.getAll());
    }

    private void getReviewById() throws SQLException {
        System.out.println("\nEnter ID for Review");
        int id = INPUT.nextInt();
        System.out.println(reviewController.getBy(id));
    }

    private void deleteReview() throws SQLException {
        System.out.println("\nEnter ID for Review you want to delete");
        int id = INPUT.nextInt();
        System.out.println(reviewController.delete(id));
    }

    private void createReview() throws SQLException {
        System.out.println("\nEnter autor");
        String autor = INPUT.next();
        System.out.println("\nEnter text");
        String text = INPUT.next();
        System.out.println("\nEnter timeWriting");
        String timeWriting = INPUT.next();
        Review nine = new Review(autor, text, timeWriting);
        System.out.println(reviewController.create(nine));
    }

    private void updateReview() throws SQLException {
        System.out.println("\nEnter ID");
        int id = INPUT.nextInt();
        System.out.println("\nEnter autor");
        String autor = INPUT.next();
        System.out.println("\nEnter text");
        String text = INPUT.next();
        System.out.println("\nEnter timeWriting");
        String timeWriting = INPUT.next();
        Review ten= new Review(id,autor, text, timeWriting);
        System.out.println(reviewController.update(ten));
    }

    private void getAllReviewsFilm() throws SQLException {
        System.out.println("\nReviewsFilm:");
        System.out.println(reviewsFilmController.getAll());
    }

    private void getReviewsFilmById() throws SQLException {
        System.out.println("\nEnter ID for ReviewsFilm");
        int id = INPUT.nextInt();
        System.out.println(reviewsFilmController.getBy(id));
    }

    private void deleteReviewsFilm() throws SQLException {
        System.out.println("\nEnter ID for ReviewsFilm you want to delete");
        int id = INPUT.nextInt();
        System.out.println(reviewsFilmController.delete(id));
    }

    private void createReviewsFilm() throws SQLException {
        ReviewsFilm eleven = new ReviewsFilm();
        System.out.println(reviewsFilmController.create(eleven));
    }

    private void updateReviewsFilm() throws SQLException {
        System.out.println("\nEnter filmId");
        int filmId = INPUT.nextInt();
        System.out.println("\nEnter reviewId");
        int reviewId = INPUT.nextInt();
        ReviewsFilm twelve = new ReviewsFilm(filmId,reviewId);
        System.out.println(reviewsFilmController.update(twelve));
    }

    private void getAllStoryAboutMainActor() throws SQLException {
        System.out.println("\nStoryAboutMainActor:");
        System.out.println(storyAboutMainActorController.getAll());
    }

    private void getStoryAboutMainActorById() throws SQLException {
        System.out.println("\nEnter ID for StoryAboutMainActor");
        int id = INPUT.nextInt();
        System.out.println(storyAboutMainActorController.getBy(id));
    }

    private void deleteStoryAboutMainActor() throws SQLException {
        System.out.println("\nEnter ID for StoryAboutMainActor you want to delete");
        int id = INPUT.nextInt();
        System.out.println(storyAboutMainActorController.delete(id));
    }

    private void createStoryAboutMainActor() throws SQLException {
        System.out.println("\nEnter story");
        String story = INPUT.next();
        StoryAboutMainActor thirteen = new StoryAboutMainActor(story);
        System.out.println(storyAboutMainActorController.create(thirteen));
    }

    private void updateStoryAboutMainActor() throws SQLException {
        System.out.println("\nEnter ID");
        int actorsCastId = INPUT.nextInt();
        System.out.println("\nEnter story");
        String story = INPUT.next();
        StoryAboutMainActor fourteen = new StoryAboutMainActor(actorsCastId, story);
        System.out.println(storyAboutMainActorController.update(fourteen));
    }

    private void showMenu() {
        System.out.println("\nMENU:");
        for (String str : menu.values()) {
            System.out.println(str);
        }
    }

    private void showMainMenu() {
        System.out.println(menu.get("S"));
        System.out.println(menu.get("Q"));
        System.out.println("Select menu option.");
    }

    public void show() {
        String keyMenu;
        showMainMenu();
        do {
            keyMenu = INPUT.next().toUpperCase();
            try {
                methodsMenu.get(keyMenu).print();
            } catch (Exception ignored) {
            }

        } while (!keyMenu.equals("Q"));
    }
}
