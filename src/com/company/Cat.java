package com.company;

public class Cat extends  {

    private boolean likesCatnip;
    private boolean usesLitterBox;
    private String furType;

    public Cat(boolean likesCatnip, boolean usesLitterBox, String furType) {
        this.likesCatnip = likesCatnip;
        this.usesLitterBox = usesLitterBox;
        this.furType = furType;
    }

    public boolean isLikesCatnip() {
        return likesCatnip;
    }

    public void setLikesCatnip(boolean likesCatnip) {
        this.likesCatnip = likesCatnip;
    }

    public boolean isUsesLitterBox() {
        return usesLitterBox;
    }

    public void setUsesLitterBox(boolean usesLitterBox) {
        this.usesLitterBox = usesLitterBox;
    }

    public String getFurType() {
        return furType;
    }

    public void setFurType(String furType) {
        this.furType = furType;
    }

    protected
}