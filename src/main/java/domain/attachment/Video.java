package domain.attachment;

public class Video {
    private int id;
    private int ownerId;
    private String title;
    private String description;
    private int duration;
    private String photo130;
    private String photo320;
    private String photo640;
    private String photo800;
    private String photo1280;
    private String firstFrame130;
    private String firstFrame320;
    private String firstFrame640;
    private String firstFrame800;
    private String firstFrame1280;
    private int date;
    private int addingDate;
    private int views;
    private int comments;
    private String player;
    private String platform;
    private boolean canEdit;
    private boolean canAdd;
    private boolean isPrivate;
    private String accessKey;
    private boolean processing;
    private boolean live;
    private boolean upcoming;
    private boolean isFavorite;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getPhoto130() {
        return photo130;
    }

    public void setPhoto130(String photo130) {
        this.photo130 = photo130;
    }

    public String getPhoto320() {
        return photo320;
    }

    public void setPhoto320(String photo320) {
        this.photo320 = photo320;
    }

    public String getPhoto640() {
        return photo640;
    }

    public void setPhoto640(String photo640) {
        this.photo640 = photo640;
    }

    public String getPhoto800() {
        return photo800;
    }

    public void setPhoto800(String photo800) {
        this.photo800 = photo800;
    }

    public String getPhoto1280() {
        return photo1280;
    }

    public void setPhoto1280(String photo1280) {
        this.photo1280 = photo1280;
    }

    public String getFirstFrame130() {
        return firstFrame130;
    }

    public void setFirstFrame130(String firstFrame130) {
        this.firstFrame130 = firstFrame130;
    }

    public String getFirstFrame320() {
        return firstFrame320;
    }

    public void setFirstFrame320(String firstFrame320) {
        this.firstFrame320 = firstFrame320;
    }

    public String getFirstFrame640() {
        return firstFrame640;
    }

    public void setFirstFrame640(String firstFrame640) {
        this.firstFrame640 = firstFrame640;
    }

    public String getFirstFrame800() {
        return firstFrame800;
    }

    public void setFirstFrame800(String firstFrame800) {
        this.firstFrame800 = firstFrame800;
    }

    public String getFirstFrame1280() {
        return firstFrame1280;
    }

    public void setFirstFrame1280(String firstFrame1280) {
        this.firstFrame1280 = firstFrame1280;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getAddingDate() {
        return addingDate;
    }

    public void setAddingDate(int addingDate) {
        this.addingDate = addingDate;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getComments() {
        return comments;
    }

    public void setComments(int comments) {
        this.comments = comments;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public boolean isCanEdit() {
        return canEdit;
    }

    public void setCanEdit(boolean canEdit) {
        this.canEdit = canEdit;
    }

    public boolean isCanAdd() {
        return canAdd;
    }

    public void setCanAdd(boolean canAdd) {
        this.canAdd = canAdd;
    }

    public boolean isPrivate() {
        return isPrivate;
    }

    public void setPrivate(boolean aPrivate) {
        isPrivate = aPrivate;
    }

    public String getAccessKey() {
        return accessKey;
    }

    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

    public boolean isProcessing() {
        return processing;
    }

    public void setProcessing(boolean processing) {
        this.processing = processing;
    }

    public boolean isLive() {
        return live;
    }

    public void setLive(boolean live) {
        this.live = live;
    }

    public boolean isUpcoming() {
        return upcoming;
    }

    public void setUpcoming(boolean upcoming) {
        this.upcoming = upcoming;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }
}
