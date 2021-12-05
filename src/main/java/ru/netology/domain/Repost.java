package ru.netology.domain;

public class Repost {
    private int counterOfReposts;
    private boolean canRepost; // Это поле у разрабов вк почему-то находится в объекте лайки, не согласна

    // Не хватало полей
    // Наличие репоста от текущего пользователя
    private boolean userReposted;


    // Getters and setters
    public int getCounterOfReposts() {
        return counterOfReposts;
    }

    public void setCounterOfReposts(int counterOfReposts) {
        this.counterOfReposts = counterOfReposts;
    }

    public boolean isCanRepost() {
        return canRepost;
    }

    public void setCanRepost(boolean canRepost) {
        this.canRepost = canRepost;
    }

    public boolean isUserReposted() {
        return userReposted;
    }

    public void setUserReposted(boolean userReposted) {
        this.userReposted = userReposted;
    }
}
