package com.codegym.model;

public class Product {
        private int idProduct;
        private String nameProduct;
        private Double priceProduct;
        private String imgProduct;

        public Product(int idProduct, String nameProduct, Double priceProduct, String imgProduct) {
            this.idProduct = idProduct;
            this.nameProduct = nameProduct;
            this.priceProduct = priceProduct;
            this.imgProduct = imgProduct;
        }

        public Product() {
        }

        public int getIdProduct() {
            return idProduct;
        }

        public void setIdProduct(int idProduct) {
            this.idProduct = idProduct;
        }

        public String getNameProduct() {
            return nameProduct;
        }

        public void setNameProduct(String nameProduct) {
            this.nameProduct = nameProduct;
        }

        public Double getPriceProduct() {
            return priceProduct;
        }

        public void setPriceProduct(Double priceProduct) {
            this.priceProduct = priceProduct;
        }

        public String getImgProduct() {
            return imgProduct;
        }

        public void setImgProduct(String imgProduct) {
            this.imgProduct = imgProduct;
        }
    }
