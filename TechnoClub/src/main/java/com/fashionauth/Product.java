package com.fashionauth;

public class Product {
    private String name;
    private String imageUrl;
    private double price;

    private String style; 
    private String colorMatch; 
    private double trendScore;
    private String occasion; 
    private String verdict; 

    public Product(String name, String imageUrl, double price) {
        this.name = name;
        this.imageUrl = imageUrl;
        this.price = price;
    }

    public String getName() { return name; }
    public String getImageUrl() { return imageUrl; }
    public double getPrice() { return price; }
    public String getStyle() { return style; }
    public void setStyle(String style) { this.style = style; }
    public String getColorMatch() { return colorMatch; }
    public void setColorMatch(String colorMatch) { this.colorMatch = colorMatch; }
    public double getTrendScore() { return trendScore; }
    public void setTrendScore(double trendScore) { this.trendScore = trendScore; }
    public String getOccasion() { return occasion; }
    public void setOccasion(String occasion) { this.occasion = occasion; }
    public String getVerdict() { return verdict; }
    public void setVerdict(String verdict) { this.verdict = verdict; }
}
