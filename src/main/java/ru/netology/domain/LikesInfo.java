package ru.netology.domain;

public class LikesInfo {
    private int counterOfLikes;

    // Не хватало полей
    // наличие отметки «Мне нравится» от текущего пользователя
    private boolean userLikes;

    // информация о том, может ли текущий пользователь поставить отметку «Мне нравится»
    private boolean canLike;


    // Getters and setters
    public int getCounterOfLikes() {
        return counterOfLikes;
    }

    public void setCounterOfLikes(int counterOfLikes) {
        this.counterOfLikes = counterOfLikes;
    }

    public boolean isUserLikes() {
        return userLikes;
    }

    public void setUserLikes(boolean userLikes) {
        this.userLikes = userLikes;
    }

    public boolean isCanLike() {
        return canLike;
    }

    public void setCanLike(boolean canLike) {
        this.canLike = canLike;
    }
}
