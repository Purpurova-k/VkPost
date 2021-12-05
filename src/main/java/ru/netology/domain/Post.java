package ru.netology.domain;

public class Post {
    // Класс Header и класс Body не нужны, собираем всю информацию в одном классе Post,
    // при этом отдельно созданные классы нужно хранить в полях класса Post, сохраняя типы этих классов

    private String idOfPost;
    private String date;
    private String text;
    private boolean isFixed;


    // Не хватало полей
    // Идентификатор владельца стены, на которой размещена запись
    private int ownerId;

    // Идентификатор автора записи (от чьего имени опубликована запись)
    private int fromId;

    // Идентификатор администратора, который опубликовал запись
    private int createdBy;

    // Идентификатор администратора, который опубликовал запись
    private int replyOwnerId;

    // Идентификатор записи, в ответ на которую была оставлена текущая
    private int replyPostId;

    // True, если запись была создана с опцией «Только для друзей» (разрабы вк делают через integer)
    private boolean friendsOnly;

    // Тип записи, может принимать следующие значения: post, copy, reply, postpone, suggest
    private String postType;

    // Идентификатор автора, если запись была опубликована от имени сообщества и подписана пользователем
    private int signerId;

    // true, если ли текущий пользователь может закрепить запись
    private boolean canFix;

    // true, если текущий пользователь может удалить запись
    private boolean canDelete;

    // true, если текущий пользователь может редактировать запись
    private boolean canEdit;

    // true, если запись отметку "реклама"
    private boolean markedAsAds;

    // true, если объект добавлен в закладки у текущего пользователя
    private boolean isFavorite;

    //Идентификатор отложенной записи. Это поле возвращается тогда, когда запись стояла на таймере.
    private int postponedId;



    // Далее поля, которые хранят информацию об отдельных классах
    private CommentsInfo commentsInfo;
    private Copyright copyright;
    private LikesInfo likesInfo;
    private Repost repost;
    private Viewings viewings;
    private PostSource postSource;
    private Geo geo;
    private Donut donut;



    // Getters and setters
    public String getIdOfPost() {
        return idOfPost;
    }

    public void setIdOfPost(String idOfPost) {
        this.idOfPost = idOfPost;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isFixed() {
        return isFixed;
    }

    public void setFixed(boolean fixed) {
        isFixed = fixed;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public int getFromId() {
        return fromId;
    }

    public void setFromId(int fromId) {
        this.fromId = fromId;
    }

    public int getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    public int getReplyOwnerId() {
        return replyOwnerId;
    }

    public void setReplyOwnerId(int replyOwnerId) {
        this.replyOwnerId = replyOwnerId;
    }

    public int getReplyPostId() {
        return replyPostId;
    }

    public void setReplyPostId(int replyPostId) {
        this.replyPostId = replyPostId;
    }

    public boolean isFriendsOnly() {
        return friendsOnly;
    }

    public void setFriendsOnly(boolean friendsOnly) {
        this.friendsOnly = friendsOnly;
    }

    public String getPostType() {
        return postType;
    }

    public void setPostType(String postType) {
        this.postType = postType;
    }

    public int getSignerId() {
        return signerId;
    }

    public void setSignerId(int signerId) {
        this.signerId = signerId;
    }

    public boolean isCanFix() {
        return canFix;
    }

    public void setCanFix(boolean canFix) {
        this.canFix = canFix;
    }

    public boolean isCanDelete() {
        return canDelete;
    }

    public void setCanDelete(boolean canDelete) {
        this.canDelete = canDelete;
    }

    public boolean isCanEdit() {
        return canEdit;
    }

    public void setCanEdit(boolean canEdit) {
        this.canEdit = canEdit;
    }

    public boolean isMarkedAsAds() {
        return markedAsAds;
    }

    public void setMarkedAsAds(boolean markedAsAds) {
        this.markedAsAds = markedAsAds;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }

    public int getPostponedId() {
        return postponedId;
    }

    public void setPostponedId(int postponedId) {
        this.postponedId = postponedId;
    }

    public CommentsInfo getCommentsInfo() {
        return commentsInfo;
    }

    public void setCommentsInfo(CommentsInfo commentsInfo) {
        this.commentsInfo = commentsInfo;
    }

    public Copyright getCopyright() {
        return copyright;
    }

    public void setCopyright(Copyright copyright) {
        this.copyright = copyright;
    }

    public LikesInfo getLikesInfo() {
        return likesInfo;
    }

    public void setLikesInfo(LikesInfo likesInfo) {
        this.likesInfo = likesInfo;
    }

    public Repost getRepost() {
        return repost;
    }

    public void setRepost(Repost repost) {
        this.repost = repost;
    }

    public Viewings getViewings() {
        return viewings;
    }

    public void setViewings(Viewings viewings) {
        this.viewings = viewings;
    }

    public PostSource getPostSource() {
        return postSource;
    }

    public void setPostSource(PostSource postSource) {
        this.postSource = postSource;
    }

    public Geo getGeo() {
        return geo;
    }

    public void setGeo(Geo geo) {
        this.geo = geo;
    }

    public Donut getDonut() {
        return donut;
    }

    public void setDonut(Donut donut) {
        this.donut = donut;
    }
}
