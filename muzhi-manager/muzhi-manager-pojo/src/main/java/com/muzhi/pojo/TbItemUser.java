package com.muzhi.pojo;

public class TbItemUser {
    private Long itemId;

    private Long userId;

    private String userPicture;

    private Long shareCount;

    private Long collection;

    private Long likeCount;

    private Byte isHurtPush;

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserPicture() {
        return userPicture;
    }

    public void setUserPicture(String userPicture) {
        this.userPicture = userPicture == null ? null : userPicture.trim();
    }

    public Long getShareCount() {
        return shareCount;
    }

    public void setShareCount(Long shareCount) {
        this.shareCount = shareCount;
    }

    public Long getCollection() {
        return collection;
    }

    public void setCollection(Long collection) {
        this.collection = collection;
    }

    public Long getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(Long likeCount) {
        this.likeCount = likeCount;
    }

    public Byte getIsHurtPush() {
        return isHurtPush;
    }

    public void setIsHurtPush(Byte isHurtPush) {
        this.isHurtPush = isHurtPush;
    }
}