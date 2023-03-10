class Room {
    double height;
    double length;
    double width;
    String color;
    int apertures;

    double getVol() {
        double vol = length * height * width;
        return vol;
    }
    
    double getFArea() {
        double farea = length * width;
        return farea;
    }
}