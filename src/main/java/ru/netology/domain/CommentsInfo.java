package ru.netology.domain;

public class CommentsInfo {
    private int counter;
    private boolean canPost;


    // Доп.поля, которых нет в документации
    // Дата и время публикации комментария
    private String dateOfComment;

    // id пользователя, опубликовавшего комментарий
    private int idOfUserComment;

    // текст комментария
    private String textOfComment;

    // наличие вложений у комментария
    private boolean hasAttachment;



    // Не хватало полей
    // Информация о том, могут ли сообщества комментировать запись
    private boolean groupsCanPost;

    // Может ли текущий пользователь закрыть и открыть комментарии к записи
    private boolean canClose;
    private boolean canOpen;


    // Getters and setters
    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public boolean isCanPost() {
        return canPost;
    }

    public void setCanPost(boolean canPost) {
        this.canPost = canPost;
    }

    public String getDateOfComment() {
        return dateOfComment;
    }

    public void setDateOfComment(String dateOfComment) {
        this.dateOfComment = dateOfComment;
    }

    public int getIdOfUserComment() {
        return idOfUserComment;
    }

    public void setIdOfUserComment(int idOfUserComment) {
        this.idOfUserComment = idOfUserComment;
    }

    public String getTextOfComment() {
        return textOfComment;
    }

    public void setTextOfComment(String textOfComment) {
        this.textOfComment = textOfComment;
    }

    public boolean isHasAttachment() {
        return hasAttachment;
    }

    public void setHasAttachment(boolean hasAttachment) {
        this.hasAttachment = hasAttachment;
    }

    public boolean isGroupsCanPost() {
        return groupsCanPost;
    }

    public void setGroupsCanPost(boolean groupsCanPost) {
        this.groupsCanPost = groupsCanPost;
    }

    public boolean isCanClose() {
        return canClose;
    }

    public void setCanClose(boolean canClose) {
        this.canClose = canClose;
    }

    public boolean isCanOpen() {
        return canOpen;
    }

    public void setCanOpen(boolean canOpen) {
        this.canOpen = canOpen;
    }
}
