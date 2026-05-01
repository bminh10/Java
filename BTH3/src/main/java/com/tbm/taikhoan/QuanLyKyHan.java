/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tbm.taikhoan;

/**
 *
 * @author Admin
 */
public class QuanLyKyHan {
    public static enum KyHan {
        MOT_TUAN("Mot tuan"), 
        MOT_THANG("Mot thang"), 
        MOT_NAM("Mot nam");
        
        private String description;

        private KyHan(String description) {
            this.description = description;
        }

        /**
         * @return the description
         */
        public String getDescription() {
            return description;
        }

        /**
         * @param description the description to set
         */
        public void setDescription(String description) {
            this.description = description;
        }
    }
}
