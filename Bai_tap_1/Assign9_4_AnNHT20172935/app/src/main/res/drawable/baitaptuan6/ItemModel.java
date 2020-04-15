package com.andeptrai.baitaptuan6;

public class ItemModel {

    String label;
    int thumbnailResource;
    int imageId;

    public ItemModel(String label, int thumbnailResource, int imageId) {
        this.label = label;
        this.thumbnailResource = thumbnailResource;
        this.imageId = imageId;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public int getThumbnailResource() {
        return thumbnailResource;
    }

    public void setThumbnailResource(int thumbnailResource) {
        this.thumbnailResource = thumbnailResource;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }
}
