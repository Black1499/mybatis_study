package com.lzx.generator.model;

public class EcsShaidanImg {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_shaidan_img.img_id
     *
     * @mbg.generated
     */
    private Integer imgId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_shaidan_img.shaidan_id
     *
     * @mbg.generated
     */
    private Integer shaidanId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_shaidan_img.image
     *
     * @mbg.generated
     */
    private String image;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_shaidan_img.thumb
     *
     * @mbg.generated
     */
    private String thumb;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_shaidan_img.desc
     *
     * @mbg.generated
     */
    private String desc;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_shaidan_img.img_id
     *
     * @return the value of ecs_shaidan_img.img_id
     *
     * @mbg.generated
     */
    public Integer getImgId() {
        return imgId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_shaidan_img.img_id
     *
     * @param imgId the value for ecs_shaidan_img.img_id
     *
     * @mbg.generated
     */
    public void setImgId(Integer imgId) {
        this.imgId = imgId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_shaidan_img.shaidan_id
     *
     * @return the value of ecs_shaidan_img.shaidan_id
     *
     * @mbg.generated
     */
    public Integer getShaidanId() {
        return shaidanId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_shaidan_img.shaidan_id
     *
     * @param shaidanId the value for ecs_shaidan_img.shaidan_id
     *
     * @mbg.generated
     */
    public void setShaidanId(Integer shaidanId) {
        this.shaidanId = shaidanId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_shaidan_img.image
     *
     * @return the value of ecs_shaidan_img.image
     *
     * @mbg.generated
     */
    public String getImage() {
        return image;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_shaidan_img.image
     *
     * @param image the value for ecs_shaidan_img.image
     *
     * @mbg.generated
     */
    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_shaidan_img.thumb
     *
     * @return the value of ecs_shaidan_img.thumb
     *
     * @mbg.generated
     */
    public String getThumb() {
        return thumb;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_shaidan_img.thumb
     *
     * @param thumb the value for ecs_shaidan_img.thumb
     *
     * @mbg.generated
     */
    public void setThumb(String thumb) {
        this.thumb = thumb == null ? null : thumb.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_shaidan_img.desc
     *
     * @return the value of ecs_shaidan_img.desc
     *
     * @mbg.generated
     */
    public String getDesc() {
        return desc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_shaidan_img.desc
     *
     * @param desc the value for ecs_shaidan_img.desc
     *
     * @mbg.generated
     */
    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }
}