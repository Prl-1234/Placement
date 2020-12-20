package com.example.placement;

import androidx.appcompat.app.AppCompatActivity;

public class Job_Student  {
    private String name;
    private int mImageResourceId=NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED=-1;
    private String lastDate;
    private boolean applied;
    private boolean selected;
    private String Description;
    private String user_id_student;
    private String document_id_company;
    private boolean rejected;

    public Job_Student(String name, int mImageResourceId, String lastDate, boolean applied, boolean selected, String description, String user_id_student, String document_id_company, boolean rejected) {
        this.name = name;
        this.mImageResourceId = mImageResourceId;
        this.lastDate = lastDate;
        this.applied = applied;
        this.selected = selected;
        Description = description;
        this.user_id_student = user_id_student;
        this.document_id_company = document_id_company;
        this.rejected = rejected;
    }

    public Job_Student() {

    }

    public String getDocument_id_company() {
        return document_id_company;
    }

    public void setDocument_id_company(String document_id_company) {
        this.document_id_company = document_id_company;
    }

    public String getUser_id_student() {
        return user_id_student;
    }

    public void setUser_id_student(String user_id_student) {
        this.user_id_student = user_id_student;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }

    public void setmImageResourceId(int mImageResourceId) {
        this.mImageResourceId = mImageResourceId;
    }

    public static int getNoImageProvided() {
        return NO_IMAGE_PROVIDED;
    }

    public String getLastDate() {
        return lastDate;
    }

    public void setLastDate(String lastDate) {
        this.lastDate = lastDate;
    }

    public boolean isApplied() {
        return applied;
    }

    public void setApplied(boolean applied) {
        this.applied = applied;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public boolean isRejected() {
        return rejected;
    }

    public void setRejected(boolean rejected) {
        this.rejected = rejected;
    }
    public boolean hasImage(){
        return mImageResourceId!=NO_IMAGE_PROVIDED;
    }
}